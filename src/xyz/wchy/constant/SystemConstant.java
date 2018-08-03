/**
* @FileName: SystemConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SystemConstant.java: 记事本常量-不可配置.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.constant;

import java.io.File;

/**
* @ClassName: SystemConstant.java
* 
* @Description: 
* <p>
* 记事本常量-不可配置.
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
* @Date: 2018年1月19日 上午11:02:34.
* 
*/
public interface SystemConstant 
{
	
    /**
     * Linux路径分割字符.
     */
    char DIR_SEPARATOR_UNIX = '/';
    
    /**
     * Windows路径分割字符.
     */
    char DIR_SEPARATOR_WINDOWS = '\\';
    
    /**
     * 路径分隔字符.
     */
    char DIR_SEPARATOR = File.separatorChar;
    
    /**
     * Linux换行符.
     */
    String LINE_SEPARATOR_UNIX = "\n";
    
    /**
     * Windows换行符.
     */
    String LINE_SEPARATOR_WINDOWS = "\r\n";
    
    /**
     * 编码格式gb2312.
     */
    String ENCODE_GB2312 = "gb2312";
    
    /**
     * 编码格式UTF-8.
     */
    String ENCODE_UTF8 = "UTF-8";
    
    /**
     * 编码格式Unicode.
     */
    String ENCODE_UNICODE = "Unicode";
    
    /**
     * 编码格式UTF-16.
     */
    String ENCODE_UTF16 = "UTF-16";
    
}
