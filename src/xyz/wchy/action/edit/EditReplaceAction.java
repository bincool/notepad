/**
* @FileName: EditReplaceAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditReplaceAction.java: �༭�����˵�-�滻�¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.edit.EditReplaceDialog;

/**
* @ClassName: EditReplaceAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-�滻�¼�.
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
* @Date: 2018��1��21�� ����12:46:10.
* 
*/
public class EditReplaceAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		EditReplaceDialog.getInstance(domain.getFrame()).initDialog();
	}

}
