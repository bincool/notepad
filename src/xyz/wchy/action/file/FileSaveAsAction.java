/**
* @FileName: FileSaveAsAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FileSaveAsAction.java: 文件操作菜单-另存为事件.
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

/**
* @ClassName: FileSaveAsAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-另存为事件：另存为之前先提示保存当前文本域.
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
* @Date: 2018年1月16日 下午1:14:25.
* 
*/
public class FileSaveAsAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info(FileSaveAsAction.class, "Start to save as.");
		
		// 打开保存框.
        JFileChooser jFileChooser = new JFileChooser();
        
        // 选择文件.  
        int value = jFileChooser.showSaveDialog(null);  
        if (value == JFileChooser.APPROVE_OPTION) 
        {
            String content = DomainHelper.getInstance().getTextPane().getTextArea().getText();
            String fileName = jFileChooser.getSelectedFile().getAbsolutePath();
            FileHelper.writeFile(fileName, content);
            DomainHelper.getInstance().setFileName(fileName);
        } 
        
        LOGGER.info(FileSaveAsAction.class, "End to save as.");
	}

}
