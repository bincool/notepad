/**
* @FileName: BaseAction.java
* @Package: xyz.wchy.action.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseAction.java: �������¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import xyz.wchy.bean.BaseData;

/**
* @ClassName: BaseAction.java
* 
* @Description: 
* <p>
* �������¼��������ʾ��"������δ���ţ������ڴ�".
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
* @Date: 2018��1��29�� ����10:13:40.
* 
*/
public class BaseAction extends BaseData implements ActionListener 
{
	
	/**
	 * �޲ι��캯��.
	 */
	public BaseAction() 
	{
		super();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info(BaseAction.class, "�ù�����δ���ţ������ڴ�...");
		JOptionPane.showMessageDialog(domain.getFrame(), "�ù�����δ���ţ������ڴ�...", "Notepad", JOptionPane.WARNING_MESSAGE);
	}

}
