/**
* @FileName: StringUtils.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: StringUtils.java: �ַ���������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.utils;

/**
* @ClassName: StringUtils.java
* 
* @Description: 
* <p>
* �ַ���������.
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
* @Date: 2018��1��21�� ����3:59:01.
* 
*/
public class StringUtils 
{
	
	/**
	 * �ַ���Ϊ��.
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) 
	{
		return null == str || "".equals(str);
	}
	
	/**
	 * �ַ�����Ϊ��.
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) 
	{
		return !isEmpty(str);
	}
	
}
