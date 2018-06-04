/**
* @FileName: SystemConfigHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: SystemConfigHelper.java: TODO һ�仰�����ļ�������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName: SystemConfigHelper.java
 * 
 * @Description:
 * <p>
 * ��ȡproperties�����ļ�.
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
 * @Date: 2018��1��15�� ����10:53:50.
 * 
 */
public class SystemConfigHelper 
{
	
	/**
	 * �����ļ�·��.
	 */
	private static final String configFilePath = "configs\\application.properties";

	/**
	 * ��������.
	 */
	private static SystemConfigHelper instance = null;

	/**
	 * ����map���漯��.
	 */
	private static Map<String, String> proMap = new HashMap<String, String>();

	/**
	 * ˽�й��캯��.
	 */
	private SystemConfigHelper() 
	{
		File file = new File(configFilePath);

		InputStream is = null;

		Properties pro = new Properties();

		try 
		{

			is = new FileInputStream(file);

			pro.load(is);

			Enumeration<?> e = pro.propertyNames();

			while (e.hasMoreElements()) 
			{

				String key = (String) e.nextElement();

				String value = (String) pro.get(key);

				proMap.put(key, value);

			}

		} 
		catch (IOException e) 
		{

			e.printStackTrace();

		} 
		finally 
		{
			try 
			{
				is.close();
			} 
			catch (IOException e) 
			{

				e.printStackTrace();
			}
		}
	}

	/**
	 * ��ȡ��������.
	 * @return
	 */
	public static SystemConfigHelper getInstance() 
	{
		if (instance == null) 
		{
			instance = new SystemConfigHelper();
		}

		return instance;
	}

	/**
	 * ��ȡ����map���漯��.
	 * @return
	 */
	public Map<String, String> getProMap() 
	{
		return proMap;
	}

}
