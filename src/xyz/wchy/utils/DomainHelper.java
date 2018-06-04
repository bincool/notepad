/**
* @FileName: DomainHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: DomainHelper.java: ������������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �����������ࣺ�ı���iframe��....
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
* @Date: 2018��1��19�� ����1:38:59.
* 
*/
public class DomainHelper 
{
	
	/**
	 * ������.
	 */
	private JFrame frame = new JFrame();
	
	/**
	 * �����˵�(F)���½�(N).
	 */
	private JMenuItem menuFileNew = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_NEW);
	
	/**
	 * �����˵�(F)����(O).
	 */
	private JMenuItem menuFileOpen = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_OPEN, KeyEvent.VK_O);
	
	/**
	 * �����˵�(F)������(S).
	 */
	private JMenuItem menuFileSave = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_SAVE);
	
	/**
	 * �����˵�(F)�����Ϊ(A).
	 */
	private JMenuItem menuFileSaveAs = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_SAVE_AS);
	
	/**
	 * �����˵�(F)��ҳ������(U).
	 */
	private JMenuItem menuFilePageSet = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_PAGE_SET);
	
	/**
	 * �����˵�(F)����ӡ(P).
	 */
	private JMenuItem menuFilePagePrint = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_PAGE_PRINT);
	
	/**
	 * �����˵�(F)���˳�(X).
	 */
	private JMenuItem menuFileExit = new JMenuItem(NodePadConstant.MENU_TITLE_FILE_EXIT);
	
	/**
	 * �����˵�(E)������(U).
	 */
	private JMenuItem menuEditUndo = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_UNDO);
	
	/**
	 * �����˵�(E)������(T).
	 */
	private JMenuItem menuEditTrim = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_TRIM);
	
	/**
	 * �����˵�(E)������(C).
	 */
	private JMenuItem menuEditCopy = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_COPY);
	
	/**
	 * �����˵�(E)��ճ��(P).
	 */
	private JMenuItem menuEditPaste = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_PASTE);
	
	/**
	 * �����˵�(E)��ɾ��(L).
	 */
	private JMenuItem menuEditDelete = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_DELETE);
	
	/**
	 * �����˵�(E)������(F).
	 */
	private JMenuItem menuEditFind = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_FIND);
	
	/**
	 * �����˵�(E)��������һ��(N).
	 */
	private JMenuItem menuEditFindNext = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_FIND_NEXT);
	
	/**
	 * �����˵�(E)���滻(R).
	 */
	private JMenuItem menuEditReplace = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_REPLACE);
	
	/**
	 * �����˵�(E)��ת��(G).
	 */
	private JMenuItem menuEditGoto = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_GOTO);
	
	/**
	 * �����˵�(E)��ȫѡ(A).
	 */
	private JMenuItem menuEditAll = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_ALL);
	
	/**
	 * �����˵�(E)��ʱ��/����(D).
	 */
	private JMenuItem menuEditDate = new JMenuItem(NodePadConstant.MENU_TITLE_EDIT_DATE);
	
	/**
	 * �����˵�(O)���Զ�����(W).
	 */
	private JMenuItem menuFormatWrap = new JMenuItem(NodePadConstant.MENU_TITLE_FORMAT_WRAP);
	
	/**
	 * �����˵�(O)������(F).
	 */
	private JMenuItem menuFormatFont = new JMenuItem(NodePadConstant.MENU_TITLE_FORMAT_FONT);
	
	/**
	 * �����˵�(V)��״̬��(S).
	 */
	private JMenuItem menuViewStatusBar = new JMenuItem(NodePadConstant.MENU_TITLE_VIEW_STATUS_BAR);
	
	/**
	 * �����˵�(H)���鿴����(H).
	 */
	private JMenuItem menuHelpView = new JMenuItem(NodePadConstant.MENU_TITLE_HELP_VIEW);
	
	/**
	 * �����˵�(H)�����ڼ��±�(A).
	 */
	private JMenuItem menuHelpAboutNotepad = new JMenuItem(NodePadConstant.MENU_TITLE_HELP_ABOUT_NOTEPAD);
	
	/**
	 * ״̬��.
	 */
	private JToolBar toolState = new JToolBar();
	
	/**
	 * ��ǰ�ļ���-����·��.
	 */
	private String fileName;
	
	/**
	 * ��������.
	 */
	private UndoManager undo;
	
	/**
	 * �����������ı���.
	 */
	private TextPane textPane;
	
	/**
	 * ���ұ༭��.
	 */
	private JTextField findText = new JTextField(16);
	
	/**
	 * �滻�༭��.
	 */
	private JTextField replaceText = new JTextField(16);
    
	/**
	 * ���ִ�Сд.
	 */
	private JCheckBox matchCase = new JCheckBox("���ִ�Сд");
    
	/**
	 * ���ϲ���.
	 */
	private JRadioButton up = new JRadioButton("����(U)");
    
	/**
	 * ���²���.
	 */
	private JRadioButton down = new JRadioButton("����(D)");
	
	/**
	 * �������ʵ��.
	 */
	private static final DomainHelper instance = new DomainHelper();
	
	/**
	 * ˽�й��캯��.
	 */
	private DomainHelper() 
	{
	}
	
	/**
	 * ��ȡ�������ʵ��.
	 * @return
	 */
	public static DomainHelper getInstance() 
	{
		return instance;
	}

	/**
	 * ��ʼ��ϵͳ�������.
	 */
	public void initDomain() 
	{
		// ��ʼ����������.
		undo = new UndoManager();
        textPane = new TextPane();
		
		// ��ʼ��"�༭"�˵���.
		menuEditTrim.setEnabled(false);
        menuEditCopy.setEnabled(false);
        menuEditDelete.setEnabled(false);
        if (StringUtils.isEmpty(textPane.getTextArea().getText())) 
        {
        	menuEditFind.setEnabled(false);
            menuEditFindNext.setEnabled(false);
        }
        
        // ��ʼ��״̬��.
        toolState.setVisible(true);
        toolState.setFloatable(false);
        toolState.setPreferredSize(new Dimension(textPane.getTextArea().getSize().width, 20));
        
        // ��ӳ���������.
        textPane.getTextArea().getDocument().addUndoableEditListener(undo);
	}

	/**
	 * ��ȡframe.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * ����frame.
	 * @param
	 *     frame.
	 */
	public void setFrame(JFrame frame) 
	{
		this.frame = frame;
	}

	/**
	 * ��ȡmenuFileNew.
	 * @return
	 *     menuFileNew.
	 */
	public JMenuItem getMenuFileNew() 
	{
		return menuFileNew;
	}

	/**
	 * ����menuFileNew.
	 * @param
	 *     menuFileNew.
	 */
	public void setMenuFileNew(JMenuItem menuFileNew) 
	{
		this.menuFileNew = menuFileNew;
	}

	/**
	 * ��ȡmenuFileOpen.
	 * @return
	 *     menuFileOpen.
	 */
	public JMenuItem getMenuFileOpen() 
	{
		return menuFileOpen;
	}

	/**
	 * ����menuFileOpen.
	 * @param
	 *     menuFileOpen.
	 */
	public void setMenuFileOpen(JMenuItem menuFileOpen) 
	{
		this.menuFileOpen = menuFileOpen;
	}

	/**
	 * ��ȡmenuFileSave.
	 * @return
	 *     menuFileSave.
	 */
	public JMenuItem getMenuFileSave() 
	{
		return menuFileSave;
	}

	/**
	 * ����menuFileSave.
	 * @param
	 *     menuFileSave.
	 */
	public void setMenuFileSave(JMenuItem menuFileSave) 
	{
		this.menuFileSave = menuFileSave;
	}

	/**
	 * ��ȡmenuFileSaveAs.
	 * @return
	 *     menuFileSaveAs.
	 */
	public JMenuItem getMenuFileSaveAs() 
	{
		return menuFileSaveAs;
	}

	/**
	 * ����menuFileSaveAs.
	 * @param
	 *     menuFileSaveAs.
	 */
	public void setMenuFileSaveAs(JMenuItem menuFileSaveAs) 
	{
		this.menuFileSaveAs = menuFileSaveAs;
	}

	/**
	 * ��ȡmenuFilePageSet.
	 * @return
	 *     menuFilePageSet.
	 */
	public JMenuItem getMenuFilePageSet() 
	{
		return menuFilePageSet;
	}

	/**
	 * ����menuFilePageSet.
	 * @param
	 *     menuFilePageSet.
	 */
	public void setMenuFilePageSet(JMenuItem menuFilePageSet) 
	{
		this.menuFilePageSet = menuFilePageSet;
	}

	/**
	 * ��ȡmenuFilePagePrint.
	 * @return
	 *     menuFilePagePrint.
	 */
	public JMenuItem getMenuFilePagePrint() 
	{
		return menuFilePagePrint;
	}

	/**
	 * ����menuFilePagePrint.
	 * @param
	 *     menuFilePagePrint.
	 */
	public void setMenuFilePagePrint(JMenuItem menuFilePagePrint) 
	{
		this.menuFilePagePrint = menuFilePagePrint;
	}

	/**
	 * ��ȡmenuFileExit.
	 * @return
	 *     menuFileExit.
	 */
	public JMenuItem getMenuFileExit() 
	{
		return menuFileExit;
	}

	/**
	 * ����menuFileExit.
	 * @param
	 *     menuFileExit.
	 */
	public void setMenuFileExit(JMenuItem menuFileExit) 
	{
		this.menuFileExit = menuFileExit;
	}

	/**
	 * ��ȡmenuEditUndo.
	 * @return
	 *     menuEditUndo.
	 */
	public JMenuItem getMenuEditUndo() 
	{
		return menuEditUndo;
	}

	/**
	 * ����menuEditUndo.
	 * @param
	 *     menuEditUndo.
	 */
	public void setMenuEditUndo(JMenuItem menuEditUndo) 
	{
		this.menuEditUndo = menuEditUndo;
	}

	/**
	 * ��ȡmenuEditTrim.
	 * @return
	 *     menuEditTrim.
	 */
	public JMenuItem getMenuEditTrim() 
	{
		return menuEditTrim;
	}

	/**
	 * ����menuEditTrim.
	 * @param
	 *     menuEditTrim.
	 */
	public void setMenuEditTrim(JMenuItem menuEditTrim) 
	{
		this.menuEditTrim = menuEditTrim;
	}

	/**
	 * ��ȡmenuEditCopy.
	 * @return
	 *     menuEditCopy.
	 */
	public JMenuItem getMenuEditCopy() 
	{
		return menuEditCopy;
	}

	/**
	 * ����menuEditCopy.
	 * @param
	 *     menuEditCopy.
	 */
	public void setMenuEditCopy(JMenuItem menuEditCopy) 
	{
		this.menuEditCopy = menuEditCopy;
	}

	/**
	 * ��ȡmenuEditPaste.
	 * @return
	 *     menuEditPaste.
	 */
	public JMenuItem getMenuEditPaste() 
	{
		return menuEditPaste;
	}

	/**
	 * ����menuEditPaste.
	 * @param
	 *     menuEditPaste.
	 */
	public void setMenuEditPaste(JMenuItem menuEditPaste) 
	{
		this.menuEditPaste = menuEditPaste;
	}

	/**
	 * ��ȡmenuEditDelete.
	 * @return
	 *     menuEditDelete.
	 */
	public JMenuItem getMenuEditDelete() 
	{
		return menuEditDelete;
	}

	/**
	 * ����menuEditDelete.
	 * @param
	 *     menuEditDelete.
	 */
	public void setMenuEditDelete(JMenuItem menuEditDelete) 
	{
		this.menuEditDelete = menuEditDelete;
	}

	/**
	 * ��ȡmenuEditFind.
	 * @return
	 *     menuEditFind.
	 */
	public JMenuItem getMenuEditFind() 
	{
		return menuEditFind;
	}

	/**
	 * ����menuEditFind.
	 * @param
	 *     menuEditFind.
	 */
	public void setMenuEditFind(JMenuItem menuEditFind) 
	{
		this.menuEditFind = menuEditFind;
	}

	/**
	 * ��ȡmenuEditFindNext.
	 * @return
	 *     menuEditFindNext.
	 */
	public JMenuItem getMenuEditFindNext() 
	{
		return menuEditFindNext;
	}

	/**
	 * ����menuEditFindNext.
	 * @param
	 *     menuEditFindNext.
	 */
	public void setMenuEditFindNext(JMenuItem menuEditFindNext) 
	{
		this.menuEditFindNext = menuEditFindNext;
	}

	/**
	 * ��ȡmenuEditReplace.
	 * @return
	 *     menuEditReplace.
	 */
	public JMenuItem getMenuEditReplace() 
	{
		return menuEditReplace;
	}

	/**
	 * ����menuEditReplace.
	 * @param
	 *     menuEditReplace.
	 */
	public void setMenuEditReplace(JMenuItem menuEditReplace) 
	{
		this.menuEditReplace = menuEditReplace;
	}

	/**
	 * ��ȡmenuEditGoto.
	 * @return
	 *     menuEditGoto.
	 */
	public JMenuItem getMenuEditGoto() 
	{
		return menuEditGoto;
	}

	/**
	 * ����menuEditGoto.
	 * @param
	 *     menuEditGoto.
	 */
	public void setMenuEditGoto(JMenuItem menuEditGoto) 
	{
		this.menuEditGoto = menuEditGoto;
	}

	/**
	 * ��ȡmenuEditAll.
	 * @return
	 *     menuEditAll.
	 */
	public JMenuItem getMenuEditAll() 
	{
		return menuEditAll;
	}

	/**
	 * ����menuEditAll.
	 * @param
	 *     menuEditAll.
	 */
	public void setMenuEditAll(JMenuItem menuEditAll) 
	{
		this.menuEditAll = menuEditAll;
	}

	/**
	 * ��ȡmenuEditDate.
	 * @return
	 *     menuEditDate.
	 */
	public JMenuItem getMenuEditDate() 
	{
		return menuEditDate;
	}

	/**
	 * ����menuEditDate.
	 * @param
	 *     menuEditDate.
	 */
	public void setMenuEditDate(JMenuItem menuEditDate) 
	{
		this.menuEditDate = menuEditDate;
	}

	/**
	 * ��ȡmenuFormatWrap.
	 * @return
	 *     menuFormatWrap.
	 */
	public JMenuItem getMenuFormatWrap() 
	{
		return menuFormatWrap;
	}

	/**
	 * ����menuFormatWrap.
	 * @param
	 *     menuFormatWrap.
	 */
	public void setMenuFormatWrap(JMenuItem menuFormatWrap) 
	{
		this.menuFormatWrap = menuFormatWrap;
	}

	/**
	 * ��ȡmenuFormatFont.
	 * @return
	 *     menuFormatFont.
	 */
	public JMenuItem getMenuFormatFont() 
	{
		return menuFormatFont;
	}

	/**
	 * ����menuFormatFont.
	 * @param
	 *     menuFormatFont.
	 */
	public void setMenuFormatFont(JMenuItem menuFormatFont) 
	{
		this.menuFormatFont = menuFormatFont;
	}

	/**
	 * ��ȡmenuHelpView.
	 * @return
	 *     menuHelpView.
	 */
	public JMenuItem getMenuHelpView() 
	{
		return menuHelpView;
	}

	/**
	 * ����menuHelpView.
	 * @param
	 *     menuHelpView.
	 */
	public void setMenuHelpView(JMenuItem menuHelpView) 
	{
		this.menuHelpView = menuHelpView;
	}

	/**
	 * ��ȡmenuHelpAboutNotepad.
	 * @return
	 *     menuHelpAboutNotepad.
	 */
	public JMenuItem getMenuHelpAboutNotepad() 
	{
		return menuHelpAboutNotepad;
	}

	/**
	 * ����menuHelpAboutNotepad.
	 * @param
	 *     menuHelpAboutNotepad.
	 */
	public void setMenuHelpAboutNotepad(JMenuItem menuHelpAboutNotepad) 
	{
		this.menuHelpAboutNotepad = menuHelpAboutNotepad;
	}

	/**
	 * ��ȡmenuViewStatusBar.
	 * @return
	 *     menuViewStatusBar.
	 */
	public JMenuItem getMenuViewStatusBar() 
	{
		return menuViewStatusBar;
	}

	/**
	 * ����menuViewStatusBar.
	 * @param
	 *     menuViewStatusBar.
	 */
	public void setMenuViewStatusBar(JMenuItem menuViewStatusBar) 
	{
		this.menuViewStatusBar = menuViewStatusBar;
	}

	/**
	 * ��ȡfileName.
	 * @return
	 *     fileName.
	 */
	public String getFileName() 
	{
		return fileName;
	}

	/**
	 * ����fileName.
	 * @param
	 *     fileName.
	 */
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	/**
	 * ��ȡundo.
	 * @return
	 *     undo.
	 */
	public UndoManager getUndo() 
	{
		return undo;
	}

	/**
	 * ����undo.
	 * @param
	 *     undo.
	 */
	public void setUndo(UndoManager undo) 
	{
		this.undo = undo;
	}

	/**
	 * ��ȡtextPane.
	 * @return
	 *     textPane.
	 */
	public TextPane getTextPane() 
	{
		return textPane;
	}

	/**
	 * ����textPane.
	 * @param
	 *     textPane.
	 */
	public void setTextPane(TextPane textPane) 
	{
		this.textPane = textPane;
	}

	/**
	 * ��ȡtoolState.
	 * @return
	 *     toolState.
	 */
	public JToolBar getToolState() 
	{
		return toolState;
	}

	/**
	 * ����toolState.
	 * @param
	 *     toolState.
	 */
	public void setToolState(JToolBar toolState) 
	{
		this.toolState = toolState;
	}

	/**
	 * ��ȡfindText.
	 * @return
	 *     findText.
	 */
	public JTextField getFindText() 
	{
		return findText;
	}

	/**
	 * ����findText.
	 * @param
	 *     findText.
	 */
	public void setFindText(JTextField findText) 
	{
		this.findText = findText;
	}
	
	/**
	 * ��ȡreplaceText.
	 * @return
	 *     replaceText.
	 */
	public JTextField getReplaceText() 
	{
		return replaceText;
	}

	/**
	 * ����replaceText.
	 * @param
	 *     replaceText.
	 */
	public void setReplaceText(JTextField replaceText) 
	{
		this.replaceText = replaceText;
	}

	/**
	 * ��ȡmatchCase.
	 * @return
	 *     matchCase.
	 */
	public JCheckBox getMatchCase() 
	{
		return matchCase;
	}

	/**
	 * ����matchCase.
	 * @param
	 *     matchCase.
	 */
	public void setMatchCase(JCheckBox matchCase) 
	{
		this.matchCase = matchCase;
	}

	/**
	 * ��ȡup.
	 * @return
	 *     up.
	 */
	public JRadioButton getUp() 
	{
		return up;
	}

	/**
	 * ����up.
	 * @param
	 *     up.
	 */
	public void setUp(JRadioButton up) 
	{
		this.up = up;
	}

	/**
	 * ��ȡdown.
	 * @return
	 *     down.
	 */
	public JRadioButton getDown() 
	{
		return down;
	}

	/**
	 * ����down.
	 * @param
	 *     down.
	 */
	public void setDown(JRadioButton down) 
	{
		this.down = down;
	}
	
}
