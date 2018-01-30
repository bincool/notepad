/**
* @FileName: MenuEdit.java
* @Package: xyz.wchy.menu
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: MenuEdit.java: �༭�����˵�.
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

import xyz.wchy.action.dialog.ReplaceAction;
import xyz.wchy.action.edit.EditAllAction;
import xyz.wchy.action.edit.EditCopyAction;
import xyz.wchy.action.edit.EditDateAction;
import xyz.wchy.action.edit.EditDeleteAction;
import xyz.wchy.action.edit.EditFindAction;
import xyz.wchy.action.edit.EditGotoAction;
import xyz.wchy.action.edit.EditPasteAction;
import xyz.wchy.action.edit.EditReplaceAction;
import xyz.wchy.action.edit.EditTrimAction;
import xyz.wchy.action.edit.EditUndoAction;
import xyz.wchy.constant.NodePadConstant;
import xyz.wchy.menu.base.MenuBase;

/**
* @ClassName: MenuEdit.java
* 
* @Description: 
* <p>
* �༭�����˵����༭(E)������(U)������(T)������(C)��ճ��(P)��ɾ��(L)������(F)��������һ��(N)���滻(R)��ת��(G)��ȫѡ(A)��ʱ��/����(D).
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
* @Date: 2018��1��15�� ����11:28:47.
* 
*/
public class MenuEdit extends MenuBase
{
	
	/**
	 * һ���˵����༭(E).
	 */
	private JMenu menu = new JMenu(NodePadConstant.MENU_TITLE_EDIT);
	
	/**
	 * �����˵�������(U).
	 */
	private JMenuItem menuEditUndo = domain.getMenuEditUndo();
	
	/**
	 * �����˵�������(T).
	 */
	private JMenuItem menuEditTrim = domain.getMenuEditTrim();
	
	/**
	 * �����˵�������(C).
	 */
	private JMenuItem menuEditCopy = domain.getMenuEditCopy();
	
	/**
	 * �����˵���ճ��(P).
	 */
	private JMenuItem menuEditPaste = domain.getMenuEditPaste();
	
	/**
	 * �����˵���ɾ��(L).
	 */
	private JMenuItem menuEditDelete = domain.getMenuEditDelete();
	
	/**
	 * �����˵�������(F).
	 */
	private JMenuItem menuEditFind = domain.getMenuEditFind();
	
	/**
	 * �����˵���������һ��(N).
	 */
	private JMenuItem menuEditFindNext = domain.getMenuEditFindNext();
	
	/**
	 * �����˵����滻(R).
	 */
	private JMenuItem menuEditReplace = domain.getMenuEditReplace();
	
	/**
	 * �����˵���ת��(G).
	 */
	private JMenuItem menuEditGoto = domain.getMenuEditGoto();
	
	/**
	 * �����˵���ȫѡ(A).
	 */
	private JMenuItem menuEditAll = domain.getMenuEditAll();
	
	/**
	 * �����˵���ʱ��/����(D).
	 */
	private JMenuItem menuEditDate = domain.getMenuEditDate();
	
	/**
	 * ���캯��.
	 */
	public MenuEdit() 
	{
		initMenu();
		bindActionListener();
	}

	/**
	 * ��ȡmenuEdit.
	 * @return
	 *     menuEdit.
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
		menu.setMnemonic(KeyEvent.VK_E);
		
		menu.add(menuEditUndo);
		menuEditUndo.setMnemonic(KeyEvent.VK_U);
		menuEditUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		
		menu.addSeparator();
		
		menu.add(menuEditTrim);
		menuEditTrim.setMnemonic(KeyEvent.VK_T);
		menuEditTrim.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		
		menu.add(menuEditCopy);
		menuEditCopy.setMnemonic(KeyEvent.VK_C);
		menuEditCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		
		menu.add(menuEditPaste);
		menuEditPaste.setMnemonic(KeyEvent.VK_P);
		menuEditPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		
		menu.add(menuEditDelete);
		menuEditDelete.setMnemonic(KeyEvent.VK_L);
		menuEditDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		
		menu.addSeparator();
		
		menu.add(menuEditFind);
		menuEditFind.setMnemonic(KeyEvent.VK_F);
		menuEditFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		
		menu.add(menuEditFindNext);
		menuEditFindNext.setMnemonic(KeyEvent.VK_N);
		menuEditFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		
		menu.add(menuEditReplace);
		menuEditReplace.setMnemonic(KeyEvent.VK_R);
		menuEditReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		
		menu.add(menuEditGoto);
		menuEditGoto.setMnemonic(KeyEvent.VK_G);
		menuEditGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		
		menu.addSeparator();
		
		menu.add(menuEditAll);
		menuEditAll.setMnemonic(KeyEvent.VK_A);
		menuEditAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		
		menu.add(menuEditDate);
		menuEditDate.setMnemonic(KeyEvent.VK_D);
		menuEditDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.menu.base.MenuBase#bindActionListener()
	 */
	@Override
	protected void bindActionListener() 
	{
		menuEditUndo.addActionListener(new EditUndoAction());
		menuEditTrim.addActionListener(new EditTrimAction());
		menuEditCopy.addActionListener(new EditCopyAction());
		menuEditPaste.addActionListener(new EditPasteAction());
		menuEditDelete.addActionListener(new EditDeleteAction());
		menuEditFind.addActionListener(new EditFindAction());
		menuEditFindNext.addActionListener(new ReplaceAction());
		menuEditReplace.addActionListener(new EditReplaceAction());
		menuEditGoto.addActionListener(new EditGotoAction());
		menuEditAll.addActionListener(new EditAllAction());
		menuEditDate.addActionListener(new EditDateAction());
	}
	
}
