/**
* @FileName: EditPasteAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditPasteAction.java: �༭�����˵�-ճ���¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditPasteAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-ճ���¼�.
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
* @Date: 2018��1��21�� ����12:42:53.
* 
*/
public class EditPasteAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// ��ȡ�ı���.
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
				
		// ֱ�ӵ����Դ��ĺ���.
		jTextArea.paste();
	}
	
}
