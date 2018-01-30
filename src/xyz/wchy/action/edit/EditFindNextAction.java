/**
* @FileName: EditFindNextAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditFindNextAction.java: 编辑操作菜单-查找下一个事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.action.dialog.FindAction;
import xyz.wchy.dialog.edit.EditFindDialog;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditFindNextAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-查找下一个事件.
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
* @Date: 2018年1月21日 上午12:45:41.
* 
*/
public class EditFindNextAction extends BaseAction 
{
	
	/**
	 * 查找编辑框.
	 */
	private static final JTextField findText = domain.getFindText();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (StringUtils.isEmpty(findText.getText())) 
		{
			EditFindDialog.getInstance(domain.getFrame()).initDialog();
		} 
		else 
		{
			new FindAction().actionPerformed(e);
		}
	}

}
