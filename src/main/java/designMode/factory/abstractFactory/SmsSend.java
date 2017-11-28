package designMode.factory.abstractFactory;
/** 
 * @author  阮航  
 * @date 创建时间：2017年11月28日 下午2:49:40 
 * @version 1.0 
*/
public class SmsSend implements Sender{

	@Override
	public void send() {
		System.out.println("this is massage!");
	}
}
