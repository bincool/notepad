/**
* @FileName: MenuFile.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuFile.java: �ļ������˵�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import xyz.wchy.action.file.FileExitAction;
import xyz.wchy.action.file.FileNewAction;
import xyz.wchy.action.file.FileOpenAction;
import xyz.wchy.action.file.FilePagePrintAction;
import xyz.wchy.action.file.FilePageSetAction;
import xyz.wchy.action.file.FileSaveAction;
import xyz.wchy.action.file.FileSaveAsAction;
import xyz.wchy.constant.NodePadConstant;
import xyz.wchy.menu.base.MenuBase;

/**
* @ClassName: MenuFile.java
* 
* @Description: 
* <p>
* �ļ������˵����½����򿪡����桢���Ϊ��ҳ�����á���ӡ���˳�.
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
* @Date: 2018��1��15�� ����10:29:40.
* 
*/
public class MenuFile extends MenuBase 
{
	
	/**
	 * һ���˵����ļ�(F).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_FILE);
	
	/**
	 * �����˵����½�(N).
	 */
	private JMenuItem menuFileNew = domain.getMenuFileNew();
	
	/**
	 * �����˵�����(O).
	 */
	private JMenuItem menuFileOpen = domain.getMenuFileOpen();
	
	/**
	 * �����˵�������(S).
	 */
	private JMenuItem menuFileSave = domain.getMenuFileSave();
	
	/**
	 * �����˵������Ϊ(A).
	 */
	private JMenuItem menuFileSaveAs = domain.getMenuFileSaveAs();
	
	/**
	 * �����˵���ҳ������(U).
	 */
	private JMenuItem menuFilePageSet = domain.getMenuFilePageSet();
	
	/**
	 * �����˵�����ӡ(P).
	 */
	private JMenuItem menuFilePagePrint = domain.getMenuFilePagePrint();
	
	/**
	 * �����˵����˳�(X).
	 */
	private JMenuItem menuFileExit = domain.getMenuFileExit();
	
	/**
	 * ���캯������ʼ���˵���Ϣ.
	 */
	public MenuFile() 
	{
		initMenu();
		bindActionListener();
	}
	
	/**
	 * ��ȡmenu.
	 * @return
	 *     menu.
	 */
	public JMenu getMenu() 
	{
		return menu;
	}
	
	/* (non-Javadoc)
	 * @see xyz.wchy.menu.base.MenuBase#initMenu()
	 */
	@Override
	protected void initMenu() 
	{
		menu.setMnemonic(KeyEvent.VK_F);
		
		menu.add(menuFileNew);
		menuFileNew.setMnemonic(KeyEvent.VK_N);
		menuFileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		
		menu.add(menuFileOpen);
		menuFileOpen.setMnemonic(KeyEvent.VK_O);
		menuFileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		
		menu.add(menuFileSave);
		menuFileSave.setMnemonic(KeyEvent.VK_S);
		menuFileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		
		menu.add(menuFileSaveAs);
		menuFileSaveAs.setMnemonic(KeyEvent.VK_A);
		
		menu.addSeparator();
		
		menu.add(menuFilePageSet);
		menuFilePageSet.setMnemonic(KeyEvent.VK_U);
		
		menu.add(menuFilePagePrint);
		menuFilePagePrint.setMnemonic(KeyEvent.VK_P);
		menuFilePagePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		
		menu.addSeparator();
		
		menu.add(menuFileExit);
		menuFileExit.setMnemonic(KeyEvent.VK_X);
		
	}
	
	/* (non-Javadoc)
	 * @see xyz.wchy.menu.base.MenuBase#initMenu()
	 */
	@Override
	protected void bindActionListener() 
	{
		menuFileNew.addActionListener(new FileNewAction());
		menuFileOpen.addActionListener(new FileOpenAction());
		menuFileSave.addActionListener(new FileSaveAction());
		menuFileSaveAs.addActionListener(new FileSaveAsAction());
		menuFilePageSet.addActionListener(new FilePageSetAction());
		menuFilePagePrint.addActionListener(new FilePagePrintAction());
		menuFileExit.addActionListener(new FileExitAction());
	}
	
}
