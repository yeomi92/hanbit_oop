package starcraft;

public class Terran extends Unit{
	private boolean fly;
	public Terran(String name, boolean fly){
		super.name=name;
		energe=100;
		this.fly=fly;
	}
	@Override
	public void decEnergy(){
		energe-=3;
	}
}