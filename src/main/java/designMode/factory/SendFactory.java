package designMode.factory;
/** 
 * @author  阮航  
 * @date 创建时间：2017年11月28日 上午11:36:10 
 * @version 1.0 
*/
public class SendFactory {

	public Sender smSender(){
		return new SmsSender();
	}
	
	public Sender mailSender(){
		return new MailSender();
	}
}
