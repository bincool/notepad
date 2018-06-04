/**
* @FileName: FontDialog.java
* @Package: xyz.wchy.dialog.format
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FontDialog.java: 字体选择对话框.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 下午1:07:03.
* @Content: 新增.
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
* 字体选择对话框.
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
* @Date: 2018年1月31日 下午1:07:03.
* 
*/
public class FontDialog extends BaseDialog 
{

	/**
	 * 序列版本ID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 字体对话框单例类.
	 */
	private static FontDialog instance = null;

	/**
	 * 选择取消按钮的返回值.
	 */
	public static final int CANCEL_OPTION = 0;

	/**
	 * 选择确定按钮的返回值.
	 */
	public static final int APPROVE_OPTION = 1;

	/**
	 * 中文预览的字符串.
	 */
	private static final String CHINA_STRING = "记事本";

	/**
	 * 英文预览的字符串.
	 */
	private static final String ENGLISH_STRING = "NotePad";

	/**
	 * 数字预览的字符串.
	 */
	private static final String NUMBER_STRING = "891946049";
	
	/**
	 * 字体文本框.
	 */
	private static final JTextField fontText = new JTextField();

	/**
	 * 样式文本框.
	 */
	private static final JTextField styleText = new JTextField();

	/**
	 * 文字大小文本框.
	 */
	private static final JTextField sizeText = new JTextField();

	/**
	 * 预览文本框.
	 */
	private static final JTextField previewText = new JTextField(20);
	
	/**
	 * 预览按钮组.
	 */
	private static final ButtonGroup bGroup = new ButtonGroup();

	/**
	 * 中文预览按钮.
	 */
	private static final JRadioButton chinaButton = new JRadioButton("中文预览", true);

	/**
	 * 英文预览按钮.
	 */
	private static final JRadioButton englishButton = new JRadioButton("英文预览", true);

	/**
	 * 数字预览按钮.
	 */
	private static final JRadioButton numberButton = new JRadioButton("数字预览", true);

	/**
	 * 系统字体.
	 */
	private static final String[] fontArray = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

	/**
	 * 所有样式.
	 */
	private static final String[] styleArray = { "常规", "粗体", "斜体", "粗斜体" };

	/**
	 * 所有预设字体大小.
	 */
	private static final String[] sizeArray = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36",
			"48", "72", "初号", "小初", "一号", "小一", "二号", "小二", "三号", "小三", "四号", "小四", "五号", "小五", "六号", "小六", "七号",
			"八号" };
	
	/**
	 * 字体选择器.
	 */
	private static final JList<String> fontList = new JList<String>(fontArray);

	/**
	 * 样式选择器.
	 */
	private static final JList<String> styleList = new JList<String>(styleArray);

	/**
	 * 文字大小选择器.
	 */
	private static final JList<String> sizeList = new JList<String>(sizeArray);
	
	/**
	 * 上面数组中对应的字体大小.
	 */
	private static final Map<String, Integer> sizeMap = new HashMap<String, Integer>();
	
	/**
	 * 字体.
	 */
	private static Font font = new Font("宋体", Font.PLAIN, 16);

	/**
	 * 字体选择器主容器.
	 */
	private static final Box box = Box.createVerticalBox();

	/**
	 * 确定按钮.
	 */
	private static final JButton approveButton = new JButton("确定");
	
	/**
	 * 取消按钮.
	 */
	private static final JButton cancelButton = new JButton("取消");

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
		sizeMap.put("初号", 42);
		sizeMap.put("小初", 36);
		sizeMap.put("一号", 26);
		sizeMap.put("小一", 24);
		sizeMap.put("二号", 22);
		sizeMap.put("小二", 18);
		sizeMap.put("三号", 16);
		sizeMap.put("小三", 15);
		sizeMap.put("四号", 14);
		sizeMap.put("小四", 12);
		sizeMap.put("五号", 10);
		sizeMap.put("小五", 9);
		sizeMap.put("六号", 8);
		sizeMap.put("小六", 7);
		sizeMap.put("七号", 6);
		sizeMap.put("八号", 5);
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
	 * 获取关于记事本对话框单例对象.
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
		setTitle("字体选择器");
		
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
		JLabel l1 = new JLabel("字体:");
		JLabel l2 = new JLabel("字形:");
		JLabel l3 = new JLabel("大小:");
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
		box5.setBorder(BorderFactory.createTitledBorder("字符集"));
		box6.setBorder(BorderFactory.createTitledBorder("示例"));
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
		
		// 添加监听器.
		addListener();
		
		// 按照预设字体显示.
		setUp();
		
		// 基本设置.
		setModal(true);
		
		setResizable(false);
		
		// 自适应大小.
		pack();
	}

	/**
	 * 按照预设字体显示
	 */
	private void setUp() 
	{
		String fontName = font.getFamily();
		int fontStyle = font.getStyle();
		int fontSize = font.getSize();
		
		sizeList.setSelectedValue(String.valueOf(fontSize), true);
		sizeText.setText(String.valueOf(fontSize));
		
		// 选择字体列表中的某项
		fontList.setSelectedValue(fontName, true);
		
		// 选择样式列表中的某项
		styleList.setSelectedIndex(fontStyle);
		
		// 预览默认显示中文字符
		chinaButton.doClick();
		
		// 显示预览
		previewText.setFont(groupFont());
	}

	/**
	 * 添加所需的事件监听器
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

		// 字体列表发生选择事件的监听器
		fontList.addListSelectionListener(new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent e) 
			{
				if (!e.getValueIsAdjusting()) 
				{
					fontText.setText(String.valueOf(fontList.getSelectedValue()));
					// 设置预览
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
					// 设置预览.
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
					// 设置预览.
					previewText.setFont(groupFont());
				}
			}
		});

		// 编码监听器.
		EncodeAction ea = new EncodeAction();
		chinaButton.addActionListener(ea);
		englishButton.addActionListener(ea);
		numberButton.addActionListener(ea);

		// 确定按钮的事件监听
		approveButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// 关闭窗口.
				dispose();

				domain.getTextPane().getTextArea().setFont(groupFont());
			}
		});
		
		// 取消按钮事件监听.
		cancelButton.addActionListener(new CancelAction(this));
	}

	/**
	 * 按照选择组合字体
	 * 
	 * @return 字体
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
	 * 编码选择事件的监听动作
	 * 
	 * @author 米强
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
