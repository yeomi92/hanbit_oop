package phone;

public class Iphone extends Nokia{
	public final static String BRAND="������";
	protected String data;
	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data=data;
	}
	@Override
	public String toString() {
		return String.format("%s������ %s�� ���¿��� '%s'���� %s�� �˻��ߴ�.",BRAND,move,receiver,data);
	}
}
