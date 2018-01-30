/**
* @FileName: StringBuilderWriter.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: StringBuilderWriter.java: StringBuilder处理类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.io.Serializable;
import java.io.Writer;

/**
* @ClassName: StringBuilderWriter.java
* 
* @Description: 
* <p>
* StringBuilder处理类.
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
* @Date: 2018年1月24日 下午2:59:43.
* 
*/
public class StringBuilderWriter extends Writer implements Serializable 
{
	
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 内存地址块.
	 */
	private final StringBuilder builder;
	
	/**
	 * 
	 */
    public StringBuilderWriter() 
    {
        this.builder = new StringBuilder();
    }
    
    /**
     * 
     * @param capacity
     */
    public StringBuilderWriter(int capacity) 
    {
        this.builder = new StringBuilder(capacity);
    }
    
    /**
     * 
     * @param builder
     */
    public StringBuilderWriter(StringBuilder builder) 
    {
        this.builder = builder != null ? builder : new StringBuilder();
    }

    /**
     * 
     */
    @Override
    public Writer append(char value) 
    {
        builder.append(value);
        return this;
    }
    
    /**
     * 
     */
    @Override
    public Writer append(CharSequence value) 
    {
        builder.append(value);
        return this;
    }
    
    /**
     * 
     */
    @Override
    public Writer append(CharSequence value, int start, int end) 
    {
        builder.append(value, start, end);
        return this;
    }
    
    /**
     * 
     */
    @Override
    public void close() 
    {
    }
    
    /**
     * 
     */
    @Override
    public void flush() 
    {
    }
    
    /**
     * 
     */
    @Override
    public void write(String value) 
    {
        if (value != null) 
        {
            builder.append(value);
        }
    }
    
    /**
     * 
     */
    @Override
    public void write(char[] value, int offset, int length) 
    {
        if (value != null) 
        {
            builder.append(value, offset, length);
        }
    }
    
    /**
     * 
     * @return
     */
    public StringBuilder getBuilder() 
    {
        return builder;
    }
    
    /**
     * 
     */
    @Override
    public String toString() 
    {
        return builder.toString();
    }
    
}

