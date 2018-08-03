/**
* @FileName: Logger.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: Logger.java: 简易日志类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.io.File;
import java.io.PrintStream;

import xyz.wchy.constant.SystemConstant;

/**
* @ClassName: Logger.java
* 
* @Description: 
* <p>
* 简易日志类.
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
* @Date: 2018年1月21日 上午1:03:58.
* 
*/
public class Logger 
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = new Logger();
	
	/**
	 * 私有构造函数.
	 */
	private Logger() 
	{
		File file = null;
		PrintStream out = null;
		try 
		{
			FileHelper.createFilePath("logs");
			String pathName = "logs" + SystemConstant.DIR_SEPARATOR + "bincool_" + DateUtils.getDays() + ".log";
			FileHelper.createFile(pathName);
			String fileContent = FileHelper.readToString(pathName);
			file = new File(pathName);
			out = new PrintStream(file);
			System.setOut(out);
			System.setErr(out);
			if (null != fileContent) 
			{
				System.out.println(fileContent);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}
	
	/**
	 * 获取日志对象.
	 * @param classT
	 * @return
	 */
	public static Logger getLogger() 
	{
		return LOGGER;
	}
	
	/**
	 * 记录日志.
	 * @param info
	 */
	public void info(Class<?> className, Object info) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("【");
		sb.append(DateUtils.getTime());
		sb.append("】");
		sb.append("【info】【");
		sb.append(className);
		sb.append('】');
		sb.append(info);
		System.out.println(sb);
	}
	
	/**
	 * 记录错误日志.
	 * @param info
	 */
	public void error(Class<?> className, Object info) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("【");
		sb.append(DateUtils.getTime());
		sb.append("】");
		sb.append("【error】【");
		sb.append(className);
		sb.append('】');
		sb.append(info);
		System.err.println(sb);
	}
	
}
