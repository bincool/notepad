/**
* @FileName: MenuView.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: MenuView.java: �鿴�����˵�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import xyz.wchy.action.view.ViewStatusBarAction;
import xyz.wchy.constant.NodePadConstant;
import xyz.wchy.menu.base.MenuBase;

/**
* @ClassName: MenuView.java
* 
* @Description: 
* <p>
* ��ʽ�����˵����鿴(V)��״̬��(S).
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
* @Date: 2018��1��15�� ����11:29:55.
* 
*/
public class MenuView extends MenuBase 
{
	
	/**
	 * һ���˵����鿴(V).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_VIEW);
	
	/**
	 * �����˵���״̬��(S).
	 */
	private JMenuItem menuViewStatusBar = domain.getMenuViewStatusBar();
	
	/**
	 * ���캯��.
	 */
	public MenuView() 
	{
		// ��ʼ���˵�.
		initMenu();
		
		// ���¼�.
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
		menu.setMnemonic(KeyEvent.VK_V);
		
		menu.add(menuViewStatusBar);
		menuViewStatusBar.setMnemonic(KeyEvent.VK_S);
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.menu.base.MenuBase#bindActionListener()
	 */
	@Override
	protected void bindActionListener() 
	{
		menuViewStatusBar.addActionListener(new ViewStatusBarAction());
	}
	
}
