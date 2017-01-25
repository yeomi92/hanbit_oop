package shopping;

public class SmartPhone extends Product{
	private String giga;
	public SmartPhone() {
		super(300);
	}
	@Override
	public String getName() {
		return "SmartPhone";
	}
	public String getGiga() {
		return giga;
	}

	public void setGiga(String giga) {
		this.giga = giga;
	}

	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
}
