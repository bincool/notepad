/**
* @FileName: TextPane.java
* @Package: xyz.wchy.textarea
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: TextPane.java: �����������ı���.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �����������ı���.
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
* @Date: 2018��1��15�� ����11:32:38.
* 
*/
public class TextPane 
{
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
	/**
	 * �ı���.
	 */
	private JTextArea textArea = null;
	
	/**
	 * ������.
	 */
	private JScrollPane scrollPane = null;
	
	/**
	 * ���캯��.
	 */
	public TextPane() 
	{
		// ��ʼ���ı���.
		initTextArea();
		
		// ���ı�����¼�.
		bindEvent();
	}

	/**
	 * ��ȡtextArea.
	 * @return
	 *     textArea.
	 */
	public JTextArea getTextArea() 
	{
		return textArea;
	}


	/**
	 * ��ȡscrollPane.
	 * @return
	 *     scrollPane.
	 */
	public JScrollPane getScrollPane() 
	{
		return scrollPane;
	}

	/**
	 * ��ʼ���ı���.
	 */
	private void initTextArea() 
	{
		// �ı���.
		textArea = new JTextArea();
		
		// �����������ı���.
        scrollPane = new JScrollPane(textArea);  
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	/**
	 * ���ı�����¼�.
	 */
	private void bindEvent() 
	{
        // ��Ӽ��̼����¼�.
        textArea.addKeyListener(new TextAreaKeyAction());
        
        // ����������¼�.
        textArea.addMouseListener(new TextAreaMouseAction());
	}
	
}
