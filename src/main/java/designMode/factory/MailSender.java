package designMode.factory;
/** 
 * @author  阮航  
 * @date 创建时间：2017年11月28日 上午11:34:23 
 * @version 1.0 
*/
public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail !");
	}

}
