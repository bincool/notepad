/**
* @FileName: HelpAboutDialog.java
* @Package: xyz.wchy.dialog.help
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: HelpAboutDialog.java: ���������˵�-���ڼ��±��Ի���.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.dialog.help;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import xyz.wchy.action.dialog.CancelAction;
import xyz.wchy.dialog.base.BaseDialog;

/**
* @ClassName: HelpAboutDialog.java
* 
* @Description: 
* <p>
* ���������˵�-���ڼ��±��Ի���.
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
* @Date: 2018��1��24�� ����5:02:51.
* 
*/
public class HelpAboutDialog extends BaseDialog
{
	
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ���ڼ��±��Ի�������.
	 */
	private static HelpAboutDialog instance = null;
	
	/**
	 * ����panel.
	 */
	private static final JPanel panel = new JPanel();
	
	/**
	 * �����ı�����.
	 */
	private static final String about = "<html><body>NotePad<br>Version��1.0<br>QQ��891946049<br><body></html>";
	
	/**
	 * ����label.
	 */
	private static final JLabel label = new JLabel(about, JLabel.CENTER);
	
	/**
	 * ����.
	 */
	private static final Font font = new Font(Font.DIALOG, Font.PLAIN, 16);
	
	/**
	 * ȷ����ť.
	 */
	private static final JButton button = new JButton("ȷ��");
	
	/**
	 * ��Ļ��С.
	 */
	private static final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 * �Ի����.
	 */
	private static final int width = (int) dimension.getWidth();
	
	/**
	 * �Ի����.
	 */
	private static final int hight = (int) dimension.getHeight();
	
	/**
	 * �вι��캯��.
	 * @param owner
	 */
	private HelpAboutDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * ��ȡ���ڼ��±��Ի���������.
	 * @param owner
	 * @return
	 */
	public static HelpAboutDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new HelpAboutDialog(owner);
			
			instance.setVisible(false);
			instance.setModal(true);
			
			button.addActionListener(new CancelAction(instance));
		}
		return instance;
	}
	
	/**
     * ��ʼ���Ի���ҳ��.
     */
	@Override
	public void initDialog() 
    {
		panel.add(button);
        label.setFont(font);
        this.add(label, BorderLayout.CENTER);
        this.add(panel, BorderLayout.SOUTH);
        
        this.setLocation(width / 4, hight / 4);
        this.setTitle("Help And Support");
        this.setSize(290,170);
        this.setVisible(true);
	}

}
