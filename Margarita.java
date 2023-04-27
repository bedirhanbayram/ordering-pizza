package pizza1;

public class Margarita extends Pizza {
	public Margarita() {
		super("Margarita", "mozerella and pepperoni");
		setCost(super.getCost()*1.1);
		
	}
}