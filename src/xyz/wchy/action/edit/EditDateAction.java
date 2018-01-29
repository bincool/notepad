/**
* @FileName: EditDateAction.java
* @Package: xyz.wchy.action.edit
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: EditDateAction.java: 编辑操作菜单-时间/日期事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.edit;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DateUtils;
import xyz.wchy.utils.DomainHelper;

/**
* @ClassName: EditDateAction.java
* 
* @Description: 
* <p>
* 编辑操作菜单-时间/日期事件.
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
* @Date: 2018年1月21日 上午12:47:45.
* 
*/
public class EditDateAction extends BaseAction 
{

	/* (non-Javadoc)
	 * @see xyz.wchy.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// 获取文本域.
		JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
		
		// 获取当前编辑框中光标的位置.
		int index = jTextArea.getCaretPosition();
		
		// 设置日期格式.
        String localTime = DateUtils.getTime();
        
        String newString = jTextArea.getText().substring(0, index) + localTime + jTextArea.getText().substring(index, jTextArea.getText().length());
        
        // 将拼接好的字符串显示出来.
        jTextArea.setText("");
        jTextArea.append(newString);
	}
	
	
	
}
