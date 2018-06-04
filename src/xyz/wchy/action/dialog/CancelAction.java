/**
* @FileName: CancelAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: CancelAction.java: �Ի���ȡ������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����12:53:29.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.dialog;

import java.awt.event.ActionEvent;

import javax.swing.JDialog;

import xyz.wchy.action.base.BaseAction;

/**
* @ClassName: CancelAction.java
* 
* @Description: 
* <p>
* �Ի���ȡ������.
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
* @Date: 2018��1��29�� ����12:53:29.
* 
*/
public class CancelAction extends BaseAction 
{
	
	/**
	 * �Ի���.
	 */
	private JDialog jDialog = null;
	
	/**
	 * ���캯��.
	 */
	public CancelAction(JDialog jDialog) 
	{
		this.jDialog = jDialog;
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		jDialog.dispose();
	}
	
}
