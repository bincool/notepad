/**
* @FileName: HelpViewAction.java
* @Package: xyz.wchy.action.help
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: HelpViewAction.java: ���������˵�-�鿴�����¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.help;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.help.HelpAboutDialog;

/**
* @ClassName: HelpViewAction.java
* 
* @Description: 
* <p>
* ���������˵�-�鿴�����¼�.
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
* @Date: 2018��1��21�� ����12:54:13.
* 
*/
public class HelpViewAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		HelpAboutDialog helpAboutDialog = HelpAboutDialog.getInstance(domain.getFrame());
		helpAboutDialog.initDialog();
	}

}
