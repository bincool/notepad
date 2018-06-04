/**
* @FileName: TextAreaKeyAction.java
* @Package: xyz.wchy.action.textarea
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: TextAreaKeyAction.java: 文本域按键监听事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 文本域按键监听事件.
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
* @Date: 2018年1月23日 上午10:49:03.
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
		
		// 有键盘键入则需要把相关按钮设置成可见：撤销，查找，查找下一处.
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
