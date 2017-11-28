package designMode.factory.abstractFactory;
/** 
 * @author  阮航  
 * @date 创建时间：2017年11月28日 下午2:48:59 
 * @version 1.0 
*/
public class MailSend implements Sender{

	@Override
	public void send() {
		System.out.println("this is mail!");
	}

}
