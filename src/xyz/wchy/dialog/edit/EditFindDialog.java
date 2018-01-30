/**
* @FileName: EditFindDialog.java
* @Package: xyz.wchy.dialog.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditFindDialog.java: �༭���ҶԻ���.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.dialog.edit;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import xyz.wchy.action.dialog.CancelAction;
import xyz.wchy.action.dialog.FindAction;
import xyz.wchy.dialog.base.BaseDialog;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditFindDialog.java
* 
* @Description: 
* <p>
* �༭���ҶԻ���.
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
* @Date: 2018��1��25�� ����4:39:07.
* 
*/
public class EditFindDialog extends BaseDialog 
{
	
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �������.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * ���ҶԻ�������.
	 */
	private static EditFindDialog instance = null;
    
	/**
	 * 
	 */
	private static final JLabel searchLabel = new JLabel("��������(N) :");
    
	/**
	 * 
	 */
	private static final JButton searchNext = new JButton("������һ��(F)");
    
	/**
	 * 
	 */
	private static final JButton cancel = new JButton("ȡ��");
	
	/**
	 * 
	 */
	private static final ButtonGroup bGroup = new ButtonGroup();
	
	/**
	 * 
	 */
	private static final JDialog findDialog = new JDialog(domain.getFrame(), "�������滻", true);
	
	/**
	 * 
	 */
	private static final Container container = findDialog.getContentPane();
	
	/**
	 * 
	 */
	private static final JTextField findText = domain.getFindText();
    
	/**
	 * 
	 */
	private static final JCheckBox matchCase = domain.getMatchCase();
    
	/**
	 * 
	 */
	private static final JRadioButton up = domain.getUp();
    
	/**
	 * 
	 */
	private static final JRadioButton down = domain.getDown();
    
	/**
	 * 
	 */ 
	private static final JPanel bottomPanel = new JPanel();
	
	/**
	 * 
	 */
	private static final JPanel topPanel = new JPanel();
	
	/**
	 * 
	 */
	private static final JPanel direction = new JPanel();
	
	/**
	 * �вι��캯��.
	 * @param owner
	 */
	private EditFindDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * ��ȡ���ڼ��±��Ի���������.
	 * @param owner
	 * @return
	 */
	public static EditFindDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new EditFindDialog(owner);
			instance.setVisible(false);
			instance.setModal(true);
		}
		return instance;
	}
	
	/**
     * ��ʼ���Ի���ҳ��.
     */
	@Override
	public void initDialog() 
	{
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        searchNext.setPreferredSize(new Dimension(110, 22));
        cancel.setPreferredSize(new Dimension(110, 22));
        direction.setPreferredSize(new Dimension(170, 61));
        
        topPanel.add(searchLabel);
        topPanel.add(findText);
        topPanel.add(searchNext);
        
        direction.setBorder(BorderFactory.createTitledBorder("���� "));
        down.setSelected(true);
        bGroup.add(up);
        bGroup.add(down);
        direction.add(up);
        direction.add(down);
        
        bottomPanel.add(matchCase);
        bottomPanel.add(direction);
        bottomPanel.add(cancel);
        
        container.add(topPanel);
        container.add(bottomPanel);
        
        // "������һ��"��ť�¼�����.
        searchNext.addActionListener(new FindAction());
        
        cancel.addActionListener(new CancelAction(findDialog));
        
        // ����"�������滻"�Ի���Ĵ�С���ɸ��Ĵ�С(��)��λ�úͿɼ���.
        findDialog.setSize(410, 160);
        findDialog.setResizable(false);
        findDialog.setLocation(230, 280);
        findDialog.setVisible(true);
    }

}
