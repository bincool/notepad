/**
* @FileName: FileHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FileHelper.java: �ļ�����������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

import xyz.wchy.constant.SystemConstant;

/**
* @ClassName: FileHelper.java
* 
* @Description: 
* <p>
* �ļ�����������.
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
* @Date: 2018��1��21�� ����1:18:19.
* 
*/
public class FileHelper 
{
	
	/**
	 * �ļ�����.
	 */
	private static File file = null;
	
	/**
	 * �����ļ�·��.
	 * @param filePath
	 */
	public static void createFilePath(String filePath) 
	{
		file = new File(filePath);
		
		// ����ļ��в������򴴽�.
		if  (!file.exists()  && !file.isDirectory())
		{
		    file.mkdir();
		} 
	}
	
	/**
	 * �����ļ�.
	 * @param fileName
	 */
	public static void createFile(String fileName) 
	{
		file = new File(fileName);
		if(!file.exists())
		{
		    try 
		    {
		        file.createNewFile();    
		    } 
		    catch (IOException e) 
		    {   
		        e.printStackTrace();    
		    }
		}
	}
	
	/**
	 * �����ļ�.
	 * @param filePath
	 * @param fileName
	 */
	public static void createFile(String filePath, String fileName) 
	{
		file = new File(fileName + SystemConstant.DIR_SEPARATOR + fileName);
		if(!file.exists())
		{
		    try 
		    {
		        file.createNewFile();    
		    } 
		    catch (IOException e) 
		    {   
		        e.printStackTrace();    
		    }
		}
	}
	
	/**
	 * ���ļ���д����.
	 * @param fileName
	 * @param content
	 */
	public static void writeFile(String fileName, String content) 
	{
		Writer writer = null;
		BufferedWriter out = null;
        try 
        {
        	writer = new FileWriter(fileName);
            out = new BufferedWriter(writer);
            out.write(content);
        } 
        catch (IOException e) 
        {
        	e.printStackTrace();
        } 
        finally 
        {
        	IOUtils.closeQuietly(out);
        	IOUtils.closeQuietly(writer);
        }
	}
	
	/**
	 * ��ȡ�ļ�����.
	 * @param fileName
	 * @return
	 */
	public static String readToString(String fileName) 
	{
		FileInputStream fis = null;
        InputStreamReader isr = null;
		BufferedReader br=null;
		
		try 
		{
			fis = new FileInputStream(fileName);
			isr = new InputStreamReader(fis, getFileEncode(fileName));
			br=new BufferedReader(isr);
			
			// ���ļ���ѭ����ȡ������ʾ���ı�����
			String temp = "";
			StringBuffer buffer = new StringBuffer();
			while(null != (temp = br.readLine()))
			{
				// ��ʾ���ı�����.
				buffer.append(temp);
				buffer.append(SystemConstant.LINE_SEPARATOR_WINDOWS);
			}
			
			// ���õ��ı�����.
			if (StringUtils.isNotEmpty(buffer.toString())) 
			{
				return buffer.substring(0, buffer.lastIndexOf(SystemConstant.LINE_SEPARATOR_WINDOWS));
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				fis.close();
				isr.close();
				br.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return null;
    }
	
	/**
	 * ��ȡ�ļ�����.
	 * @param fileName
	 * @return
	 */
	public static String getFileEncode(String fileName) 
	{
		String code = SystemConstant.ENCODE_GB2312;
		
		InputStream is = null;
		try 
		{
			is = new FileInputStream(fileName);
			byte[] head = new byte[3];
			is.read(head);
			
			if (head[0] == -1 && head[1] == -2 ) 
			{
				code = SystemConstant.ENCODE_UTF16;
			} 
			else if (head[0] == -2 && head[1] == -1 ) 
			{
				code = SystemConstant.ENCODE_UNICODE;
			} 
			else if (head[0]==-17 && head[1]==-69 && head[2] ==-65) 
			{
				code = SystemConstant.ENCODE_UTF8;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				is.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return code;
	}
	
}
