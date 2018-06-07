/**
* @FileName: FileNewAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FileNewAction.java: �ļ������˵�-�½��¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �ļ������˵�-�½��¼�.
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
* @Date: 2018��1��16�� ����1:12:31.
* 
*/
public class FileNewAction extends BaseAction 
{

	/**
	 * �½��ļ�ǰӦ����ʾ�Ƿ��ȱ���.
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		String fileName = DomainHelper.getInstance().getFileName();
		String content = jTextArea.getText();
		
		if(StringUtils.isNotEmpty(fileName) && StringUtils.isNotEmpty(content)) 
		{
			String tips = "�Ƿ񽫸��ı��浽\n" + fileName;
            int value = JOptionPane.showConfirmDialog(domain.getFrame(), tips, "���±�", JOptionPane.YES_NO_CANCEL_OPTION);
            if(2 == value) 
            {
            	// ȡ����.
            	return ;
            } 
            else if(1 == value) 
            {
            	// ���ط�.
            } 
            else if(0 == value) 
            {
            	// �����ǣ�ִ�б������Ȼ���ʼ��.
            	FileHelper.writeFile(fileName, content);
            }
        } 
		else 
		{
			String tips = "�Ƿ񽫸��ı��浽\n�ޱ���";
            int value = JOptionPane.showConfirmDialog(domain.getFrame(), tips, "���±�", JOptionPane.YES_NO_CANCEL_OPTION);
            if(2 == value) 
            {
            	// ȡ����.
            	return ;
            } 
            else if(1 == value) 
            {
            	// ���ط�.
            } 
            else if(0 == value) 
            {
            	// �����ǣ�ִ�б������Ȼ���ʼ��.
            	new FileSaveAsAction().actionPerformed(e);
            }
		}
        jTextArea.setText("");
        DomainHelper.getInstance().setFileName(null);
	}

}
