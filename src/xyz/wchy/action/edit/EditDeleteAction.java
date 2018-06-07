/**
* @FileName: EditDeleteAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditDeleteAction.java: 编辑操作菜单-删除事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditDeleteAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-删除事件.
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
* @Date: 2018年1月21日 上午12:43:51.
* 
*/
public class EditDeleteAction extends BaseAction 
{
	
	private static final JTextArea textArea = domain.getTextPane().getTextArea();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (StringUtils.isNotEmpty(textArea.getSelectedText())) 
		{
			textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
		}
	}

}
