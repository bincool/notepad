/**
* @FileName: DomainHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: DomainHelper.java: 领域对象帮助类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.undo.UndoManager;

import xyz.wchy.constant.NodePadConstant;
import xyz.wchy.textarea.TextPane;

/**
* @ClassName: DomainHelper.java
* 
* @Description: 
* <p>
* 领域对象帮助类：文本域、iframe、....
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
* @Date: 2018年1月19日 下午1:38:59.
* 
*/
public class DomainHelper 
{
	
	/**
	 * 主窗体.
	 */
	private JFrame frame = new JFrame();
	
	/**
	 * 二级菜单(F)，新建(N).
	 */
	private JMenuItem menuFileNew = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_NEW);
	
	/**
	 * 二级菜单(F)，打开(O).
	 */
	private JMenuItem menuFileOpen = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_OPEN, KeyEvent.VK_O);
	
	/**
	 * 二级菜单(F)，保存(S).
	 */
	private JMenuItem menuFileSave = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_SAVE);
	
	/**
	 * 二级菜单(F)，另存为(A).
	 */
	private JMenuItem menuFileSaveAs = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_SAVE_AS);
	
	/**
	 * 二级菜单(F)，页面设置(U).
	 */
	private JMenuItem menuFilePageSet = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_PAGE_SET);
	
	/**
	 * 二级菜单(F)，打印(P).
	 */
	private JMenuItem menuFilePagePrint = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_PAGE_PRINT);
	
	/**
	 * 二级菜单(F)，退出(X).
	 */
	private JMenuItem menuFileExit = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_EXIT);
	
	/**
	 * 二级菜单(E)，撤销(U).
	 */
	private JMenuItem menuEditUndo = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_UNDO);
	
	/**
	 * 二级菜单(E)，剪切(T).
	 */
	private JMenuItem menuEditTrim = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_TRIM);
	
	/**
	 * 二级菜单(E)，复制(C).
	 */
	private JMenuItem menuEditCopy = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_COPY);
	
	/**
	 * 二级菜单(E)，粘贴(P).
	 */
	private JMenuItem menuEditPaste = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_PASTE);
	
	/**
	 * 二级菜单(E)，删除(L).
	 */
	private JMenuItem menuEditDelete = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_DELETE);
	
	/**
	 * 二级菜单(E)，查找(F).
	 */
	private JMenuItem menuEditFind = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_FIND);
	
	/**
	 * 二级菜单(E)，查找下一个(N).
	 */
	private JMenuItem menuEditFindNext = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_FIND_NEXT);
	
	/**
	 * 二级菜单(E)，替换(R).
	 */
	private JMenuItem menuEditReplace = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_REPLACE);
	
	/**
	 * 二级菜单(E)，转到(G).
	 */
	private JMenuItem menuEditGoto = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_GOTO);
	
	/**
	 * 二级菜单(E)，全选(A).
	 */
	private JMenuItem menuEditAll = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_ALL);
	
	/**
	 * 二级菜单(E)，时间/日期(D).
	 */
	private JMenuItem menuEditDate = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_DATE);
	
	/**
	 * 二级菜单(O)，自动换行(W).
	 */
	private JMenuItem menuFormatWrap = new JMenuItem(NodePadConstant.MENU_TITLE_FORMAT_WRAP);
	
	/**
	 * 二级菜单(O)，字体(F).
	 */
	private JMenuItem menuFormatFont = new JMenuItem(NodePadConstant.MENU_TITLE_FORMAT_FONT);
	
	/**
	 * 二级菜单(V)，状态栏(S).
	 */
	private JMenuItem menuViewStatusBar = new JMenuItem(NodePadConstant.MENU_TITLE_VIEW_STATUS_BAR);
	
	/**
	 * 二级菜单(H)，查看帮助(H).
	 */
	private JMenuItem menuHelpView = new JMenuItem(NodePadConstant.MENU_TITLE_HELP_VIEW);
	
	/**
	 * 二级菜单(H)，关于记事本(A).
	 */
	private JMenuItem menuHelpAboutNotepad = new JMenuItem(NodePadConstant.MENU_TITLE_HELP_ABOUT_NOTEPAD);
	
	/**
	 * 状态栏.
	 */
	private JToolBar toolState = new JToolBar();
	
	/**
	 * 当前文件名-包括路径.
	 */
	private String fileName;
	
	/**
	 * 撤销管理.
	 */
	private UndoManager undo;
	
	/**
	 * 带滚动条的文本域.
	 */
	private TextPane textPane;
	
	/**
	 * 查找编辑框.
	 */
	private JTextField findText = new JTextField(16);
	
	/**
	 * 替换编辑框.
	 */
	private JTextField replaceText = new JTextField(16);
    
	/**
	 * 区分大小写.
	 */
	private JCheckBox matchCase = new JCheckBox("区分大小写");
    
	/**
	 * 向上查找.
	 */
	private JRadioButton up = new JRadioButton("向上(U)");
    
	/**
	 * 向下查找.
	 */
	private JRadioButton down = new JRadioButton("向下(D)");
	
	/**
	 * 领域对象实例.
	 */
	private static final DomainHelper instance = new DomainHelper();
	
	/**
	 * 私有构造函数.
	 */
	private DomainHelper() 
	{
	}
	
	/**
	 * 获取领域对象实例.
	 * @return
	 */
	public static DomainHelper getInstance() 
	{
		return instance;
	}

	/**
	 * 初始化系统领域对象.
	 */
	public void initDomain() 
	{
		// 初始化声明对象.
		undo = new UndoManager();
        textPane = new TextPane();
		
		// 初始化"编辑"菜单栏.
		menuEditTrim.setEnabled(false);
        menuEditCopy.setEnabled(false);
        menuEditDelete.setEnabled(false);
        if (StringUtils.isEmpty(textPane.getTextArea().getText())) 
        {
        	menuEditFind.setEnabled(false);
            menuEditFindNext.setEnabled(false);
        }
        
        // 初始化状态栏.
        toolState.setVisible(true);
        toolState.setFloatable(false);
        toolState.setPreferredSize(new Dimension(textPane.getTextArea().getSize().width, 20));
        
        // 添加撤销管理器.
        textPane.getTextArea().getDocument().addUndoableEditListener(undo);
	}

	/**
	 * 获取frame.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * 设置frame.
	 * @param
	 *     frame.
	 */
	public void setFrame(JFrame frame) 
	{
		this.frame = frame;
	}

	/**
	 * 获取menuFileNew.
	 * @return
	 *     menuFileNew.
	 */
	public JMenuItem getMenuFileNew() 
	{
		return menuFileNew;
	}

	/**
	 * 设置menuFileNew.
	 * @param
	 *     menuFileNew.
	 */
	public void setMenuFileNew(JMenuItem menuFileNew) 
	{
		this.menuFileNew = menuFileNew;
	}

	/**
	 * 获取menuFileOpen.
	 * @return
	 *     menuFileOpen.
	 */
	public JMenuItem getMenuFileOpen() 
	{
		return menuFileOpen;
	}

	/**
	 * 设置menuFileOpen.
	 * @param
	 *     menuFileOpen.
	 */
	public void setMenuFileOpen(JMenuItem menuFileOpen) 
	{
		this.menuFileOpen = menuFileOpen;
	}

	/**
	 * 获取menuFileSave.
	 * @return
	 *     menuFileSave.
	 */
	public JMenuItem getMenuFileSave() 
	{
		return menuFileSave;
	}

	/**
	 * 设置menuFileSave.
	 * @param
	 *     menuFileSave.
	 */
	public void setMenuFileSave(JMenuItem menuFileSave) 
	{
		this.menuFileSave = menuFileSave;
	}

	/**
	 * 获取menuFileSaveAs.
	 * @return
	 *     menuFileSaveAs.
	 */
	public JMenuItem getMenuFileSaveAs() 
	{
		return menuFileSaveAs;
	}

	/**
	 * 设置menuFileSaveAs.
	 * @param
	 *     menuFileSaveAs.
	 */
	public void setMenuFileSaveAs(JMenuItem menuFileSaveAs) 
	{
		this.menuFileSaveAs = menuFileSaveAs;
	}

	/**
	 * 获取menuFilePageSet.
	 * @return
	 *     menuFilePageSet.
	 */
	public JMenuItem getMenuFilePageSet() 
	{
		return menuFilePageSet;
	}

	/**
	 * 设置menuFilePageSet.
	 * @param
	 *     menuFilePageSet.
	 */
	public void setMenuFilePageSet(JMenuItem menuFilePageSet) 
	{
		this.menuFilePageSet = menuFilePageSet;
	}

	/**
	 * 获取menuFilePagePrint.
	 * @return
	 *     menuFilePagePrint.
	 */
	public JMenuItem getMenuFilePagePrint() 
	{
		return menuFilePagePrint;
	}

	/**
	 * 设置menuFilePagePrint.
	 * @param
	 *     menuFilePagePrint.
	 */
	public void setMenuFilePagePrint(JMenuItem menuFilePagePrint) 
	{
		this.menuFilePagePrint = menuFilePagePrint;
	}

	/**
	 * 获取menuFileExit.
	 * @return
	 *     menuFileExit.
	 */
	public JMenuItem getMenuFileExit() 
	{
		return menuFileExit;
	}

	/**
	 * 设置menuFileExit.
	 * @param
	 *     menuFileExit.
	 */
	public void setMenuFileExit(JMenuItem menuFileExit) 
	{
		this.menuFileExit = menuFileExit;
	}

	/**
	 * 获取menuEditUndo.
	 * @return
	 *     menuEditUndo.
	 */
	public JMenuItem getMenuEditUndo() 
	{
		return menuEditUndo;
	}

	/**
	 * 设置menuEditUndo.
	 * @param
	 *     menuEditUndo.
	 */
	public void setMenuEditUndo(JMenuItem menuEditUndo) 
	{
		this.menuEditUndo = menuEditUndo;
	}

	/**
	 * 获取menuEditTrim.
	 * @return
	 *     menuEditTrim.
	 */
	public JMenuItem getMenuEditTrim() 
	{
		return menuEditTrim;
	}

	/**
	 * 设置menuEditTrim.
	 * @param
	 *     menuEditTrim.
	 */
	public void setMenuEditTrim(JMenuItem menuEditTrim) 
	{
		this.menuEditTrim = menuEditTrim;
	}

	/**
	 * 获取menuEditCopy.
	 * @return
	 *     menuEditCopy.
	 */
	public JMenuItem getMenuEditCopy() 
	{
		return menuEditCopy;
	}

	/**
	 * 设置menuEditCopy.
	 * @param
	 *     menuEditCopy.
	 */
	public void setMenuEditCopy(JMenuItem menuEditCopy) 
	{
		this.menuEditCopy = menuEditCopy;
	}

	/**
	 * 获取menuEditPaste.
	 * @return
	 *     menuEditPaste.
	 */
	public JMenuItem getMenuEditPaste() 
	{
		return menuEditPaste;
	}

	/**
	 * 设置menuEditPaste.
	 * @param
	 *     menuEditPaste.
	 */
	public void setMenuEditPaste(JMenuItem menuEditPaste) 
	{
		this.menuEditPaste = menuEditPaste;
	}

	/**
	 * 获取menuEditDelete.
	 * @return
	 *     menuEditDelete.
	 */
	public JMenuItem getMenuEditDelete() 
	{
		return menuEditDelete;
	}

	/**
	 * 设置menuEditDelete.
	 * @param
	 *     menuEditDelete.
	 */
	public void setMenuEditDelete(JMenuItem menuEditDelete) 
	{
		this.menuEditDelete = menuEditDelete;
	}

	/**
	 * 获取menuEditFind.
	 * @return
	 *     menuEditFind.
	 */
	public JMenuItem getMenuEditFind() 
	{
		return menuEditFind;
	}

	/**
	 * 设置menuEditFind.
	 * @param
	 *     menuEditFind.
	 */
	public void setMenuEditFind(JMenuItem menuEditFind) 
	{
		this.menuEditFind = menuEditFind;
	}

	/**
	 * 获取menuEditFindNext.
	 * @return
	 *     menuEditFindNext.
	 */
	public JMenuItem getMenuEditFindNext() 
	{
		return menuEditFindNext;
	}

	/**
	 * 设置menuEditFindNext.
	 * @param
	 *     menuEditFindNext.
	 */
	public void setMenuEditFindNext(JMenuItem menuEditFindNext) 
	{
		this.menuEditFindNext = menuEditFindNext;
	}

	/**
	 * 获取menuEditReplace.
	 * @return
	 *     menuEditReplace.
	 */
	public JMenuItem getMenuEditReplace() 
	{
		return menuEditReplace;
	}

	/**
	 * 设置menuEditReplace.
	 * @param
	 *     menuEditReplace.
	 */
	public void setMenuEditReplace(JMenuItem menuEditReplace) 
	{
		this.menuEditReplace = menuEditReplace;
	}

	/**
	 * 获取menuEditGoto.
	 * @return
	 *     menuEditGoto.
	 */
	public JMenuItem getMenuEditGoto() 
	{
		return menuEditGoto;
	}

	/**
	 * 设置menuEditGoto.
	 * @param
	 *     menuEditGoto.
	 */
	public void setMenuEditGoto(JMenuItem menuEditGoto) 
	{
		this.menuEditGoto = menuEditGoto;
	}

	/**
	 * 获取menuEditAll.
	 * @return
	 *     menuEditAll.
	 */
	public JMenuItem getMenuEditAll() 
	{
		return menuEditAll;
	}

	/**
	 * 设置menuEditAll.
	 * @param
	 *     menuEditAll.
	 */
	public void setMenuEditAll(JMenuItem menuEditAll) 
	{
		this.menuEditAll = menuEditAll;
	}

	/**
	 * 获取menuEditDate.
	 * @return
	 *     menuEditDate.
	 */
	public JMenuItem getMenuEditDate() 
	{
		return menuEditDate;
	}

	/**
	 * 设置menuEditDate.
	 * @param
	 *     menuEditDate.
	 */
	public void setMenuEditDate(JMenuItem menuEditDate) 
	{
		this.menuEditDate = menuEditDate;
	}

	/**
	 * 获取menuFormatWrap.
	 * @return
	 *     menuFormatWrap.
	 */
	public JMenuItem getMenuFormatWrap() 
	{
		return menuFormatWrap;
	}

	/**
	 * 设置menuFormatWrap.
	 * @param
	 *     menuFormatWrap.
	 */
	public void setMenuFormatWrap(JMenuItem menuFormatWrap) 
	{
		this.menuFormatWrap = menuFormatWrap;
	}

	/**
	 * 获取menuFormatFont.
	 * @return
	 *     menuFormatFont.
	 */
	public JMenuItem getMenuFormatFont() 
	{
		return menuFormatFont;
	}

	/**
	 * 设置menuFormatFont.
	 * @param
	 *     menuFormatFont.
	 */
	public void setMenuFormatFont(JMenuItem menuFormatFont) 
	{
		this.menuFormatFont = menuFormatFont;
	}

	/**
	 * 获取menuHelpView.
	 * @return
	 *     menuHelpView.
	 */
	public JMenuItem getMenuHelpView() 
	{
		return menuHelpView;
	}

	/**
	 * 设置menuHelpView.
	 * @param
	 *     menuHelpView.
	 */
	public void setMenuHelpView(JMenuItem menuHelpView) 
	{
		this.menuHelpView = menuHelpView;
	}

	/**
	 * 获取menuHelpAboutNotepad.
	 * @return
	 *     menuHelpAboutNotepad.
	 */
	public JMenuItem getMenuHelpAboutNotepad() 
	{
		return menuHelpAboutNotepad;
	}

	/**
	 * 设置menuHelpAboutNotepad.
	 * @param
	 *     menuHelpAboutNotepad.
	 */
	public void setMenuHelpAboutNotepad(JMenuItem menuHelpAboutNotepad) 
	{
		this.menuHelpAboutNotepad = menuHelpAboutNotepad;
	}

	/**
	 * 获取menuViewStatusBar.
	 * @return
	 *     menuViewStatusBar.
	 */
	public JMenuItem getMenuViewStatusBar() 
	{
		return menuViewStatusBar;
	}

	/**
	 * 设置menuViewStatusBar.
	 * @param
	 *     menuViewStatusBar.
	 */
	public void setMenuViewStatusBar(JMenuItem menuViewStatusBar) 
	{
		this.menuViewStatusBar = menuViewStatusBar;
	}

	/**
	 * 获取fileName.
	 * @return
	 *     fileName.
	 */
	public String getFileName() 
	{
		return fileName;
	}

	/**
	 * 设置fileName.
	 * @param
	 *     fileName.
	 */
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	/**
	 * 获取undo.
	 * @return
	 *     undo.
	 */
	public UndoManager getUndo() 
	{
		return undo;
	}

	/**
	 * 设置undo.
	 * @param
	 *     undo.
	 */
	public void setUndo(UndoManager undo) 
	{
		this.undo = undo;
	}

	/**
	 * 获取textPane.
	 * @return
	 *     textPane.
	 */
	public TextPane getTextPane() 
	{
		return textPane;
	}

	/**
	 * 设置textPane.
	 * @param
	 *     textPane.
	 */
	public void setTextPane(TextPane textPane) 
	{
		this.textPane = textPane;
	}

	/**
	 * 获取toolState.
	 * @return
	 *     toolState.
	 */
	public JToolBar getToolState() 
	{
		return toolState;
	}

	/**
	 * 设置toolState.
	 * @param
	 *     toolState.
	 */
	public void setToolState(JToolBar toolState) 
	{
		this.toolState = toolState;
	}

	/**
	 * 获取findText.
	 * @return
	 *     findText.
	 */
	public JTextField getFindText() 
	{
		return findText;
	}

	/**
	 * 设置findText.
	 * @param
	 *     findText.
	 */
	public void setFindText(JTextField findText) 
	{
		this.findText = findText;
	}
	
	/**
	 * 获取replaceText.
	 * @return
	 *     replaceText.
	 */
	public JTextField getReplaceText() 
	{
		return replaceText;
	}

	/**
	 * 设置replaceText.
	 * @param
	 *     replaceText.
	 */
	public void setReplaceText(JTextField replaceText) 
	{
		this.replaceText = replaceText;
	}

	/**
	 * 获取matchCase.
	 * @return
	 *     matchCase.
	 */
	public JCheckBox getMatchCase() 
	{
		return matchCase;
	}

	/**
	 * 设置matchCase.
	 * @param
	 *     matchCase.
	 */
	public void setMatchCase(JCheckBox matchCase) 
	{
		this.matchCase = matchCase;
	}

	/**
	 * 获取up.
	 * @return
	 *     up.
	 */
	public JRadioButton getUp() 
	{
		return up;
	}

	/**
	 * 设置up.
	 * @param
	 *     up.
	 */
	public void setUp(JRadioButton up) 
	{
		this.up = up;
	}

	/**
	 * 获取down.
	 * @return
	 *     down.
	 */
	public JRadioButton getDown() 
	{
		return down;
	}

	/**
	 * 设置down.
	 * @param
	 *     down.
	 */
	public void setDown(JRadioButton down) 
	{
		this.down = down;
	}
	
}
