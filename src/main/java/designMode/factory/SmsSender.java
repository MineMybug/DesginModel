package designMode.factory;
/** 
 * @author  阮航  
 * @date 创建时间：2017年11月28日 上午11:35:15 
 * @version 1.0 
*/
public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("this is massage!");
	}

}
