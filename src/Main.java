import java.util.List;

public class Main {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle<Car> vehicle = new Vehicle<>();
		vehicle.set(new Car());
		
		System.out.println(vehicle.getT());
	}

	/**
	 * generics method
	 * 
	 */
	public static <T extends Object> void handleGeneric(T t) {

	}

	public static List<?> handleCheck(List<? extends Number> values) {
		Main.handleGeneric(new Integer(10));
		
		return values;

	}

}
