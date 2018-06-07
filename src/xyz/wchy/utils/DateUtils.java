/**
* @FileName: DateUtils.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: DateUtils.java: 日期工具类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 日期工具类.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年1月21日 上午5:22:44.
* 
*/
public class DateUtils 
{
	
	/**
	 * yyyyMMdd格式.
	 */
	private final static DateFormat SDF_DAY_NUMBER = new SimpleDateFormat("yyyyMMdd");

	/**
	 * yyyy-MM-dd HH:mm:ss格式.
	 */
	private final static DateFormat SDF_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 获取YYYYMMDD格式.
	 * @return
	 */
	public static String getDays()
	{
		return SDF_DAY_NUMBER.format(new Date());
	}

	/**
	 * 获取YYYY-MM-DD HH:mm:ss格式.
	 *
	 * @return
	 */
	public static String getTime()
	{
		return SDF_TIME.format(new Date());
	}
	
}
