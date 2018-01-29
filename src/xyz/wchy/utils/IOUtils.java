/**
* @FileName: IOUtils.java
* @Package: xyz.wchy.utils
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: IOUtils.java: IO������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Selector;

/**
* @ClassName: IOUtils.java
* 
* @Description: 
* <p>
* IO������.
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
* @Date: 2018��1��21�� ����4:38:22.
* 
*/
public class IOUtils 
{
    /**
     * The Unix directory separator character.
     */
    public static final char DIR_SEPARATOR_UNIX = '/';
    /**
     * The Windows directory separator character.
     */
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    /**
     * The system directory separator character.
     */
    public static final char DIR_SEPARATOR = File.separatorChar;
    /**
     * The Unix line separator string.
     */
    public static final String LINE_SEPARATOR_UNIX = "\n";
    /**
     * The Windows line separator string.
     */
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    /**
     * The system line separator string.
     */
    public static final String LINE_SEPARATOR;
    
    static 
    {
        StringBuilderWriter buf = new StringBuilderWriter(4);
        PrintWriter out = new PrintWriter(buf);
        out.println();
        LINE_SEPARATOR = buf.toString();
        out.close();
    }
    
    public IOUtils() 
    {
        super();
    }
    
    public static void closeQuietly(Reader input) 
    {
        closeQuietly((Closeable)input);
    }
    
    public static void closeQuietly(Writer output) 
    {
        closeQuietly((Closeable)output);
    }

    public static void closeQuietly(InputStream input) 
    {
        closeQuietly((Closeable)input);
    }
    
    public static void closeQuietly(OutputStream output) 
    {
        closeQuietly((Closeable)output);
    }
    
    public static void closeQuietly(Closeable closeable) 
    {
        try 
        {
            if (closeable != null) 
            {
                closeable.close();
            }
        } 
        catch (IOException ioe) 
        {
        }
    }
    
    public static void closeQuietly(Socket sock) 
    {
        if (sock != null) 
        {
            try 
            {
                sock.close();
            } 
            catch (IOException ioe) 
            {
            }
        }
    }
    
    public static void closeQuietly(Selector selector) 
    {
        if (selector != null) 
        {
            try 
            {
              selector.close();
            } 
            catch (IOException ioe) 
            {
                // ignored
            }
        }
    }
    
    public static void closeQuietly(ServerSocket sock) 
    {
        if (sock != null) 
        {
            try 
            {
                sock.close();
            } 
            catch (IOException ioe) 
            {
            }
        }
    }
    
}
