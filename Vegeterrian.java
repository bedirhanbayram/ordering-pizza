package pizza1;
public class Vegeterrian extends Pizza{
	public Vegeterrian() {
		super("Vegeterrian Pizza", "no meat");
		setCost(super.getCost()*1.2);
		
	}
}