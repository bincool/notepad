/**
* @FileName: CancelAction.java
* @Package: xyz.wchy.action.dialog
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: CancelAction.java: 对话框取消功能.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 下午12:53:29.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.dialog;

import java.awt.event.ActionEvent;

import javax.swing.JDialog;

import xyz.wchy.action.base.BaseAction;

/**
* @ClassName: CancelAction.java
* 
* @Description: 
* <p>
* 对话框取消功能.
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
* @Date: 2018年1月29日 下午12:53:29.
* 
*/
public class CancelAction extends BaseAction 
{
	
	/**
	 * 对话框.
	 */
	private JDialog jDialog = null;
	
	/**
	 * 构造函数.
	 */
	public CancelAction(JDialog jDialog) 
	{
		this.jDialog = jDialog;
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		jDialog.dispose();
	}
	
}
