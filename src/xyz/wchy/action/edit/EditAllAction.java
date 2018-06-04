/**
* @FileName: EditAllAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: EditAllAction.java: 编辑操作菜单-全选事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.StringUtils;

/**
* @ClassName: EditAllAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-全选事件.
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
* @Date: 2018年1月21日 上午12:47:13.
* 
*/
public class EditAllAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// 获取文本域.
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		// 直接调用自带的函数.
		jTextArea.selectAll();
		
		// 若内容不为空，说明全选有内容，因此需要将"删除" "剪切" "复制"这三个按钮设置成可选.
        if(StringUtils.isNotEmpty(jTextArea.getText())) 
        {
        	DomainHelper.getInstance().getMenuEditTrim().setEnabled(true);
        	DomainHelper.getInstance().getMenuEditCopy().setEnabled(true);
        	DomainHelper.getInstance().getMenuEditDelete().setEnabled(true);
        } 
        else 
        {
        	DomainHelper.getInstance().getMenuEditTrim().setEnabled(false);
        	DomainHelper.getInstance().getMenuEditCopy().setEnabled(false);
        	DomainHelper.getInstance().getMenuEditDelete().setEnabled(false);
        }
	}
	
}
