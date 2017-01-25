package shopping;

public class TV extends Product{
	private String size;
	public TV() {
		super(300);
	}
	@Override
	public String getName() {
		return "TV";
	}
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "TV [name=" + name + ", price=" + price + ", company=" + company + "]";
	}
	
	
}
