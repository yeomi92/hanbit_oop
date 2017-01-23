package starcraft;

public abstract class Unit {
	protected String name;
	protected int energe;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getEnerge(){
		return energe;
	}
	public void setEnerge(int energe){
		this.energe=energe;
	}
	public abstract void decEnergy();
	@Override
	public String toString() {
		return String.format("%s: %d",name,energe);
	}
}
