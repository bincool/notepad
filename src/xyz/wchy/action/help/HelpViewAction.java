/**
* @FileName: HelpViewAction.java
* @Package: xyz.wchy.action.help
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: HelpViewAction.java: 帮助操作菜单-查看帮组事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.help;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.help.HelpAboutDialog;

/**
* @ClassName: HelpViewAction.java
* 
* @Description: 
* <p>
* 帮助操作菜单-查看帮组事件.
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
* @Date: 2018年1月21日 上午12:54:13.
* 
*/
public class HelpViewAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		HelpAboutDialog helpAboutDialog = HelpAboutDialog.getInstance(domain.getFrame());
		helpAboutDialog.initDialog();
	}

}
