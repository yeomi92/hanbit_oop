package generic;

public class GenericBean<T> {
	private T val;
	public GenericBean(String val) {
		this.val=(T)val;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
}
