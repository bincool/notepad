/**
* @FileName: ViewStatusBarAction.java
* @Package: xyz.wchy.action.view
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ViewStatusBarAction.java: �鿴�����˵�-״̬���¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.view;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: ViewStatusBarAction.java
* 
* @Description: 
* <p>
* �鿴�����˵�-״̬���¼�.
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
* @Date: 2018��1��21�� ����12:53:46.
* 
*/
public class ViewStatusBarAction extends BaseAction 
{
	
	/**
	 * �������.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		domain.getToolState().setVisible(!domain.getToolState().isVisible());
	}

}
