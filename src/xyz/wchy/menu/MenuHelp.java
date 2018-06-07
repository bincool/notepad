/**
* @FileName: MenuHelp.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuHelp.java: 帮助操作菜单.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 帮助操作菜单：帮助(H)、查看帮助(H)、关于记事本(A).
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
* @Date: 2018年1月15日 下午11:30:18.
* 
*/
public class MenuHelp extends MenuBase 
{
	
	/**
	 * 帮助菜单.
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_HELP);
	
	/**
	 * 二级菜单，查看帮助(H).
	 */
	private JMenuItem menuHelpView = domain.getMenuHelpView();
	
	/**
	 * 二级菜单，关于记事本(A).
	 */
	private JMenuItem menuHelpAboutNotepad = domain.getMenuHelpAboutNotepad();
	
	/**
	 * 构造函数.
	 */
	public MenuHelp() 
	{
		initMenu();
		bindActionListener();
	}

	/**
	 * 获取menu.
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
