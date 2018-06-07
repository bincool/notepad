/**
* @FileName: BaseDialog.java
* @Package: xyz.wchy.dialog.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseDialog.java: ����Ի���.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.dialog.base;

import java.awt.Frame;

import javax.swing.JDialog;

import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.Logger;

/**
* @ClassName: BaseDialog.java
* 
* @Description: 
* <p>
* ����Ի���.
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
* @Date: 2018��1��25�� ����4:58:48.
* 
*/
public abstract class BaseDialog extends JDialog 
{

	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �������.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
	/**
	 * �в������캯��.
	 * @param owner
	 */
	public BaseDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * ��ʼ���Ի���.
	 */
	protected abstract void initDialog();
	
}
