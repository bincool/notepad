/**
* @FileName: FileExitAction.java
* @Package: xyz.wchy.action.file
* @Copyright: 2018 www.lfclass.com Inc. All Rights Reserved.
* @Description: FileExitAction.java: �ļ������˵�-�˳��¼�.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����10:13:40.
* @Content: ����.
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
* �ļ������˵�-�˳��¼�.
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
* @Date: 2018��1��16�� ����1:12:10.
* 
*/
public class FileExitAction extends BaseAction 
{

	/* �˳��ļ�ǰӦ����ʾ�Ƿ��ȱ��浱ǰ�ļ�.
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		/**
         * �˳������˳�ʱ�����ж��Ƿ���Ҫ����
         */
        JTextArea jTextArea = DomainHelper.getInstance().getTextPane().getTextArea();
        String fileName = DomainHelper.getInstance().getFileName();
        
        // 1 �ж��Ƿ����ļ�·��.
        if (StringUtils.isNotEmpty(fileName)) 
        {
        	
        } 
        else 
        {
        	// �ж��ı������Ƿ�Ϊ��.
        	if (StringUtils.isEmpty(jTextArea.getText())) 
        	{
        		
        	} 
        	else 
        	{
        		
        	}
        }
        
        
//        if(Util.shell.fileDir != null || StringUtils.isNotEmpty(jTextArea.getText())) 
//        {  //�ļ�Ŀ¼��Ϊ�գ�˵���д��ŵ��ļ�����Ҫѯ���Ƿ񱣴�
//            if(Util.shell.fileDir == null){
//                tips = "�ļ�  �ޱ���   �������Ѿ��ı䡣\n"+"�뱣���ļ���";
//            }else{
//                tips = "�ļ�  " +Util.shell.fileDir + "  �������Ѿ��ı䡣\n"+"�뱣���ļ���";
//            }
//            int n=JOptionPane.showConfirmDialog(null, tips,"���±�",JOptionPane.YES_NO_CANCEL_OPTION);
//            if(n==0){  //�� ����0  �񷵻�1 ȡ�� ����2 
//                SaveMethod savemethod = new SaveMethod();
//                savemethod.Save(); //���ǣ��򱣴��ļ�Ȼ����ļ�
//            }else if(n==1){ //���ط�
//                System.exit(0);
//            }else if(n==2){  //����ȡ��
//                return ;
//            }
//            System.exit(0);
//        }else{ 
//            if(Util.shell.getText().getText() != ""){ //��Ŀ¼Ϊ�գ��������ݲ�Ϊ�գ�˵�������ݵ�δ���棬��ʾ֮
//                tips = "�ļ�  �ޱ���   �������Ѿ��ı䡣\n"+"�뱣���ļ���";
//                int n=JOptionPane.showConfirmDialog(null, tips,"���±�",JOptionPane.YES_NO_CANCEL_OPTION);
//                if(n==0){  //�� ����0  �񷵻�1 ȡ�� ����2 
//                    SaveMethod savemethod = new SaveMethod();
//                    savemethod.Save(); //���ǣ��򱣴��ļ�Ȼ����ļ�
//                }else if(n==1){ //���ط�
//                    System.exit(0);
//                }else if(n==2){  //����ȡ��
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