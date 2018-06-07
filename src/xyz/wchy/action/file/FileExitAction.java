/**
* @FileName: FileExitAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FileExitAction.java: �ļ������˵�-�˳��¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;


/**
* @ClassName: FileExitAction.java
* 
* @Description: 
* <p>
* �ļ������˵�-�˳��¼�.
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
* @Date: 2018��1��16�� ����1:12:10.
* 
*/
public class FileExitAction extends BaseAction 
{

	/* �˳��ļ�ǰӦ����ʾ�Ƿ��ȱ��浱ǰ�ļ�.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		new FileNewAction().actionPerformed(e);
        
		System.exit(0);
	}

}
