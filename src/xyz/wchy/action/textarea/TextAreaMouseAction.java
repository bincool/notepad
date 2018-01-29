/**
* @FileName: TextAreaMouseAction.java
* @Package: xyz.wchy.action.textarea
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: TextAreaMouseAction.java: �ı������������¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.action.textarea;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import xyz.wchy.bean.BaseData;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: TextAreaMouseAction.java
* 
* @Description: 
* <p>
* �ı������������¼�.
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
* @Date: 2018��1��25�� ����3:59:55.
* 
*/
public class TextAreaMouseAction extends BaseData implements MouseListener 
{

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e) 
	{
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent e) 
	{
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// ��ѡ���ı�.
		if (StringUtils.isNotEmpty(domain.getTextPane().getTextArea().getSelectedText())) 
		{
			domain.getMenuEditTrim().setEnabled(true);
			domain.getMenuEditCopy().setEnabled(true);
			domain.getMenuEditDelete().setEnabled(true);
		} 
		else 
		{
			domain.getMenuEditTrim().setEnabled(false);
			domain.getMenuEditCopy().setEnabled(false);
			domain.getMenuEditDelete().setEnabled(false);
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) 
	{
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) 
	{
	}

}
