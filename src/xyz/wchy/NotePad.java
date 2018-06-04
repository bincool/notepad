/**
* @FileName: NotePad.java
* @Package: xyz.wchy
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: NotePad.java: ���±�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* ���±�����.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��1��15�� ����9:05:03.
* 
*/
public class NotePad 
{
	
	/**
	 * �������.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();

	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger();
	
	/**
	 * ������.
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
		// ��ʼ���������.
        domain.initDomain();
        
		// �˵������ļ������˵����༭�����˵�����ʽ�����˵����鿴�����˵������������˵�.
		MenuMain menuMain = new MenuMain();
		
		// ��ȡ�����������ı���.
		TextPane textPane = domain.getTextPane();
		JScrollPane scrollPane = textPane.getScrollPane();
		
		// ״̬��.
		JToolBar toolState = domain.getToolState();
		
		// ����״̬��.
		toolState.setVisible(true);
        toolState.setFloatable(false);
        toolState.setPreferredSize(new Dimension(textPane.getTextArea().getSize().width, 20));
        DomainHelper.getInstance().setToolState(toolState);
        
		// ������.
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
	 * ������.
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
					// ���öԻ���ķ��.
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					// ����һ�����±�����.
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
