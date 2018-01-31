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
	 * 查找action单例类.
	 */
	private static FindAction instance = null;
	
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
	
	private FindAction() 
	{
	}
	
	/**
	 * 获取关于记事本对话框单例对象.
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

		// "区分大小写"的CheckBox被选中.
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
			JOptionPane.showMessageDialog(domain.getFrame(), "找不到\"" + findStr + "\"", "记事本", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
