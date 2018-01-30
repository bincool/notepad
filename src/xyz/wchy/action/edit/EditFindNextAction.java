/**
* @FileName: EditFindNextAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditFindNextAction.java: �༭�����˵�-������һ���¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.action.dialog.FindAction;
import xyz.wchy.dialog.edit.EditFindDialog;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditFindNextAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-������һ���¼�.
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
* @Date: 2018��1��21�� ����12:45:41.
* 
*/
public class EditFindNextAction extends BaseAction 
{
	
	/**
	 * ���ұ༭��.
	 */
	private static final JTextField findText = domain.getFindText();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (StringUtils.isEmpty(findText.getText())) 
		{
			EditFindDialog.getInstance(domain.getFrame()).initDialog();
		} 
		else 
		{
			new FindAction().actionPerformed(e);
		}
	}

}
