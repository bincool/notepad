/**
* @FileName: FindAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: FindAction.java: 查找功能.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午11:50:46.
* @Content: 新增.
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
* 查找功能-查找选中后将前切、复制、删除按钮放开、.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年1月29日 上午11:50:46.
* 
*/
public class FindAction extends BaseAction 
{
	
	/**
	 * 文本域.
	 */
	private static final JTextArea textArea = domain.getTextPane().getTextArea();
	
	/**
	 * 查找编辑框.
	 */
	private static final JTextField findText = domain.getFindText();
    
	/**
	 * 大小写选择框.
	 */
	private static final JCheckBox matchCase = domain.getMatchCase();
    
	/**
	 * 向上查找.
	 */
	private static final JRadioButton up = domain.getUp();
    
	/**
	 * 向下查找.
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
        // "区分大小写"的CheckBox被选中  
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
            JOptionPane.showMessageDialog(null, "找不到您查找的内容!", "记事本", JOptionPane.INFORMATION_MESSAGE);  
        }
	}

}
