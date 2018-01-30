/**
* @FileName: FilePagePrintAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: FilePagePrintAction.java: �ļ������˵�-��ӡ�¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �ļ������˵�-��ӡ�¼�.
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
* @Date: 2018��1��16�� ����1:15:19.
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
		PrintJob printJob = Toolkit.getDefaultToolkit().getPrintJob(domain.getFrame(), "��ӡ", null);
		Graphics graphics = printJob.getGraphics(); 
        domain.getTextPane().getTextArea().printAll(graphics);  
        printJob.end();
	}

}
