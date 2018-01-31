/**
* @FileName: FindAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: FindAction.java: ���ҹ���.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����11:50:46.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.dialog;

import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import xyz.wchy.action.base.BaseAction;

/**
* @ClassName: FindAction.java
* 
* @Description: 
* <p>
* ���ҹ���-����ѡ�к�ǰ�С����ơ�ɾ����ť�ſ���.
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
* @Date: 2018��1��29�� ����11:50:46.
* 
*/
public class FindAction extends BaseAction 
{
	
	/**
	 * ����action������.
	 */
	private static FindAction instance = null;
	
	/**
	 * �ı���.
	 */
	private static final JTextArea textArea = domain.getTextPane().getTextArea();

	/**
	 * ���ұ༭��.
	 */
	private static final JTextField findText = domain.getFindText();

	/**
	 * ��Сдѡ���.
	 */
	private static final JCheckBox matchCase = domain.getMatchCase();

	/**
	 * ���ϲ���.
	 */
	private static final JRadioButton up = domain.getUp();
	
	private FindAction() 
	{
	}
	
	/**
	 * ��ȡ���ڼ��±��Ի���������.
	 * @param owner
	 * @return
	 */
	public static FindAction getInstance() 
	{
		if (null == instance) 
		{
			instance = new FindAction();
		}
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int index = -1;

		String textStr = textArea.getText().toLowerCase();
		String findStr = findText.getText().toLowerCase();

		// "���ִ�Сд"��CheckBox��ѡ��.
		if (matchCase.isSelected()) 
		{
			textStr = textArea.getText();
			findStr = findText.getText();
		}
		
		if (up.isSelected()) 
		{
			textStr = textStr.substring(0, textArea.getSelectionStart());
			index = textStr.lastIndexOf(findStr, textArea.getSelectionStart());
		} 
		else 
		{
			index = textStr.indexOf(findStr, textArea.getSelectionEnd());
		}
		
		if (index > -1) 
		{
			textArea.select(index, index + findStr.length());
			return;
		} 
		else 
		{
			JOptionPane.showMessageDialog(domain.getFrame(), "�Ҳ���\"" + findStr + "\"", "���±�", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
