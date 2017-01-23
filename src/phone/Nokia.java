package phone;

public class Nokia extends Phone{
	public final static String BRAND="노키아";
	protected String move;
	protected boolean portable;
	public String getMove(){
		return move;
	}
	protected void setMove(String move){
		this.move=move;
	}
	public boolean isPotable(){
		return portable;
	}
	public void setPotable(boolean potable){
		setMove((potable)?"이동 가능":"이동 불가능");
		this.portable=potable;
	}
	@Override
	public String toString() {
		return String.format("%s때문에 %s한 상태에서 '%s'에게 %s라고 말했다.",BRAND,move,receiver,call);
	}
}
