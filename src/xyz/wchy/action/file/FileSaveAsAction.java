/**
* @FileName: FileSaveAsAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: FileSaveAsAction.java: �ļ������˵�-���Ϊ�¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �ļ������˵�-���Ϊ�¼������Ϊ֮ǰ����ʾ���浱ǰ�ı���.
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
* @Date: 2018��1��16�� ����1:14:25.
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
		
		// �򿪱����.
        JFileChooser jFileChooser = new JFileChooser();
        
        // ѡ���ļ�.  
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
