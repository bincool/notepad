/**
* @FileName: TextPane.java
* @Package: xyz.wchy.textarea
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: TextPane.java: 带滚动条的文本域.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.textarea;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import xyz.wchy.action.textarea.TextAreaKeyAction;
import xyz.wchy.action.textarea.TextAreaMouseAction;
import xyz.wchy.utils.Logger;

/**
* @ClassName: TextPane.java
* 
* @Description: 
* <p>
* 带滚动条的文本域.
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
* @Date: 2018年1月15日 下午11:32:38.
* 
*/
public class TextPane 
{
	
	/**
	 * 日志对象.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
	/**
	 * 文本域.
	 */
	private JTextArea textArea = null;
	
	/**
	 * 滚动条.
	 */
	private JScrollPane scrollPane = null;
	
	/**
	 * 构造函数.
	 */
	public TextPane() 
	{
		// 初始化文本域.
		initTextArea();
		
		// 给文本域绑定事件.
		bindEvent();
	}

	/**
	 * 获取textArea.
	 * @return
	 *     textArea.
	 */
	public JTextArea getTextArea() 
	{
		return textArea;
	}


	/**
	 * 获取scrollPane.
	 * @return
	 *     scrollPane.
	 */
	public JScrollPane getScrollPane() 
	{
		return scrollPane;
	}

	/**
	 * 初始化文本域.
	 */
	private void initTextArea() 
	{
		// 文本域.
		textArea = new JTextArea();
		
		// 带滚动条的文本域.
        scrollPane = new JScrollPane(textArea);  
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	/**
	 * 给文本域绑定事件.
	 */
	private void bindEvent() 
	{
        // 添加键盘监听事件.
        textArea.addKeyListener(new TextAreaKeyAction());
        
        // 添加鼠标监听事件.
        textArea.addMouseListener(new TextAreaMouseAction());
	}
	
}
