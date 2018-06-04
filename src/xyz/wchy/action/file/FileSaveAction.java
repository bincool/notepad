/**
* @FileName: FileSaveAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FileSaveAction.java: 文件操作菜单-保存事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.FileHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: FileSaveAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-保存事件：保存文本域内容到文件.
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
* @Date: 2018年1月16日 下午1:16:53.
* 
*/
public class FileSaveAction extends BaseAction 
{
	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		LOGGER.info(FileSaveAction.class, "Start to save.");
		
		String fileName = DomainHelper.getInstance().getFileName();
		String content = DomainHelper.getInstance().getTextPane().getTextArea().getText();
		if (StringUtils.isNotEmpty(fileName)) 
		{
			FileHelper.writeFile(fileName, content);
		} 
		else 
		{
			new FileSaveAsAction().actionPerformed(event);
		}
		
		LOGGER.info(FileSaveAction.class, "End to save.");
	}

}
