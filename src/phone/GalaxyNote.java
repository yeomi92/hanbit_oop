package phone;

public class GalaxyNote extends Iphone{
	public final static String BRAND="�����ó�Ʈ";
	private String size;
	public String getSize(){
		return size;
	}
	public void setSize(String size){
		this.size = size;
	}
	@Override
	public String toString() {
		return String.format("%s������ %s�� ���¿��� %s���� %s���� %s�� �˻��ߴ�.",BRAND,move,size,receiver,data);
	}
}
