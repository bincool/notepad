/**
* @FileName: EditFindAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditFindAction.java: �༭�����˵�-�����¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.edit.EditFindDialog;

/**
* @ClassName: EditFindAction.java
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
* @Date: 2018��1��21�� ����12:45:16.
* 
*/
public class EditFindAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		EditFindDialog.getInstance(domain.getFrame()).initDialog();
	}

}
