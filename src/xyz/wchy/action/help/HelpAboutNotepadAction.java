/**
* @FileName: HelpAboutNotepadAction.java
* @Package: xyz.wchy.action.help
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: HelpAboutNotepadAction.java: ���������˵�-���ڼ��±��¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.help;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.help.HelpDialog;

/**
* @ClassName: HelpAboutNotepadAction.java
* 
* @Description: 
* <p>
* ���������˵�-���ڼ��±��¼�.
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
* @Date: 2018��1��21�� ����12:54:51.
* 
*/
public class HelpAboutNotepadAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		HelpDialog helpDialog = HelpDialog.getInstance(domain.getFrame());
		helpDialog.initDialog();
	}

}
