/**
* @FileName: BaseDialog.java
* @Package: xyz.wchy.dialog.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseDialog.java: 基类对话框.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
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
* 基类对话框.
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
* @Date: 2018年1月25日 下午4:58:48.
* 
*/
public abstract class BaseDialog extends JDialog 
{

	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 领域对象.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * 日志对象.
	 */
	protected static final Logger LOGGER = Logger.getLogger();
	
	/**
	 * 有参数构造函数.
	 * @param owner
	 */
	public BaseDialog(Frame owner) 
	{
		super(owner);
	}
	
	/**
	 * 初始化对话框.
	 */
	protected abstract void initDialog();
	
}
