/**
* @FileName: FileSaveAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FileSaveAction.java: �ļ������˵�-�����¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �ļ������˵�-�����¼��������ı������ݵ��ļ�.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��1��16�� ����1:16:53.
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
