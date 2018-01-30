/**
* @FileName: HelpAboutDialog.java
* @Package: xyz.wchy.dialog.help
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: HelpAboutDialog.java: 帮助操作菜单-关于记事本对话框.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.dialog.help;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import xyz.wchy.action.dialog.CancelAction;
import xyz.wchy.dialog.base.BaseDialog;

/**
* @ClassName: HelpAboutDialog.java
* 
* @Description: 
* <p>
* 帮助操作菜单-关于记事本对话框.
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
* @Date: 2018年1月24日 下午5:02:51.
* 
*/
public class HelpAboutDialog extends BaseDialog
{
	
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 关于记事本对话框单例类.
	 */
	private static HelpAboutDialog instance = null;
	
	/**
	 * 容器panel.
	 */
	private static final JPanel panel = new JPanel();
	
	/**
	 * 关于文本内容.
	 */
	private static final String about = "<html><body>NotePad<br>Version：1.0<br>QQ：891946049<br><body></html>";
	
	/**
	 * 关于label.
	 */
	private static final JLabel label = new JLabel(about, JLabel.CENTER);
	
	/**
	 * 字体.
	 */
	private static final Font font = new Font(Font.DIALOG, Font.PLAIN, 16);
	
	/**
	 * 确定按钮.
	 */
	private static final JButton button = new JButton("确定");
	
	/**
	 * 屏幕大小.
	 */
	private static final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 * 对话框宽.
	 */
	private static final int width = (int) dimension.getWidth();
	
	/**
	 * 对话框高.
	 */
	private static final int hight = (int) dimension.getHeight();
	
	/**
	 * 有参构造函数.
	 * @param owner
	 */
	private HelpAboutDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * 获取关于记事本对话框单例对象.
	 * @param owner
	 * @return
	 */
	public static HelpAboutDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new HelpAboutDialog(owner);
			
			instance.setVisible(false);
			instance.setModal(true);
			
			button.addActionListener(new CancelAction(instance));
		}
		return instance;
	}
	
	/**
     * 初始化对话框页面.
     */
	@Override
	public void initDialog() 
    {
		panel.add(button);
        label.setFont(font);
        this.add(label, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        
        this.setLocation(width / 4, hight / 4);
        this.setTitle("Help And Support");
        this.setSize(290,170);
        this.setVisible(true);
	}

}
