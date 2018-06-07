/**
* @FileName: FileNewAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FileNewAction.java: 文件操作菜单-新建事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.FileHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: FileNewAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-新建事件.
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
* @Date: 2018年1月16日 下午1:12:31.
* 
*/
public class FileNewAction extends BaseAction 
{

	/**
	 * 新建文件前应该提示是否先保存.
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		String fileName = DomainHelper.getInstance().getFileName();
		String content = jTextArea.getText();
		
		if(StringUtils.isNotEmpty(fileName) && StringUtils.isNotEmpty(content)) 
		{
			String tips = "是否将更改保存到\n" + fileName;
            int value = JOptionPane.showConfirmDialog(domain.getFrame(), tips, "记事本", JOptionPane.YES_NO_CANCEL_OPTION);
            if(2 == value) 
            {
            	// 取消，.
            	return ;
            } 
            else if(1 == value) 
            {
            	// 返回否，.
            } 
            else if(0 == value) 
            {
            	// 返回是，执行保存操作然后初始化.
            	FileHelper.writeFile(fileName, content);
            }
        } 
		else 
		{
			String tips = "是否将更改保存到\n无标题";
            int value = JOptionPane.showConfirmDialog(domain.getFrame(), tips, "记事本", JOptionPane.YES_NO_CANCEL_OPTION);
            if(2 == value) 
            {
            	// 取消，.
            	return ;
            } 
            else if(1 == value) 
            {
            	// 返回否，.
            } 
            else if(0 == value) 
            {
            	// 返回是，执行保存操作然后初始化.
            	new FileSaveAsAction().actionPerformed(e);
            }
		}
        jTextArea.setText("");
        DomainHelper.getInstance().setFileName(null);
	}

}
