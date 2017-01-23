package phone;

public class GalaxyNote extends Iphone{
	public final static String BRAND="갤럭시노트";
	private String size;
	public String getSize(){
		return size;
	}
	public void setSize(String size){
		this.size = size;
	}
	@Override
	public String toString() {
		return String.format("%s때문에 %s한 상태에서 %s으로 %s에서 %s를 검색했다.",BRAND,move,size,receiver,data);
	}
}
