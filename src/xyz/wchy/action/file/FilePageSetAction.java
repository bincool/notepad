/**
* @FileName: FilePageSetAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FilePageSetAction.java: 文件操作菜单-页面设置事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;

import xyz.wchy.action.base.BaseAction;

/**
* @ClassName: FilePageSetAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-页面设置事件.
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
* @Date: 2018年1月16日 下午1:15:55.
* 
*/
public class FilePageSetAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		PrinterJob.getPrinterJob().pageDialog(new PageFormat());
	}

}
