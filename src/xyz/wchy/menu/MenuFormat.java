/**
* @FileName: MenuFormat.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: MenuFormat.java: 格式操作菜单.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 格式操作菜单：格式(O)、自动换行(W)、字体(F).
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
* @Date: 2018年1月15日 下午11:29:39.
* 
*/
public class MenuFormat extends MenuBase 
{
	
	/**
	 * 一级菜单，格式(O).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_FORMAT);
	
	/**
	 * 二级菜单，自动换行(W).
	 */
	private JMenuItem menuFormatWrap = domain.getMenuFormatWrap();
	
	/**
	 * 二级菜单，字体(F).
	 */
	private JMenuItem menuFormatFont = domain.getMenuFormatFont();
	
	/**
	 * 构造函数.
	 */
	public MenuFormat() 
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
