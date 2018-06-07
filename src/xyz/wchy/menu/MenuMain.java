/**
* @FileName: MenuMain.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuMain.java: 记事本菜单.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.menu;

import javax.swing.JMenuBar;

/**
* @ClassName: MenuMain.java
* 
* @Description: 
* <p>
* 记事本菜单.
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
* @Date: 2018年1月24日 上午11:22:54.
* 
*/
public class MenuMain 
{
	
	/**
	 * 菜单栏.
	 */
	private JMenuBar menuBar = new JMenuBar();
	
	/**
	 * 文件操作菜单.
	 */
	private MenuFile menuFile = new MenuFile();
	
	/**
	 * 编辑操作菜单.
	 */
	private MenuEdit menuEdit = new MenuEdit();
	
	/**
	 * 格式操作菜单.
	 */
	private MenuFormat menuFormat = new MenuFormat();
	
	/**
	 * 查看操作菜单.
	 */
	private MenuView menuView = new MenuView();
	
	/**
	 * 帮助操作菜单.
	 */
	private MenuHelp menuHelp = new MenuHelp();
	
	/**
	 * 构造函数.
	 */
	public MenuMain() 
	{
		// 给菜单栏添加菜单.
		menuBar.add(menuFile.getMenu());
		menuBar.add(menuEdit.getMenu());
		menuBar.add(menuFormat.getMenu());
		menuBar.add(menuView.getMenu());
		menuBar.add(menuHelp.getMenu());
	}

	/**
	 * 获取menuBar.
	 * @return
	 *     menuBar.
	 */
	public JMenuBar getMenuBar() 
	{
		return menuBar;
	}

}
