/**
* @FileName: MenuFile.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuFile.java: 文件操作菜单.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 文件操作菜单：新建、打开、保存、另存为、页面设置、打印、退出.
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
* @Date: 2018年1月15日 下午10:29:40.
* 
*/
public class MenuFile extends MenuBase 
{
	
	/**
	 * 一级菜单，文件(F).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_FILE);
	
	/**
	 * 二级菜单，新建(N).
	 */
	private JMenuItem menuFileNew = domain.getMenuFileNew();
	
	/**
	 * 二级菜单，打开(O).
	 */
	private JMenuItem menuFileOpen = domain.getMenuFileOpen();
	
	/**
	 * 二级菜单，保存(S).
	 */
	private JMenuItem menuFileSave = domain.getMenuFileSave();
	
	/**
	 * 二级菜单，另存为(A).
	 */
	private JMenuItem menuFileSaveAs = domain.getMenuFileSaveAs();
	
	/**
	 * 二级菜单，页面设置(U).
	 */
	private JMenuItem menuFilePageSet = domain.getMenuFilePageSet();
	
	/**
	 * 二级菜单，打印(P).
	 */
	private JMenuItem menuFilePagePrint = domain.getMenuFilePagePrint();
	
	/**
	 * 二级菜单，退出(X).
	 */
	private JMenuItem menuFileExit = domain.getMenuFileExit();
	
	/**
	 * 构造函数，初始化菜单信息.
	 */
	public MenuFile() 
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
