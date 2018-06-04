/**
* @FileName: FilePageSetAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FilePageSetAction.java: �ļ������˵�-ҳ�������¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;

import xyz.wchy.action.base.BaseAction;

/**
* @ClassName: FilePageSetAction.java
* 
* @Description: 
* <p>
* �ļ������˵�-ҳ�������¼�.
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
* @Date: 2018��1��16�� ����1:15:55.
* 
*/
public class FilePageSetAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		PrinterJob.getPrinterJob().pageDialog(new PageFormat());
	}

}
