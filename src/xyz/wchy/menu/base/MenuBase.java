/**
* @FileName: MenuBase.java
* @Package: xyz.wchy.menu.base
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: MenuBase.java: �˵�����.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.menu.base;

import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: MenuBase.java
* 
* @Description: 
* <p>
* �˵����ࣺ���±��˵���Ϊһ���˵��Ͷ�������¼��˵�.
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
* @Date: 2018��1��19�� ����2:25:42.
* 
*/
public abstract class MenuBase 
{
	
	/**
	 * �������.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * ��ʼ���˵�.
	 */
	protected abstract void initMenu();
	
	/**
	 * ���˵����¼�.
	 */
	protected abstract void bindActionListener();
	
}
