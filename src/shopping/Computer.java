package shopping;

public class Computer extends Product{
	private String ram;
	public Computer() {
		super(300);
	}
	@Override
	public String getName() {
		return "Computer";
	}
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
}
