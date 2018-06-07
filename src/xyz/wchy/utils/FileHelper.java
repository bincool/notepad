/**
* @FileName: FileHelper.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: FileHelper.java: 文件操作工具类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 文件操作工具类.
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
* @Date: 2018年1月21日 上午1:18:19.
* 
*/
public class FileHelper 
{
	
	/**
	 * 文件对象.
	 */
	private static File file = null;
	
	/**
	 * 创建文件路径.
	 * @param filePath
	 */
	public static void createFilePath(String filePath) 
	{
		file = new File(filePath);
		
		// 如果文件夹不存在则创建.
		if  (!file.exists()  && !file.isDirectory())
		{
		    file.mkdir();
		} 
	}
	
	/**
	 * 创建文件.
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
	 * 创建文件.
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
	 * 向文件中写内容.
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
	 * 读取文件内容.
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
			
			// 从文件中循环读取，并显示到文本域中
			String temp = "";
			StringBuffer buffer = new StringBuffer();
			while(null != (temp = br.readLine()))
			{
				// 显示到文本域中.
				buffer.append(temp);
				buffer.append(SystemConstant.LINE_SEPARATOR_WINDOWS);
			}
			
			// 放置到文本域中.
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
	 * 获取文件编码.
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
