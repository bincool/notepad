/**
* @FileName: ReplaceAllAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ReplaceAllAction.java: 替换全部功能.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
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
* @ClassName: ReplaceAllAction.java
* 
* @Description: 
* <p>
* 替换全部功能.
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
* @Date: 2018年1月26日 上午11:50:34.
* 
*/
public class ReplaceAllAction extends BaseAction 
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
	 * 替换编辑框.
	 */
	private static final JTextField replaceText = domain.getReplaceText();
    
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
		textArea.setCaretPosition(0); // 将光标放到编辑区开头  
        int a = 0, b = 0, replaceCount = 0;  

        if (findText.getText().length() == 0) 
        {  
            JOptionPane.showMessageDialog(null, "请填写查找内容!", "提示", JOptionPane.WARNING_MESSAGE);  
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
                    JOptionPane.showMessageDialog(null, "找不到您查找的内容!", "记事本", JOptionPane.INFORMATION_MESSAGE);  
                } 
                else 
                {  
                    JOptionPane.showMessageDialog(null, "成功替换" + replaceCount + "个匹配内容!", "替换成功", JOptionPane.INFORMATION_MESSAGE);  
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
