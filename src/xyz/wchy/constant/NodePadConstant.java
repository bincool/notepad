/**
* @FileName: NodePadConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: NodePadConstant.java: ���±�����-������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.constant;

import xyz.wchy.utils.SystemConfigHelper;

/**
* @ClassName: NodePadConstant.java
* 
* @Description: 
* <p>
* ���±�����-����application.properties�������䳣������ֵ.
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
* @Date: 2018��1��15�� ����10:44:34.
* 
*/
public interface NodePadConstant 
{
	
	/**
	 * һ���˵�-�ļ�(F).
	 */
	String MENU_TITLE_FILE = SystemConfigHelper.getInstance().getProMap().get("menu.title.file");
	
	/**
	 * �����˵�(F)-�½�(N).
	 */
	String MENU_TITLE_FILE_NEW = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.new");
	
	/**
	 * �����˵�(F)-��(O).
	 */
	String MENU_TITLE_FILE_OPEN = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.open");
	
	/**
	 * �����˵�(F)-����(S).
	 */
	String MENU_TITLE_FILE_SAVE = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.save");
	
	/**
	 * �����˵�(F)-���Ϊ(A).
	 */
	String MENU_TITLE_FILE_SAVE_AS = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.save.as");
	
	/**
	 * �����˵�(F)-ҳ������(U).
	 */
	String MENU_TITLE_FILE_PAGE_SET = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.page.set");
	
	/**
	 * �����˵�(F)-��ӡ(P).
	 */
	String MENU_TITLE_FILE_PAGE_PRINT = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.page.print");
	
	/**
	 * �����˵�(F)-�˳�(X).
	 */
	String MENU_TITLE_FILE_EXIT = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.exit");
	
	/**
	 * һ���˵�-�༭(E).
	 */
	String MENU_TITLE_EDIT = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit");
	
	/**
	 * �����˵�(E)-����(U).
	 */
	String MENU_TITLE_EDIT_UNDO = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.undo");
	
	/**
	 * �����˵�(E)-����(T).
	 */
	String MENU_TITLE_EDIT_TRIM = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.trim");
	
	/**
	 * �����˵�(E)-����(C).
	 */
	String MENU_TITLE_EDIT_COPY = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.copy");
	
	/**
	 * �����˵�(E)-ճ��(P).
	 */
	String MENU_TITLE_EDIT_PASTE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.paste");
	
	/**
	 * �����˵�(E)-ɾ��(L).
	 */
	String MENU_TITLE_EDIT_DELETE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.delete");
	
	/**
	 * �����˵�(E)-����(F).
	 */
	String MENU_TITLE_EDIT_FIND = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.find");
	
	/**
	 * �����˵�(E)-������һ��(N).
	 */
	String MENU_TITLE_EDIT_FIND_NEXT = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.find.next");
	
	/**
	 * �����˵�(E)-�滻(R).
	 */
	String MENU_TITLE_EDIT_REPLACE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.replace");
	
	/**
	 * �����˵�(E)-ת��(G).
	 */
	String MENU_TITLE_EDIT_GOTO = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.goto");
	
	/**
	 * �����˵�(E)-ȫѡ(A).
	 */
	String MENU_TITLE_EDIT_ALL = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.all");
	
	/**
	 * �����˵�(E)-ʱ��/����(D).
	 */
	String MENU_TITLE_EDIT_DATE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.date");
	
	/**
	 * һ���˵�-��ʽ(O).
	 */
	String MENU_TITLE_FORMAT = SystemConfigHelper.getInstance().getProMap().get("menu.title.format");
	
	/**
	 * �����˵�-�Զ�����(W).
	 */
	String MENU_TITLE_FORMAT_WRAP = SystemConfigHelper.getInstance().getProMap().get("menu.title.format.wrap");
	
	/**
	 * �����˵�-����(F).
	 */
	String MENU_TITLE_FORMAT_FONT = SystemConfigHelper.getInstance().getProMap().get("menu.title.format.font");
	
	/**
	 * һ���˵�-�鿴(V).
	 */
	String MENU_TITLE_VIEW = SystemConfigHelper.getInstance().getProMap().get("menu.title.view");
	
	/**
	 * �����˵�-״̬��(V).
	 */
	String MENU_TITLE_VIEW_STATUS_BAR = SystemConfigHelper.getInstance().getProMap().get("menu.title.view.status.bar");
	
	/**
	 * һ���˵�-����(H).
	 */
	String MENU_TITLE_HELP = SystemConfigHelper.getInstance().getProMap().get("menu.title.help");
	
	/**
	 * �����˵�-�鿴����(H).
	 */
	String MENU_TITLE_HELP_VIEW = SystemConfigHelper.getInstance().getProMap().get("menu.title.help.view");
	
	/**
	 * �����˵�-���ڼ��±�(A).
	 */
	String MENU_TITLE_HELP_ABOUT_NOTEPAD = SystemConfigHelper.getInstance().getProMap().get("menu.title.help.about.notepad");
	
}
