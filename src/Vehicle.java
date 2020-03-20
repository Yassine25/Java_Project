

public class Vehicle<T> {
	private T t;

	public Vehicle() { }
	
	public void set(T t) {
		this.t = t;
	}

	public T getT() {
		System.out.println("type = " + t);
		return this.t;
	}

}
