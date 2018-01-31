/**
* @FileName: ReplaceAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: ReplaceAction.java: �滻����.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����1:43:20.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.dialog;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: ReplaceAction.java
* 
* @Description: 
* <p>
* �滻����.
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
* @Date: 2018��1��29�� ����1:43:20.
* 
*/
public class ReplaceAction extends BaseAction 
{
	
	/**
	 * �ı���.
	 */
	private static final JTextArea textArea = domain.getTextPane().getTextArea();
	
	/**
	 * �滻�༭��.
	 */
	private static final JTextField replaceText = domain.getReplaceText();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (StringUtils.isEmpty(replaceText.getText()) && StringUtils.isNotEmpty(textArea.getText())) 
		{
			textArea.replaceSelection("");
		} 
		
		if (StringUtils.isNotEmpty(replaceText.getText()) && StringUtils.isNotEmpty(textArea.getSelectedText())) 
		{
			textArea.replaceSelection(replaceText.getText());
		} 
		
		FindAction.getInstance().actionPerformed(e);
	}

}
