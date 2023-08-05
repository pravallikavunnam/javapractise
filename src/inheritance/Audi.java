package inheritance;

public class Audi extends Car {

	@Override
	public void start() { // Overridden Method from car class

		System.out.println("Audi ----Start");
	}
	
	//Individual method
	public void theftSafety() {
		System.out.println("Audi-----theftSafety");
	}
	

}
