/**
* @FileName: TextAreaKeyAction.java
* @Package: xyz.wchy.action.textarea
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: TextAreaKeyAction.java: �ı��򰴼������¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.textarea;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;

import xyz.wchy.bean.BaseData;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: TextAreaKeyAction.java
* 
* @Description: 
* <p>
* �ı��򰴼������¼�.
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
* @Date: 2018��1��23�� ����10:49:03.
* 
*/
public class TextAreaKeyAction extends BaseData implements KeyListener 
{

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) 
	{
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) 
	{
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) 
	{
		JTextArea jTextArea = domain.getTextPane().getTextArea();
		
		// �м��̼�������Ҫ����ذ�ť���óɿɼ������������ң�������һ��.
		if(StringUtils.isNotEmpty(jTextArea.getText())) 
		{
			domain.getMenuEditFind().setEnabled(true);
			domain.getMenuEditFindNext().setEnabled(true);
        } 
		else 
		{
			domain.getMenuEditFind().setEnabled(false);
			domain.getMenuEditFindNext().setEnabled(false);
        }
		
	}

}
