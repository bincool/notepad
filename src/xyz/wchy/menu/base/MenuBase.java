/**
* @FileName: MenuBase.java
* @Package: xyz.wchy.menu.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: MenuBase.java: 菜单基类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.menu.base;

import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: MenuBase.java
* 
* @Description: 
* <p>
* 菜单基类：记事本菜单分为一级菜单和二级点击事件菜单.
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
* @Date: 2018年1月19日 下午2:25:42.
* 
*/
public abstract class MenuBase 
{
	
	/**
	 * 领域对象.
	 */
	protected static final DomainHelper domain = DomainHelper.getInstance();
	
	/**
	 * 初始化菜单.
	 */
	protected abstract void initMenu();
	
	/**
	 * 给菜单绑定事件.
	 */
	protected abstract void bindActionListener();
	
}
