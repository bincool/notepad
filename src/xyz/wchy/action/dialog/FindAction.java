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
		int a = 0, b = 0;  
        int FindStartPos = textArea.getCaretPosition();  
        String str1, str2, str3, str4, strA, strB;  
        str1 = textArea.getText();  
        str2 = str1.toLowerCase();  
        str3 = findText.getText();  
        str4 = str3.toLowerCase();  
        // "���ִ�Сд"��CheckBox��ѡ��  
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
            JOptionPane.showMessageDialog(null, "�Ҳ��������ҵ�����!", "���±�", JOptionPane.INFORMATION_MESSAGE);  
        }
	}

}
