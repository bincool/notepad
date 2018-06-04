/**
* @FileName: NotePad.java
* @Package: xyz.wchy
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: NotePad.java: 记事本.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy;

import xyz.wchy.menu.MenuMain;
import xyz.wchy.textarea.TextPane;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.Logger;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
* @ClassName: NotePad.java
* 
* @Description: 
* <p>
* 记事本启动.
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
* @Date: 2018年1月15日 下午9:05:03.
* 
*/
public class NotePad 
{
	
	/**
	 * 领域对象.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();

	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger();
	
	/**
	 * 主窗体.
	 */
	private JFrame frame;
	
	/**
	 * Create the application.
	 */
	public NotePad() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		// 初始化领域对象.
        domain.initDomain();
        
		// 菜单栏：文件操作菜单、编辑操作菜单、格式操作菜单、查看操作菜单、帮助操作菜单.
		MenuMain menuMain = new MenuMain();
		
		// 获取带滚动条的文本域.
		TextPane textPane = domain.getTextPane();
		JScrollPane scrollPane = textPane.getScrollPane();
		
		// 状态栏.
		JToolBar toolState = domain.getToolState();
		
		// 设置状态栏.
		toolState.setVisible(true);
        toolState.setFloatable(false);
        toolState.setPreferredSize(new Dimension(textPane.getTextArea().getSize().width, 20));
        DomainHelper.getInstance().setToolState(toolState);
        
		// 主窗体.
        frame = domain.getFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\icon.png"));
		frame.setTitle("Notepad");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.setJMenuBar(menuMain.getMenuBar());
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(toolState, BorderLayout.SOUTH);
	}

	/**
	 * 主方法.
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					// 设置对话框的风格.
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					// 创建一个记事本对象.
					NotePad window = new NotePad();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					LOGGER.error(NotePad.class, e);
				}
			}
		});
	}
	
}
