/**
* @FileName: MenuMain.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuMain.java: ���±��˵�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.menu;

import javax.swing.JMenuBar;

/**
* @ClassName: MenuMain.java
* 
* @Description: 
* <p>
* ���±��˵�.
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
* @Date: 2018��1��24�� ����11:22:54.
* 
*/
public class MenuMain 
{
	
	/**
	 * �˵���.
	 */
	private JMenuBar menuBar = new JMenuBar();
	
	/**
	 * �ļ������˵�.
	 */
	private MenuFile menuFile = new MenuFile();
	
	/**
	 * �༭�����˵�.
	 */
	private MenuEdit menuEdit = new MenuEdit();
	
	/**
	 * ��ʽ�����˵�.
	 */
	private MenuFormat menuFormat = new MenuFormat();
	
	/**
	 * �鿴�����˵�.
	 */
	private MenuView menuView = new MenuView();
	
	/**
	 * ���������˵�.
	 */
	private MenuHelp menuHelp = new MenuHelp();
	
	/**
	 * ���캯��.
	 */
	public MenuMain() 
	{
		// ���˵�����Ӳ˵�.
		menuBar.add(menuFile.getMenu());
		menuBar.add(menuEdit.getMenu());
		menuBar.add(menuFormat.getMenu());
		menuBar.add(menuView.getMenu());
		menuBar.add(menuHelp.getMenu());
	}

	/**
	 * ��ȡmenuBar.
	 * @return
	 *     menuBar.
	 */
	public JMenuBar getMenuBar() 
	{
		return menuBar;
	}

}
