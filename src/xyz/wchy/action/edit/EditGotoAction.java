/**
* @FileName: EditGotoAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditGotoAction.java: �༭�����˵�-ת���¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditGotoAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-ת���¼�.
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
* @Date: 2018��1��21�� ����12:46:50.
* 
*/
public class EditGotoAction extends BaseAction 
{
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.
	 * ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// ��ȡ�ı���.
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		// ȡ��������.
		int totalLineCount = jTextArea.getLineCount();
		if (totalLineCount < 1) 
		{
			return;
		}
		String line = JOptionPane.showInputDialog(null, "�к�(L):\n", "ת��ָ����", JOptionPane.PLAIN_MESSAGE);
		if (StringUtils.isEmpty(line)) 
		{
			return;
		}
		try 
		{
			int intLine = Integer.parseInt(line);
			if (intLine > totalLineCount) 
			{
				return;
			}
			
			// JTextArea��ʼ�к���0�����Դ˴�����һ����.
			int selectionStart = jTextArea.getLineStartOffset(intLine - 1);
			int selectionEnd = jTextArea.getLineEndOffset(intLine - 1);

			// ����ǲ������һ�У�selectionEnd����һ������Ϊ��ʹ�����ѡ������ͬһ��.
			if (intLine != totalLineCount) 
			{
				selectionEnd--;
			}

			// ��ý���.
			jTextArea.requestFocus();

			jTextArea.setSelectionStart(selectionStart);
			jTextArea.setSelectionEnd(selectionEnd);
		} 
		catch (Exception e) 
		{
			LOGGER.error(EditGotoAction.class, e);
		}
		
	}

}
