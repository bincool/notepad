/**
* @FileName: MenuView.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: MenuView.java: 查看操作菜单.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 格式操作菜单：查看(V)、状态栏(S).
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
* @Date: 2018年1月15日 下午11:29:55.
* 
*/
public class MenuView extends MenuBase 
{
	
	/**
	 * 一级菜单，查看(V).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_VIEW);
	
	/**
	 * 二级菜单，状态栏(S).
	 */
	private JMenuItem menuViewStatusBar = domain.getMenuViewStatusBar();
	
	/**
	 * 构造函数.
	 */
	public MenuView() 
	{
		// 初始化菜单.
		initMenu();
		
		// 绑定事件.
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
