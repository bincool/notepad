/**
* @FileName: EditReplaceDialog.java
* @Package: xyz.wchy.dialog.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditReplaceDialog.java: 编辑替换对话框.
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
import java.awt.GridLayout;

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
import xyz.wchy.action.dialog.ReplaceAction;
import xyz.wchy.action.dialog.ReplaceAllAction;
import xyz.wchy.dialog.base.BaseDialog;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditReplaceDialog.java
* 
* @Description: 
* <p>
* 编辑替换对话框.
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
* @Date: 2018年1月25日 下午4:56:43.
* 
*/
public class EditReplaceDialog extends BaseDialog 
{
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 查找对话框单例类.
	 */
	private static EditReplaceDialog instance = null;
	
	/**
	 * 查找内容(N).
	 */
	private static final JLabel searchContentLabel = new JLabel("查找内容(N) :");  
	
	/**
	 * 替换为(P).
	 */
	private static final JLabel replaceContentLabel = new JLabel("替换为(P)　 :");  
	
	/**
	 * 查找下一个(F).
	 */
	private static final JButton searchNext = new JButton("查找下一个(F)");  
	
	/**
	 * 替换(R).
	 */
	private static final JButton replace = new JButton("替换(R)");  
	
	/**
	 * 全部替换(A).
	 */
	private static final JButton replaceAll = new JButton("全部替换(A)");
	
	/**
	 * 取消.
	 */
	private static final JButton cancel = new JButton("取消"); 
    
	/**
	 * 底部panel.
	 */ 
	private static final JPanel bottomPanel = new JPanel();  
	
	/**
	 * 中部panel.
	 */
	private static final JPanel centerPanel = new JPanel();  
	
	/**
	 * 顶部panel.
	 */
	private static final JPanel topPanel = new JPanel();  

	/**
	 * 单选选择组.
	 */
	private static final JPanel direction = new JPanel(); 
	
	/**
	 * 替换panel.
	 */
	private static final JPanel replacePanel = new JPanel();
	
	/**
	 * 单选按钮组.
	 */
	private static final ButtonGroup bGroup = new ButtonGroup();
	
	/**
	 * 领域对象.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();
	
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
	 * 替换编辑框.
	 */
	private static final JTextField replaceText = domain.getReplaceText();
	
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
	
	/**
	 * 有参构造函数.
	 * @param owner
	 */
	private EditReplaceDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * 获取关于记事本对话框单例对象.
	 * @param owner
	 * @return
	 */
	public static EditReplaceDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new EditReplaceDialog(owner);
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
         
        down.setSelected(true);  
        bGroup.add(up);  
        bGroup.add(down);  
        
        searchNext.setPreferredSize(new Dimension(110, 22));  
        replace.setPreferredSize(new Dimension(110, 22));  
        replaceAll.setPreferredSize(new Dimension(110, 22));  
        // "替换"按钮的事件处理  
        replace.addActionListener(new ReplaceAction());  
  
        // "替换全部"按钮的事件处理  
        replaceAll.addActionListener(new ReplaceAllAction());
  
        // "查找下一个"按钮事件处理  
        searchNext.addActionListener(FindAction.getInstance());
        // "取消"按钮及事件处理  
         
        cancel.setPreferredSize(new Dimension(110, 22));  
        cancel.addActionListener(new CancelAction(findDialog));  
  
         
        direction.setBorder(BorderFactory.createTitledBorder("方向 "));  
        direction.add(up);  
        direction.add(down);  
        direction.setPreferredSize(new Dimension(170, 60));  
        
        replacePanel.setLayout(new GridLayout(2, 1));  
        replacePanel.add(replace);  
        replacePanel.add(replaceAll);  
  
        topPanel.add(searchContentLabel);  
        topPanel.add(findText);  
        topPanel.add(searchNext);  
        centerPanel.add(replaceContentLabel);  
        centerPanel.add(replaceText);  
        centerPanel.add(replacePanel);  
        bottomPanel.add(matchCase);  
        bottomPanel.add(direction);  
        bottomPanel.add(cancel);  
  
        container.add(topPanel);  
        container.add(centerPanel);  
        container.add(bottomPanel);  
  
        // 设置"查找与替换"对话框的大小、可更改大小(否)、位置和可见性  
        findDialog.setSize(410, 210);  
        findDialog.setResizable(false);  
        findDialog.setLocation(230, 280);  
        findDialog.setVisible(true);
    }
}
