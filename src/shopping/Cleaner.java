package shopping;

public class Cleaner extends Product{
	private String power;
	public Cleaner() {
		super(300);
	}
	@Override
	public String getName() {
		return "Cleaner";
	}
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Cleaner [name=" + name + ", price=" + super.getPrice() + ", company=" + company+"]";
	}
	
}
