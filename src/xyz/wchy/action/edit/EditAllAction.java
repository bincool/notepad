/**
* @FileName: EditAllAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: EditAllAction.java: �༭�����˵�-ȫѡ�¼�.
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
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditAllAction.java
* 
* @Description: 
* <p>
* �༭�����˵�-ȫѡ�¼�.
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
* @Date: 2018��1��21�� ����12:47:13.
* 
*/
public class EditAllAction extends BaseAction 
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
		jTextArea.selectAll();
		
		// �����ݲ�Ϊ�գ�˵��ȫѡ�����ݣ������Ҫ��"ɾ��" "����" "����"��������ť���óɿ�ѡ.
        if(StringUtils.isNotEmpty(jTextArea.getText())) 
        {
        	DomainHelper.getInstance().getMenuEditTrim().setEnabled(true);
        	DomainHelper.getInstance().getMenuEditCopy().setEnabled(true);
        	DomainHelper.getInstance().getMenuEditDelete().setEnabled(true);
        } 
        else 
        {
        	DomainHelper.getInstance().getMenuEditTrim().setEnabled(false);
        	DomainHelper.getInstance().getMenuEditCopy().setEnabled(false);
        	DomainHelper.getInstance().getMenuEditDelete().setEnabled(false);
        }
	}
	
}
