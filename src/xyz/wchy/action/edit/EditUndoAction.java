/**
* @FileName: EditUndoAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditUndoAction.java: �༭�����˵�-�����¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �༭�����˵�-�����¼�.
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
* @Date: 2018��1��21�� ����12:17:42.
* 
*/
public class EditUndoAction extends BaseAction
{
	
	/**
	 * ��������.
	 */
	private UndoManager undo = DomainHelper.getInstance().getUndo();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info(EditUndoAction.class, "Start to undo.");
		
		// ����.
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
