package phone;

public class Nokia extends Phone{
	public final static String BRAND="��Ű��";
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
		setMove((potable)?"�̵� ����":"�̵� �Ұ���");
		this.portable=potable;
	}
	@Override
	public String toString() {
		return String.format("%s������ %s�� ���¿��� '%s'���� %s��� ���ߴ�.",BRAND,move,receiver,call);
	}
}
