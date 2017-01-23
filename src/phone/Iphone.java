package phone;

public class Iphone extends Nokia{
	public final static String BRAND="아이폰";
	protected String data;
	public String getData(){
		return data;
	}
	public void setData(String data){
		this.data=data;
	}
	@Override
	public String toString() {
		return String.format("%s때문에 %s한 상태에서 '%s'에서 %s를 검색했다.",BRAND,move,receiver,data);
	}
}
