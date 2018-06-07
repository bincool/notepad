/**
* @FileName: ViewStatusBarAction.java
* @Package: xyz.wchy.action.view
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ViewStatusBarAction.java: 查看操作菜单-状态栏事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.view;

import java.awt.event.ActionEvent;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: ViewStatusBarAction.java
* 
* @Description: 
* <p>
* 查看操作菜单-状态栏事件.
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
* @Date: 2018年1月21日 上午12:53:46.
* 
*/
public class ViewStatusBarAction extends BaseAction 
{
	
	/**
	 * 领域对象.
	 */
	private static final DomainHelper domain = DomainHelper.getInstance();

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		domain.getToolState().setVisible(!domain.getToolState().isVisible());
	}

}
