/**
* @FileName: DateUtils.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: DateUtils.java: ���ڹ�����.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @ClassName: DateUtils.java
* 
* @Description: 
* <p>
* ���ڹ�����.
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
* @Date: 2018��1��21�� ����5:22:44.
* 
*/
public class DateUtils 
{
	
	/**
	 * yyyyMMdd��ʽ.
	 */
	private final static DateFormat SDF_DAY_NUMBER = new SimpleDateFormat("yyyyMMdd");

	/**
	 * yyyy-MM-dd HH:mm:ss��ʽ.
	 */
	private final static DateFormat SDF_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * ��ȡYYYYMMDD��ʽ.
	 * @return
	 */
	public static String getDays()
	{
		return SDF_DAY_NUMBER.format(new Date());
	}

	/**
	 * ��ȡYYYY-MM-DD HH:mm:ss��ʽ.
	 *
	 * @return
	 */
	public static String getTime()
	{
		return SDF_TIME.format(new Date());
	}
	
}
