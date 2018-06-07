/**
* @FileName: FormatFontAction.java
* @Package: xyz.wchy.action.format
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FormatFontAction.java: 格式操作菜单-字体事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.format;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.format.FontDialog;

/**
* @ClassName: FormatFontAction.java
* 
* @Description: 
* <p>
* 格式操作菜单-字体事件.
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
* @Date: 2018年1月21日 上午12:52:55.
* 
*/
public class FormatFontAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		FontDialog.getInstance(domain.getFrame());
	}

}
