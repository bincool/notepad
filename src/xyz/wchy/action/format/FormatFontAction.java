/**
* @FileName: FormatFontAction.java
* @Package: xyz.wchy.action.format
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FormatFontAction.java: ��ʽ�����˵�-�����¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.format;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.dialog.format.FontDialog;

/**
* @ClassName: FormatFontAction.java
* 
* @Description: 
* <p>
* ��ʽ�����˵�-�����¼�.
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
* @Date: 2018��1��21�� ����12:52:55.
* 
*/
public class FormatFontAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		FontDialog.getInstance(domain.getFrame());
	}

}
