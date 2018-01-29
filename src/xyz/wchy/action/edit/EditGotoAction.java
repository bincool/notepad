/**
* @FileName: EditGotoAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditGotoAction.java: 编辑操作菜单-转到事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditGotoAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-转到事件.
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
* @Date: 2018年1月21日 上午12:46:50.
* 
*/
public class EditGotoAction extends BaseAction 
{
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.
	 * ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// 获取文本域.
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		// 取得总行数.
		int totalLineCount = jTextArea.getLineCount();
		if (totalLineCount < 1) 
		{
			return;
		}
		String line = JOptionPane.showInputDialog(null, "行号(L):\n", "转到指定行", JOptionPane.PLAIN_MESSAGE);
		if (StringUtils.isEmpty(line)) 
		{
			return;
		}
		try 
		{
			int intLine = Integer.parseInt(line);
			if (intLine > totalLineCount) 
			{
				return;
			}
			
			// JTextArea起始行号是0，所以此处做减一处理.
			int selectionStart = jTextArea.getLineStartOffset(intLine - 1);
			int selectionEnd = jTextArea.getLineEndOffset(intLine - 1);

			// 如果是不是最后一行，selectionEnd做减一处理，是为了使光标与选中行在同一行.
			if (intLine != totalLineCount) 
			{
				selectionEnd--;
			}

			// 获得焦点.
			jTextArea.requestFocus();

			jTextArea.setSelectionStart(selectionStart);
			jTextArea.setSelectionEnd(selectionEnd);
		} 
		catch (Exception e) 
		{
			LOGGER.error(EditGotoAction.class, e);
		}
		
	}

}
