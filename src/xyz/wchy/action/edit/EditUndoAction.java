/**
* @FileName: EditUndoAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditUndoAction.java: 编辑操作菜单-撤销事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.undo.UndoManager;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditUndoAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-撤销事件.
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
* @Date: 2018年1月21日 上午12:17:42.
* 
*/
public class EditUndoAction extends BaseAction
{
	
	/**
	 * 撤销管理.
	 */
	private UndoManager undo = DomainHelper.getInstance().getUndo();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info(EditUndoAction.class, "Start to undo.");
		
		// 撤销.
		if(undo.canUndo())
		{
			undo.undo();
		} 
		else 
		{
			
		}
		
		LOGGER.info(EditUndoAction.class, "End to undo.");
	}
	
}
