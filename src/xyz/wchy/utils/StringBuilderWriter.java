/**
* @FileName: StringBuilderWriter.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: StringBuilderWriter.java: StringBuilder������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* StringBuilder������.
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
* @Date: 2018��1��24�� ����2:59:43.
* 
*/
public class StringBuilderWriter extends Writer implements Serializable 
{
	
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �ڴ��ַ��.
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

