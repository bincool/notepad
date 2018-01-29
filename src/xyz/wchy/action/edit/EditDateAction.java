/**
* @FileName: EditDateAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditDateAction.java: �༭�����˵�-ʱ��/�����¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DateUtils;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditDateAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-ʱ��/�����¼�.
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
* @Date: 2018��1��21�� ����12:47:45.
* 
*/
public class EditDateAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// ��ȡ�ı���.
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		// ��ȡ��ǰ�༭���й���λ��.
		int index = jTextArea.getCaretPosition();
		
		// �������ڸ�ʽ.
        String localTime = DateUtils.getTime();
        
        String newString = jTextArea.getText().substring(0, index) + localTime + jTextArea.getText().substring(index, jTextArea.getText().length());
        
        // ��ƴ�Ӻõ��ַ�����ʾ����.
        jTextArea.setText("");
        jTextArea.append(newString);
	}
	
	
	
}
