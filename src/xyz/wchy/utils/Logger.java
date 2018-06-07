/**
* @FileName: Logger.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: Logger.java: ������־��.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* ������־��.
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
* @Date: 2018��1��21�� ����1:03:58.
* 
*/
public class Logger 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = new Logger();
	
	/**
	 * ˽�й��캯��.
	 */
	private Logger() 
	{
		File file = null;
		PrintStream out = null;
		try 
		{
			FileHelper.createFilePath("logs");
			String pathName = "logs" + SystemConstant.DIR_SEPARATOR + "lfclass_" + DateUtils.getDays() + ".log";
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
	 * ��ȡ��־����.
	 * @param classT
	 * @return
	 */
	public static Logger getLogger() 
	{
		return LOGGER;
	}
	
	/**
	 * ��¼��־.
	 * @param info
	 */
	public void info(Class<?> className, Object info) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("��");
		sb.append(DateUtils.getTime());
		sb.append("��");
		sb.append("��info����");
		sb.append(className);
		sb.append('��');
		sb.append(info);
		System.out.println(sb);
	}
	
	/**
	 * ��¼������־.
	 * @param info
	 */
	public void error(Class<?> className, Object info) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("��");
		sb.append(DateUtils.getTime());
		sb.append("��");
		sb.append("��error����");
		sb.append(className);
		sb.append('��');
		sb.append(info);
		System.err.println(sb);
	}
	
}
