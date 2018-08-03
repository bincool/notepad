/**
* @FileName: EditFindAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditFindAction.java: 编辑操作菜单-查找事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.edit.EditFindDialog;

/**
* @ClassName: EditFindAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-查找事件.
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
* @Date: 2018年1月21日 上午12:45:16.
* 
*/
public class EditFindAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		EditFindDialog.getInstance(domain.getFrame()).initDialog();
	}

}
