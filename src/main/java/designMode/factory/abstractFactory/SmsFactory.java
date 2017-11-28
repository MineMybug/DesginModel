package designMode.factory.abstractFactory;
/** 
 * @author  阮航  
 * @date 创建时间：2017年11月28日 下午2:55:03 
 * @version 1.0 
*/
public class SmsFactory implements Provide{

	@Override
	public Sender produce() {
		return new SmsSend();
	}

}
