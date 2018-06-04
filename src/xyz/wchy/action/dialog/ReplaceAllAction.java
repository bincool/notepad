/**
* @FileName: ReplaceAllAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: ReplaceAllAction.java: �滻ȫ������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
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
* @ClassName: ReplaceAllAction.java
* 
* @Description: 
* <p>
* �滻ȫ������.
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
* @Date: 2018��1��26�� ����11:50:34.
* 
*/
public class ReplaceAllAction extends BaseAction 
{
	
	/**
	 * �ı���.
	 */
	private static final JTextArea textArea = domain.getTextPane().getTextArea();
	
	/**
	 * ���ұ༭��.
	 */
	private static final JTextField findText = domain.getFindText();
	
	/**
	 * �滻�༭��.
	 */
	private static final JTextField replaceText = domain.getReplaceText();
    
	/**
	 * ��Сдѡ���.
	 */
	private static final JCheckBox matchCase = domain.getMatchCase();
    
	/**
	 * ���ϲ���.
	 */
	private static final JRadioButton up = domain.getUp();
    
	/**
	 * ���²���.
	 */
	private static final JRadioButton down = domain.getDown();
	
	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		textArea.setCaretPosition(0); // �����ŵ��༭����ͷ  
        int a = 0, b = 0, replaceCount = 0;  

        if (findText.getText().length() == 0) 
        {  
            JOptionPane.showMessageDialog(null, "����д��������!", "��ʾ", JOptionPane.WARNING_MESSAGE);  
            findText.requestFocus(true);  
            return;  
        }  
        while (a > -1) 
        {  

            int FindStartPos = textArea.getCaretPosition();  
            String str1, str2, str3, str4, strA, strB;  
            str1 = textArea.getText();  
            str2 = str1.toLowerCase();  
            str3 = findText.getText();  
            str4 = str3.toLowerCase();  

            if (matchCase.isSelected()) 
            {  
                strA = str1;  
                strB = str3;  
            } 
            else 
            {  
                strA = str2;  
                strB = str4;  
            }  

            if (up.isSelected()) 
            {  
                if (textArea.getSelectedText() == null) 
                {  
                    a = strA.lastIndexOf(strB, FindStartPos - 1);  
                } 
                else 
                {  
                    a = strA.lastIndexOf(strB, FindStartPos - findText.getText().length() - 1);  
                }  
            } 
            else if (down.isSelected()) 
            {  
                if (textArea.getSelectedText() == null) 
                {
                    a = strA.indexOf(strB, FindStartPos);  
                } 
                else 
                {
                    a = strA.indexOf(strB, FindStartPos - findText.getText().length() + 1);  
                }
            }  

            if (a > -1) 
            {
                if (up.isSelected()) 
                {
                    textArea.setCaretPosition(a);  
                    b = findText.getText().length();  
                    textArea.select(a, a + b);  
                } 
                else if (down.isSelected()) 
                {
                    textArea.setCaretPosition(a);  
                    b = findText.getText().length();  
                    textArea.select(a, a + b);  
                }  
            } 
            else 
            {  
                if (replaceCount == 0) 
                {  
                    JOptionPane.showMessageDialog(null, "�Ҳ��������ҵ�����!", "���±�", JOptionPane.INFORMATION_MESSAGE);  
                } 
                else 
                {  
                    JOptionPane.showMessageDialog(null, "�ɹ��滻" + replaceCount + "��ƥ������!", "�滻�ɹ�", JOptionPane.INFORMATION_MESSAGE);  
                }  
            }  
            if (replaceText.getText().length() == 0 && textArea.getSelectedText() != null) 
            {  
                textArea.replaceSelection("");  
                replaceCount++;  
            }  
            if (replaceText.getText().length() > 0 && textArea.getSelectedText() != null) 
            {  
                textArea.replaceSelection(replaceText.getText());  
                replaceCount++;  
            }  
        }
	}
	
}
