/**
* @FileName: EditReplaceDialog.java
* @Package: xyz.wchy.dialog.edit
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EditReplaceDialog.java: �༭�滻�Ի���.
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
import java.awt.GridLayout;

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
import xyz.wchy.action.dialog.ReplaceAction;
import xyz.wchy.action.dialog.ReplaceAllAction;
import xyz.wchy.dialog.base.BaseDialog;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditReplaceDialog.java
* 
* @Description: 
* <p>
* �༭�滻�Ի���.
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
* @Date: 2018��1��25�� ����4:56:43.
* 
*/
public class EditReplaceDialog extends BaseDialog 
{
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ���ҶԻ�������.
	 */
	private static EditReplaceDialog instance = null;
	
	/**
	 * ��������(N).
	 */
	private static final JLabel searchContentLabel = new JLabel("��������(N) :");  
	
	/**
	 * �滻Ϊ(P).
	 */
	private static final JLabel replaceContentLabel = new JLabel("�滻Ϊ(P)�� :");  
	
	/**
	 * ������һ��(F).
	 */
	private static final JButton searchNext = new JButton("������һ��(F)");  
	
	/**
	 * �滻(R).
	 */
	private static final JButton replace = new JButton("�滻(R)");  
	
	/**
	 * ȫ���滻(A).
	 */
	private static final JButton replaceAll = new JButton("ȫ���滻(A)");
	
	/**
	 * ȡ��.
	 */
	private static final JButton cancel = new JButton("ȡ��"); 
    
	/**
	 * �ײ�panel.
	 */ 
	private static final JPanel bottomPanel = new JPanel();  
	
	/**
	 * �в�panel.
	 */
	private static final JPanel centerPanel = new JPanel();  
	
	/**
	 * ����panel.
	 */
	private static final JPanel topPanel = new JPanel();  

	/**
	 * ��ѡѡ����.
	 */
	private static final JPanel direction = new JPanel(); 
	
	/**
	 * �滻panel.
	 */
	private static final JPanel replacePanel = new JPanel();
	
	/**
	 * ��ѡ��ť��.
	 */
	private static final ButtonGroup bGroup = new ButtonGroup();
	
	/**
	 * �������.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * ���ҶԻ���.
	 */
	private static final JDialog findDialog = new JDialog(domain.getFrame(), "�������滻", true);
	
	/**
	 * �Ի�������.
	 */
	private static final Container container = findDialog.getContentPane();
	
	/**
	 * ���ұ༭��.
	 */
	private static final JTextField findText = domain.getFindText();
	
	/**
	 * �滻�༭��.
	 */
	private static final JTextField replaceText = domain.getReplaceText();
	
	/**
	 * ��Сдѡ���.
	 */
	private static final JCheckBox matchCase = domain.getMatchCase(); 
	
	/**
	 * ���ϲ���.
	 */
	private static final JRadioButton up = domain.getUp();
	
	/**
	 * ���²���.
	 */
	private static final JRadioButton down = domain.getDown();
	
	/**
	 * �вι��캯��.
	 * @param owner
	 */
	private EditReplaceDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * ��ȡ���ڼ��±��Ի���������.
	 * @param owner
	 * @return
	 */
	public static EditReplaceDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new EditReplaceDialog(owner);
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
         
        down.setSelected(true);  
        bGroup.add(up);  
        bGroup.add(down);  
        
        searchNext.setPreferredSize(new Dimension(110, 22));  
        replace.setPreferredSize(new Dimension(110, 22));  
        replaceAll.setPreferredSize(new Dimension(110, 22));  
        // "�滻"��ť���¼�����  
        replace.addActionListener(new ReplaceAction());  
  
        // "�滻ȫ��"��ť���¼�����  
        replaceAll.addActionListener(new ReplaceAllAction());
  
        // "������һ��"��ť�¼�����  
        searchNext.addActionListener(FindAction.getInstance());
        // "ȡ��"��ť���¼�����  
         
        cancel.setPreferredSize(new Dimension(110, 22));  
        cancel.addActionListener(new CancelAction(findDialog));  
  
         
        direction.setBorder(BorderFactory.createTitledBorder("���� "));  
        direction.add(up);  
        direction.add(down);  
        direction.setPreferredSize(new Dimension(170, 60));  
        
        replacePanel.setLayout(new GridLayout(2, 1));  
        replacePanel.add(replace);  
        replacePanel.add(replaceAll);  
  
        topPanel.add(searchContentLabel);  
        topPanel.add(findText);  
        topPanel.add(searchNext);  
        centerPanel.add(replaceContentLabel);  
        centerPanel.add(replaceText);  
        centerPanel.add(replacePanel);  
        bottomPanel.add(matchCase);  
        bottomPanel.add(direction);  
        bottomPanel.add(cancel);  
  
        container.add(topPanel);  
        container.add(centerPanel);  
        container.add(bottomPanel);  
  
        // ����"�������滻"�Ի���Ĵ�С���ɸ��Ĵ�С(��)��λ�úͿɼ���  
        findDialog.setSize(410, 210);  
        findDialog.setResizable(false);  
        findDialog.setLocation(230, 280);  
        findDialog.setVisible(true);
    }
}
