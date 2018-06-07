/**
* @FileName: BaseAction.java
* @Package: xyz.wchy.action.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseAction.java: 基类点击事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import xyz.wchy.bean.BaseData;

/**
* @ClassName: BaseAction.java
* 
* @Description: 
* <p>
* 基类点击事件：点击提示该"功能暂未开放，敬请期待".
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
* @Date: 2018年1月29日 上午10:13:40.
* 
*/
public class BaseAction extends BaseData implements ActionListener 
{
	
	/**
	 * 无参构造函数.
	 */
	public BaseAction() 
	{
		super();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info(BaseAction.class, "该功能暂未开放，敬请期待...");
		JOptionPane.showMessageDialog(domain.getFrame(), "该功能暂未开放，敬请期待...", "Notepad", JOptionPane.WARNING_MESSAGE);
	}

}
