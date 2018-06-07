/**
* @FileName: EditDeleteAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditDeleteAction.java: �༭�����˵�-ɾ���¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditDeleteAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-ɾ���¼�.
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
* @Date: 2018��1��21�� ����12:43:51.
* 
*/
public class EditDeleteAction extends BaseAction 
{
	
	private static final JTextArea textArea = domain.getTextPane().getTextArea();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (StringUtils.isNotEmpty(textArea.getSelectedText())) 
		{
			textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
		}
	}

}
