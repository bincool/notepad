/**
* @FileName: NodePadConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: NodePadConstant.java: 记事本常量-可配置.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.constant;

import xyz.wchy.utils.SystemConfigHelper;

/**
* @ClassName: NodePadConstant.java
* 
* @Description: 
* <p>
* 记事本常量-可在application.properties中配置其常量具体值.
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
* @Date: 2018年1月15日 下午10:44:34.
* 
*/
public interface NodePadConstant 
{
	
	/**
	 * 一级菜单-文件(F).
	 */
	String MENU_TITLE_FILE = SystemConfigHelper.getInstance().getProMap().get("menu.title.file");
	
	/**
	 * 二级菜单(F)-新建(N).
	 */
	String MENU_TITLE_FILE_NEW = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.new");
	
	/**
	 * 二级菜单(F)-打开(O).
	 */
	String MENU_TITLE_FILE_OPEN = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.open");
	
	/**
	 * 二级菜单(F)-保存(S).
	 */
	String MENU_TITLE_FILE_SAVE = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.save");
	
	/**
	 * 二级菜单(F)-另存为(A).
	 */
	String MENU_TITLE_FILE_SAVE_AS = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.save.as");
	
	/**
	 * 二级菜单(F)-页面设置(U).
	 */
	String MENU_TITLE_FILE_PAGE_SET = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.page.set");
	
	/**
	 * 二级菜单(F)-打印(P).
	 */
	String MENU_TITLE_FILE_PAGE_PRINT = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.page.print");
	
	/**
	 * 二级菜单(F)-退出(X).
	 */
	String MENU_TITLE_FILE_EXIT = SystemConfigHelper.getInstance().getProMap().get("menu.title.file.exit");
	
	/**
	 * 一级菜单-编辑(E).
	 */
	String MENU_TITLE_EDIT = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit");
	
	/**
	 * 二级菜单(E)-撤销(U).
	 */
	String MENU_TITLE_EDIT_UNDO = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.undo");
	
	/**
	 * 二级菜单(E)-剪切(T).
	 */
	String MENU_TITLE_EDIT_TRIM = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.trim");
	
	/**
	 * 二级菜单(E)-复制(C).
	 */
	String MENU_TITLE_EDIT_COPY = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.copy");
	
	/**
	 * 二级菜单(E)-粘贴(P).
	 */
	String MENU_TITLE_EDIT_PASTE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.paste");
	
	/**
	 * 二级菜单(E)-删除(L).
	 */
	String MENU_TITLE_EDIT_DELETE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.delete");
	
	/**
	 * 二级菜单(E)-查找(F).
	 */
	String MENU_TITLE_EDIT_FIND = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.find");
	
	/**
	 * 二级菜单(E)-查找下一个(N).
	 */
	String MENU_TITLE_EDIT_FIND_NEXT = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.find.next");
	
	/**
	 * 二级菜单(E)-替换(R).
	 */
	String MENU_TITLE_EDIT_REPLACE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.replace");
	
	/**
	 * 二级菜单(E)-转到(G).
	 */
	String MENU_TITLE_EDIT_GOTO = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.goto");
	
	/**
	 * 二级菜单(E)-全选(A).
	 */
	String MENU_TITLE_EDIT_ALL = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.all");
	
	/**
	 * 二级菜单(E)-时间/日期(D).
	 */
	String MENU_TITLE_EDIT_DATE = SystemConfigHelper.getInstance().getProMap().get("menu.title.edit.date");
	
	/**
	 * 一级菜单-格式(O).
	 */
	String MENU_TITLE_FORMAT = SystemConfigHelper.getInstance().getProMap().get("menu.title.format");
	
	/**
	 * 二级菜单-自动换行(W).
	 */
	String MENU_TITLE_FORMAT_WRAP = SystemConfigHelper.getInstance().getProMap().get("menu.title.format.wrap");
	
	/**
	 * 二级菜单-字体(F).
	 */
	String MENU_TITLE_FORMAT_FONT = SystemConfigHelper.getInstance().getProMap().get("menu.title.format.font");
	
	/**
	 * 一级菜单-查看(V).
	 */
	String MENU_TITLE_VIEW = SystemConfigHelper.getInstance().getProMap().get("menu.title.view");
	
	/**
	 * 二级菜单-状态栏(V).
	 */
	String MENU_TITLE_VIEW_STATUS_BAR = SystemConfigHelper.getInstance().getProMap().get("menu.title.view.status.bar");
	
	/**
	 * 一级菜单-帮组(H).
	 */
	String MENU_TITLE_HELP = SystemConfigHelper.getInstance().getProMap().get("menu.title.help");
	
	/**
	 * 二级菜单-查看帮组(H).
	 */
	String MENU_TITLE_HELP_VIEW = SystemConfigHelper.getInstance().getProMap().get("menu.title.help.view");
	
	/**
	 * 二级菜单-关于记事本(A).
	 */
	String MENU_TITLE_HELP_ABOUT_NOTEPAD = SystemConfigHelper.getInstance().getProMap().get("menu.title.help.about.notepad");
	
}
