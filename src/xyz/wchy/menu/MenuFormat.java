/**
* @FileName: MenuFormat.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: MenuFormat.java: ��ʽ�����˵�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import xyz.wchy.action.format.FormatFontAction;
import xyz.wchy.action.format.FormatWrapAction;
import xyz.wchy.constant.NodePadConstant;
import xyz.wchy.menu.base.MenuBase;

/**
* @ClassName: MenuFormat.java
* 
* @Description: 
* <p>
* ��ʽ�����˵�����ʽ(O)���Զ�����(W)������(F).
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
* @Date: 2018��1��15�� ����11:29:39.
* 
*/
public class MenuFormat extends MenuBase 
{
	
	/**
	 * һ���˵�����ʽ(O).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_FORMAT);
	
	/**
	 * �����˵����Զ�����(W).
	 */
	private JMenuItem menuFormatWrap = domain.getMenuFormatWrap();
	
	/**
	 * �����˵�������(F).
	 */
	private JMenuItem menuFormatFont = domain.getMenuFormatFont();
	
	/**
	 * ���캯��.
	 */
	public MenuFormat() 
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
		menu.setMnemonic(KeyEvent.VK_O);
		
		menu.add(menuFormatWrap);
		menuFormatWrap.setMnemonic(KeyEvent.VK_W);
		
		menu.add(menuFormatFont);
		menuFormatFont.setMnemonic(KeyEvent.VK_F);
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.menu.base.MenuBase#bindActionListener()
	 */
	@Override
	protected void bindActionListener() 
	{
		menuFormatWrap.addActionListener(new FormatWrapAction());
		menuFormatFont.addActionListener(new FormatFontAction());
	}
	
}
