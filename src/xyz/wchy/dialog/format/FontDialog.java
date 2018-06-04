/**
* @FileName: FontDialog.java
* @Package: xyz.wchy.dialog.format
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FontDialog.java: ����ѡ��Ի���.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����1:07:03.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.dialog.format;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import xyz.wchy.action.dialog.CancelAction;
import xyz.wchy.dialog.base.BaseDialog;

/**
* @ClassName: FontDialog.java
* 
* @Description: 
* <p>
* ����ѡ��Ի���.
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
* @Date: 2018��1��31�� ����1:07:03.
* 
*/
public class FontDialog extends BaseDialog 
{

	/**
	 * ���а汾ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ����Ի�������.
	 */
	private static FontDialog instance = null;

	/**
	 * ѡ��ȡ����ť�ķ���ֵ.
	 */
	public static final int CANCEL_OPTION = 0;

	/**
	 * ѡ��ȷ����ť�ķ���ֵ.
	 */
	public static final int APPROVE_OPTION = 1;

	/**
	 * ����Ԥ�����ַ���.
	 */
	private static final String CHINA_STRING = "���±�";

	/**
	 * Ӣ��Ԥ�����ַ���.
	 */
	private static final String ENGLISH_STRING = "NotePad";

	/**
	 * ����Ԥ�����ַ���.
	 */
	private static final String NUMBER_STRING = "891946049";
	
	/**
	 * �����ı���.
	 */
	private static final JTextField fontText = new JTextField();

	/**
	 * ��ʽ�ı���.
	 */
	private static final JTextField styleText = new JTextField();

	/**
	 * ���ִ�С�ı���.
	 */
	private static final JTextField sizeText = new JTextField();

	/**
	 * Ԥ���ı���.
	 */
	private static final JTextField previewText = new JTextField(20);
	
	/**
	 * Ԥ����ť��.
	 */
	private static final ButtonGroup bGroup = new ButtonGroup();

	/**
	 * ����Ԥ����ť.
	 */
	private static final JRadioButton chinaButton = new JRadioButton("����Ԥ��", true);

	/**
	 * Ӣ��Ԥ����ť.
	 */
	private static final JRadioButton englishButton = new JRadioButton("Ӣ��Ԥ��", true);

	/**
	 * ����Ԥ����ť.
	 */
	private static final JRadioButton numberButton = new JRadioButton("����Ԥ��", true);

	/**
	 * ϵͳ����.
	 */
	private static final String[] fontArray = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

	/**
	 * ������ʽ.
	 */
	private static final String[] styleArray = { "����", "����", "б��", "��б��" };

