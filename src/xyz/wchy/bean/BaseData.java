/**
* @FileName: BaseData.java
* @Package: xyz.wchy.bean
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: BaseData.java: �����������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.bean;

import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.Logger;

/**
* @ClassName: BaseData.java
* 
* @Description: 
* <p>
* �����������.
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
* @Date: 2018��1��24�� ����1:36:14.
* 
*/
public abstract class BaseData 
{
	
	/**
	 * �������.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
}
