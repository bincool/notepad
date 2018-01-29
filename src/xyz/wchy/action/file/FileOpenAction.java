/**
* @FileName: FileOpenAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: FileOpenAction.java: �ļ������˵�-���¼�.
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
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: FileOpenAction.java
* 
* @Description: 
* <p>
* �ļ������˵�-���¼�.
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
* @Date: 2018��1��16�� ����1:12:47.
* 
*/
public class FileOpenAction extends BaseAction 
{

	/* ���ļ�ǰӦ����ʾ�Ƿ��ȱ��浱ǰ�ļ�.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) 
	{ 
		// �ļ�ѡ�����.
		JFileChooser jFileChooser = new JFileChooser();
		
		// ��������.
		jFileChooser.setDialogTitle("��ѡ���ļ�...");
		
		// Ĭ�Ϸ�ʽ.
		int value = jFileChooser.showOpenDialog(domain.getFrame());
		
		// �����ļ�,��Ҫ���ļ�·�����浽�������.
		if (value == JFileChooser.APPROVE_OPTION) 
		{
			// ��ʾ.
			jFileChooser.setVisible(true);
			
			// �õ��û�ѡ����ļ�·��.
			String fileName = jFileChooser.getSelectedFile().getAbsolutePath();
			
			// ��ȡ�ļ�����.
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
