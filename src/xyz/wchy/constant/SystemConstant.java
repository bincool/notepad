/**
* @FileName: SystemConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: SystemConstant.java: ���±�����-��������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.constant;

import java.io.File;

/**
* @ClassName: SystemConstant.java
* 
* @Description: 
* <p>
* ���±�����-��������.
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
* @Date: 2018��1��19�� ����11:02:34.
* 
*/
public interface SystemConstant 
{
	
    /**
     * Linux·���ָ��ַ�.
     */
    char DIR_SEPARATOR_UNIX = '/';
    
    /**
     * Windows·���ָ��ַ�.
     */
    char DIR_SEPARATOR_WINDOWS = '\\';
    
    /**
     * ·���ָ��ַ�.
     */
    char DIR_SEPARATOR = File.separatorChar;
    
    /**
     * Linux���з�.
     */
    String LINE_SEPARATOR_UNIX = "\n";
    
    /**
     * Windows���з�.
     */
    String LINE_SEPARATOR_WINDOWS = "\r\n";
    
    /**
     * �����ʽgb2312.
     */
    String ENCODE_GB2312 = "gb2312";
    
    /**
     * �����ʽUTF-8.
     */
    String ENCODE_UTF8 = "UTF-8";
    
    /**
     * �����ʽUnicode.
     */
    String ENCODE_UNICODE = "Unicode";
    
    /**
     * �����ʽUTF-16.
     */
    String ENCODE_UTF16 = "UTF-16";
    
}
