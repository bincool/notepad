/**
* @FileName: EditFindDialog.java
* @Package: xyz.wchy.dialog.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditFindDialog.java: 编辑查找对话框.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.dialog.edit;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import xyz.wchy.action.dialog.CancelAction;
import xyz.wchy.action.dialog.FindAction;
import xyz.wchy.dialog.base.BaseDialog;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditFindDialog.java
* 
* @Description: 
* <p>
* 编辑查找对话框.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年1月25日 下午4:39:07.
* 
*/
public class EditFindDialog extends BaseDialog 
{
	
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 领域对象.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * 查找对话框单例类.
	 */
	private static EditFindDialog instance = null;
    
	/**
	 * 查找内容(N).
	 */
	private static final JLabel searchLabel = new JLabel("查找内容(N) :");
    
	/**
	 * 查找下一个(F)
	 */
	private static final JButton searchNext = new JButton("查找下一个(F)");
    
	/**
	 * 取消.
	 */
	private static final JButton cancel = new JButton("取消");
	
	/**
	 * 单选按钮组.
	 */
	private static final ButtonGroup bGroup = new ButtonGroup();
	
	/**
	 * 查找对话框.
	 */
	private static final JDialog findDialog = new JDialog(domain.getFrame(), "查找与替换", true);
	
	/**
	 * 对话框容器.
	 */
	private static final Container container = findDialog.getContentPane();
	
	/**
	 * 查找编辑框.
	 */
	private static final JTextField findText = domain.getFindText();
    
	/**
	 * 大小写选择框.
	 */
	private static final JCheckBox matchCase = domain.getMatchCase();
    
	/**
	 * 向上查找.
	 */
	private static final JRadioButton up = domain.getUp();
    
	/**
	 * 向下查找.
	 */
	private static final JRadioButton down = domain.getDown();
    
    // 创建"查找与替换"对话框的界面  
    JPanel bottomPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel direction = new JPanel();
	
	/**
	 * 有参构造函数.
	 * @param owner
	 */
	private EditFindDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * 获取关于记事本对话框单例对象.
	 * @param owner
	 * @return
	 */
	public static EditFindDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new EditFindDialog(owner);
			instance.setVisible(false);
			instance.setModal(true);
		}
		return instance;
	}
	
	/**
     * 初始化对话框页面.
     */
	@Override
	public void initDialog() 
	{
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        searchNext.setPreferredSize(new Dimension(110, 22));
        cancel.setPreferredSize(new Dimension(110, 22));
        direction.setPreferredSize(new Dimension(170, 61));
        
        topPanel.add(searchLabel);
        topPanel.add(findText);
        topPanel.add(searchNext);
        
        direction.setBorder(BorderFactory.createTitledBorder("方向 "));
        down.setSelected(true);
        bGroup.add(up);
        bGroup.add(down);
        direction.add(up);
        direction.add(down);
        
        bottomPanel.add(matchCase);
        bottomPanel.add(direction);
        bottomPanel.add(cancel);
        
        container.add(topPanel);
        container.add(bottomPanel);
        
        // "查找下一个"按钮事件处理.
        searchNext.addActionListener(FindAction.getInstance());
        
        cancel.addActionListener(new CancelAction(findDialog));
        
        // 设置"查找与替换"对话框的大小、可更改大小(否)、位置和可见性.
        findDialog.setSize(410, 160);
        findDialog.setResizable(false);
        findDialog.setLocation(230, 280);
        findDialog.setVisible(true);
    }

}
