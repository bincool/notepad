/**
* @FileName: FilePagePrintAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FilePagePrintAction.java: 文件操作菜单-打印事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;

/**
* @ClassName: FilePagePrintAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-打印事件.
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
* @Date: 2018年1月16日 下午1:15:19.
* 
*/
public class FilePagePrintAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		PrintJob printJob = Toolkit.getDefaultToolkit().getPrintJob(domain.getFrame(), "打印", null);
		Graphics graphics = printJob.getGraphics();
		domain.getTextPane().getTextArea().printAll(graphics);
		printJob.end();
	}

}