	/**
	 * ����Ԥ�������С.
	 */
	private static final String[] sizeArray = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36",
			"48", "72", "����", "С��", "һ��", "Сһ", "����", "С��", "����", "С��", "�ĺ�", "С��", "���", "С��", "����", "С��", "�ߺ�",
			"�˺�" };
	
	/**
	 * ����ѡ����.
	 */
	private static final JList<String> fontList = new JList<String>(fontArray);

	/**
	 * ��ʽѡ����.
	 */
	private static final JList<String> styleList = new JList<String>(styleArray);

	/**
	 * ���ִ�Сѡ����.
	 */
	private static final JList<String> sizeList = new JList<String>(sizeArray);
	
	/**
	 * ���������ж�Ӧ�������С.
	 */
	private static final Map<String, Integer> sizeMap = new HashMap<String, Integer>();
	
	/**
	 * ����.
	 */
	private static Font font = new Font("����", Font.PLAIN, 16);

	/**
	 * ����ѡ����������.
	 */
	private static final Box box = Box.createVerticalBox();

	/**
	 * ȷ����ť.
	 */
	private static final JButton approveButton = new JButton("ȷ��");
	
	/**
	 * ȡ����ť.
	 */
	private static final JButton cancelButton = new JButton("ȡ��");

	static 
	{
		sizeMap.put("8", 8);
		sizeMap.put("9", 9);
		sizeMap.put("10", 10);
		sizeMap.put("11", 11);
		sizeMap.put("12", 12);
		sizeMap.put("14", 14);
		sizeMap.put("16", 16);
		sizeMap.put("18", 18);
		sizeMap.put("20", 20);
		sizeMap.put("22", 22);
		sizeMap.put("24", 24);
		sizeMap.put("26", 26);
		sizeMap.put("28", 28);
		sizeMap.put("36", 36);
		sizeMap.put("48", 48);
		sizeMap.put("72", 72);
		sizeMap.put("����", 42);
		sizeMap.put("С��", 36);
		sizeMap.put("һ��", 26);
		sizeMap.put("Сһ", 24);
		sizeMap.put("����", 22);
		sizeMap.put("С��", 18);
		sizeMap.put("����", 16);
		sizeMap.put("С��", 15);
		sizeMap.put("�ĺ�", 14);
		sizeMap.put("С��", 12);
		sizeMap.put("���", 10);
		sizeMap.put("С��", 9);
		sizeMap.put("����", 8);
		sizeMap.put("С��", 7);
		sizeMap.put("�ߺ�", 6);
		sizeMap.put("�˺�", 5);
	}

	/**
	 * @param owner
	 */
	private FontDialog(Frame owner) 
	{
		super(owner);
		initDialog();
	}
	
	/**
	 * ��ȡ���ڼ��±��Ի���������.
	 * @param owner
	 * @return
	 */
	public static FontDialog getInstance(Frame owner) 
	{
		if (null == instance) 
		{
			instance = new FontDialog(owner);
			instance.setVisible(false);
			instance.setModal(true);
		}
		
		instance.setLocationRelativeTo(owner);
		instance.setVisible(true);
		
		return instance;
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see xyz.wchy.dialog.base.BaseDialog#initDialog()
	 */
	@Override
	protected void initDialog() 
	{
		setTitle("����ѡ����");
		
		box.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		
		fontText.setEditable(false);
		fontText.setBackground(Color.WHITE);
		
		styleText.setEditable(false);
		styleText.setBackground(Color.WHITE);
		
		sizeText.setEditable(false);
		sizeText.setBackground(Color.WHITE);

		previewText.setHorizontalAlignment(JTextField.CENTER);
		previewText.setEditable(false);
		previewText.setBackground(Color.WHITE);
		
		bGroup.add(chinaButton);
		bGroup.add(englishButton);
		bGroup.add(numberButton);
		
		
		Box box1 = Box.createHorizontalBox();
		JLabel l1 = new JLabel("����:");
		JLabel l2 = new JLabel("����:");
		JLabel l3 = new JLabel("��С:");
		l1.setPreferredSize(new Dimension(165, 14));
		l1.setMaximumSize(new Dimension(165, 14));
		l1.setMinimumSize(new Dimension(165, 14));
		l2.setPreferredSize(new Dimension(95, 14));
		l2.setMaximumSize(new Dimension(95, 14));
		l2.setMinimumSize(new Dimension(95, 14));
		l3.setPreferredSize(new Dimension(80, 14));
		l3.setMaximumSize(new Dimension(80, 14));
		l3.setMinimumSize(new Dimension(80, 14));
		box1.add(l1);
		box1.add(l2);
		box1.add(l3);
		Box box2 = Box.createHorizontalBox();
		fontText.setPreferredSize(new Dimension(160, 20));
		fontText.setMaximumSize(new Dimension(160, 20));
		fontText.setMinimumSize(new Dimension(160, 20));
		box2.add(fontText);
		box2.add(Box.createHorizontalStrut(5));
		styleText.setPreferredSize(new Dimension(90, 20));
		styleText.setMaximumSize(new Dimension(90, 20));
		styleText.setMinimumSize(new Dimension(90, 20));
		box2.add(styleText);
		box2.add(Box.createHorizontalStrut(5));
		sizeText.setPreferredSize(new Dimension(80, 20));
		sizeText.setMaximumSize(new Dimension(80, 20));
		sizeText.setMinimumSize(new Dimension(80, 20));
		box2.add(sizeText);
		Box box3 = Box.createHorizontalBox();
		JScrollPane sp1 = new JScrollPane(fontList);
		sp1.setPreferredSize(new Dimension(160, 100));
		sp1.setMaximumSize(new Dimension(160, 100));
		sp1.setMaximumSize(new Dimension(160, 100));
		box3.add(sp1);
		box3.add(Box.createHorizontalStrut(5));
		JScrollPane sp2 = new JScrollPane(styleList);
		sp2.setPreferredSize(new Dimension(90, 100));
		sp2.setMaximumSize(new Dimension(90, 100));
		sp2.setMinimumSize(new Dimension(90, 100));
		box3.add(sp2);
		box3.add(Box.createHorizontalStrut(5));
		JScrollPane sp3 = new JScrollPane(sizeList);
		sp3.setPreferredSize(new Dimension(80, 100));
		sp3.setMaximumSize(new Dimension(80, 100));
		sp3.setMinimumSize(new Dimension(80, 100));
		box3.add(sp3);
		Box box4 = Box.createHorizontalBox();
		Box box5 = Box.createVerticalBox();
		JPanel box6 = new JPanel(new BorderLayout());
		box5.setBorder(BorderFactory.createTitledBorder("�ַ���"));
		box6.setBorder(BorderFactory.createTitledBorder("ʾ��"));
		box5.add(chinaButton);
		box5.add(englishButton);
		box5.add(numberButton);
		box5.setPreferredSize(new Dimension(90, 95));
		box5.setMaximumSize(new Dimension(90, 95));
		box5.setMinimumSize(new Dimension(90, 95));
		box6.add(previewText);
		box6.setPreferredSize(new Dimension(250, 95));
		box6.setMaximumSize(new Dimension(250, 95));
		box6.setMinimumSize(new Dimension(250, 95));
		box4.add(box5);
		box4.add(Box.createHorizontalStrut(4));
		box4.add(box6);
		Box box7 = Box.createHorizontalBox();
		box7.add(Box.createHorizontalGlue());
		box7.add(approveButton);
		box7.add(Box.createHorizontalStrut(5));
		box7.add(cancelButton);
		box.add(box1);
		box.add(box2);
		box.add(box3);
		box.add(Box.createVerticalStrut(5));
		box.add(box4);
		box.add(Box.createVerticalStrut(5));
		box.add(box7);
		getContentPane().add(box);
		
		// ��Ӽ�����.
		addListener();
		
		// ����Ԥ��������ʾ.
		setUp();
		
		// ��������.
		setModal(true);
		
		setResizable(false);
		
		// ����Ӧ��С.
		pack();
	}

	/**
	 * ����Ԥ��������ʾ
	 */
	private void setUp() 
	{
		String fontName = font.getFamily();
		int fontStyle = font.getStyle();
		int fontSize = font.getSize();
		
		sizeList.setSelectedValue(String.valueOf(fontSize), true);
		sizeText.setText(String.valueOf(fontSize));
		
		// ѡ�������б��е�ĳ��
		fontList.setSelectedValue(fontName, true);
		
		// ѡ����ʽ�б��е�ĳ��
		styleList.setSelectedIndex(fontStyle);
		
		// Ԥ��Ĭ����ʾ�����ַ�
		chinaButton.doClick();
		
		// ��ʾԤ��
		previewText.setFont(groupFont());
	}

	/**
	 * ���������¼�������
	 */
	private void addListener() 
	{

		sizeText.addFocusListener(new FocusListener() 
		{
			public void focusLost(FocusEvent e) 
			{
				previewText.setFont(groupFont());
			}

			public void focusGained(FocusEvent e) 
			{
				sizeText.selectAll();
			}
		});

		// �����б���ѡ���¼��ļ�����
		fontList.addListSelectionListener(new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent e) 
			{
				if (!e.getValueIsAdjusting()) 
				{
					fontText.setText(String.valueOf(fontList.getSelectedValue()));
					// ����Ԥ��
					previewText.setFont(groupFont());
				}
			}
		});

		styleList.addListSelectionListener(new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent e) 
			{
				if (!e.getValueIsAdjusting()) 
				{
					styleText.setText(String.valueOf(styleList.getSelectedValue()));
					// ����Ԥ��.
					previewText.setFont(groupFont());
				}
			}
		});

		sizeList.addListSelectionListener(new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent e) 
			{
				if (!e.getValueIsAdjusting()) 
				{
					if (!sizeText.isFocusOwner()) 
					{
						sizeText.setText(String.valueOf(sizeList.getSelectedValue()));
					}
					// ����Ԥ��.
					previewText.setFont(groupFont());
				}
			}
		});

		// ���������.
		EncodeAction ea = new EncodeAction();
		chinaButton.addActionListener(ea);
		englishButton.addActionListener(ea);
		numberButton.addActionListener(ea);

		// ȷ����ť���¼�����
		approveButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// �رմ���.
				dispose();

				domain.getTextPane().getTextArea().setFont(groupFont());
			}
		});
		
		// ȡ����ť�¼�����.
		cancelButton.addActionListener(new CancelAction(this));
	}

	/**
	 * ����ѡ���������
	 * 
	 * @return ����
	 */
	private Font groupFont() 
	{
		String fontName = fontText.getText();
		int fontStyle = styleList.getSelectedIndex();
		String sizeStr = sizeText.getText();
		int fontSize = sizeMap.get(sizeStr);
		return new Font(fontName, fontStyle, fontSize);
	}

	/**
	 * ����ѡ���¼��ļ�������
	 * 
	 * @author ��ǿ
	 *
	 */
	class EncodeAction implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource().equals(chinaButton)) 
			{
				previewText.setText(CHINA_STRING);
			} else if (e.getSource().equals(englishButton)) 
			{
				previewText.setText(ENGLISH_STRING);
			} 
			else 
			{
				previewText.setText(NUMBER_STRING);
			}
		}
	}

}
