/**
* @FileName: ReplaceAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: ReplaceAction.java: 替换功能.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 下午1:43:20.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.dialog;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: ReplaceAction.java
* 
* @Description: 
* <p>
* 替换功能.
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
* @Date: 2018年1月29日 下午1:43:20.
* 
*/
public class ReplaceAction extends BaseAction 
{
	
	/**
	 * 文本域.
	 */
	private static final JTextArea textArea = domain.getTextPane().getTextArea();
	
	/**
	 * 替换编辑框.
	 */
	private static final JTextField replaceText = domain.getReplaceText();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (StringUtils.isEmpty(replaceText.getText()) && StringUtils.isNotEmpty(textArea.getText())) 
		{
			textArea.replaceSelection("");
		} 
		
		if (StringUtils.isNotEmpty(replaceText.getText()) && StringUtils.isNotEmpty(textArea.getSelectedText())) 
		{
			textArea.replaceSelection(replaceText.getText());
		} 
		
		FindAction.getInstance().actionPerformed(e);
	}

}
