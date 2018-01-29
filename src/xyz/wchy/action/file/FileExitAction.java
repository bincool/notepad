/**
* @FileName: FileExitAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: FileExitAction.java: 文件操作菜单-退出事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 上午10:13:40.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.action.file;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import xyz.wchy.action.base.BaseAction;
import xyz.wchy.utils.DomainHelper;
import xyz.wchy.utils.StringUtils;


/**
* @ClassName: FileExitAction.java
* 
* @Description: 
* <p>
* 文件操作菜单-退出事件.
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
* @Date: 2018年1月16日 下午1:12:10.
* 
*/
public class FileExitAction extends BaseAction 
{

	/* 退出文件前应该提示是否先保存当前文件.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		/**
         * 退出函数退出时进行判断是否需要保存
         */
        JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
        String fileName = DomainHelper.getInstance().getFileName();
        
        // 1 判断是否有文件路径.
        if (StringUtils.isNotEmpty(fileName)) 
        {
        	
        } 
        else 
        {
        	// 判断文本内容是否为空.
        	if (StringUtils.isEmpty(jTextArea.getText())) 
        	{
        		
        	} 
        	else 
        	{
        		
        	}
        }
        
        
//        if(Util.shell.fileDir != null || StringUtils.isNotEmpty(jTextArea.getText())) 
//        {  //文件目录不为空，说明有打开着的文件，需要询问是否保存
//            if(Util.shell.fileDir == null){
//                tips = "文件  无标题   的文字已经改变。\n"+"想保存文件吗";
//            }else{
//                tips = "文件  " +Util.shell.fileDir + "  的文字已经改变。\n"+"想保存文件吗";
//            }
//            int n=JOptionPane.showConfirmDialog(null, tips,"记事本",JOptionPane.YES_NO_CANCEL_OPTION);
//            if(n==0){  //是 返回0  否返回1 取消 返回2 
//                SaveMethod savemethod = new SaveMethod();
//                savemethod.Save(); //点是，则保存文件然后打开文件
//            }else if(n==1){ //返回否
//                System.exit(0);
//            }else if(n==2){  //返回取消
//                return ;
//            }
//            System.exit(0);
//        }else{ 
//            if(Util.shell.getText().getText() != ""){ //若目录为空，但是内容不为空，说明有内容但未保存，提示之
//                tips = "文件  无标题   的文字已经改变。\n"+"想保存文件吗";
//                int n=JOptionPane.showConfirmDialog(null, tips,"记事本",JOptionPane.YES_NO_CANCEL_OPTION);
//                if(n==0){  //是 返回0  否返回1 取消 返回2 
//                    SaveMethod savemethod = new SaveMethod();
//                    savemethod.Save(); //点是，则保存文件然后打开文件
//                }else if(n==1){ //返回否
//                    System.exit(0);
//                }else if(n==2){  //返回取消
//                    return ;
//                }
//                System.exit(0);
//            }else{
//
//            }
//        }
		System.exit(0);
	}

}
