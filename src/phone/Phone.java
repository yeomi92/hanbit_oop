package phone;

public class Phone{
	public final static String KIND="�Ｚ��ȭ��";
	protected String receiver, call;
	public String getReceiver(){
		return receiver;
	}
	public void setReceiver(String receiver){
		this.receiver=receiver;
	}
	public String getCall(){
		return call;
	}
	public void setCall(String call){
		this.call=call;
	}
	@Override
	public String toString(){
		return KIND+"�� ����ؼ� "+receiver+"���� "+call+"�̶�� ���ߴ�.";
	}
}
