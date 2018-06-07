/**
* @FileName: MenuHelp.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuHelp.java: ���������˵�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import xyz.wchy.action.help.HelpAboutNotepadAction;
import xyz.wchy.action.help.HelpViewAction;
import xyz.wchy.constant.NodePadConstant;
import xyz.wchy.menu.base.MenuBase;

/**
* @ClassName: MenuHelp.java
* 
* @Description: 
* <p>
* ���������˵�������(H)���鿴����(H)�����ڼ��±�(A).
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
* @Date: 2018��1��15�� ����11:30:18.
* 
*/
public class MenuHelp extends MenuBase 
{
	
	/**
	 * �����˵�.
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_HELP);
	
	/**
	 * �����˵����鿴����(H).
	 */
	private JMenuItem menuHelpView = domain.getMenuHelpView();
	
	/**
	 * �����˵������ڼ��±�(A).
	 */
	private JMenuItem menuHelpAboutNotepad = domain.getMenuHelpAboutNotepad();
	
	/**
	 * ���캯��.
	 */
	public MenuHelp() 
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
		menu.setMnemonic(KeyEvent.VK_H);
		
		menu.add(menuHelpView);
		menuHelpView.setMnemonic(KeyEvent.VK_H);
		
		menu.add(menuHelpAboutNotepad);
		menuHelpAboutNotepad.setMnemonic(KeyEvent.VK_A);
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.menu.base.MenuBase#bindActionListener()
	 */
	@Override
	protected void bindActionListener() 
	{
		menuHelpView.addActionListener(new HelpViewAction());
		menuHelpAboutNotepad.addActionListener(new HelpAboutNotepadAction());
	}
	
}
