package pizza1;

public class Pizza extends Pastry {
	public Pizza(String Name,String desc) {
		super(Name, desc);
		setCost(super.getCost()*1.3);
		
	}
}