/**
* @FileName: FileOpenAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: FileOpenAction.java: 文件操作菜单-打开事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.FileHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: FileOpenAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-打开事件.
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
* @Date: 2018年1月16日 下午1:12:47.
* 
*/
public class FileOpenAction extends BaseAction 
{

	/* 打开文件前应该提示是否先保存当前文件.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) 
	{ 
		// 文件选择组件.
		JFileChooser jFileChooser = new JFileChooser();
		
		// 设置名字.
		jFileChooser.setDialogTitle("请选择文件...");
		
		// 默认方式.
		int value = jFileChooser.showOpenDialog(domain.getFrame());
		
		// 打开了文件,需要将文件路径保存到领域对象.
		if (value == JFileChooser.APPROVE_OPTION) 
		{
			// 显示.
			jFileChooser.setVisible(true);
			
			// 得到用户选择的文件路径.
			String fileName = jFileChooser.getSelectedFile().getAbsolutePath();
			
			// 读取文件内容.
			String text = FileHelper.readToString(fileName);
			DomainHelper.getInstance().getTextPane().getTextArea().setText(text);
			DomainHelper.getInstance().setFileName(fileName);
			
			if (StringUtils.isEmpty(text)) 
			{
				DomainHelper.getInstance().getMenuEditFind().setEnabled(false);
	            DomainHelper.getInstance().getMenuEditFindNext().setEnabled(false);
			} 
			else 
			{
				DomainHelper.getInstance().getMenuEditFind().setEnabled(true);
	            DomainHelper.getInstance().getMenuEditFindNext().setEnabled(true);
			}
		}
	}

}
