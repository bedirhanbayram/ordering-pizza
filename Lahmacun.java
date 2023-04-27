package pizza1;
public class Lahmacun extends Pastry {
	public Lahmacun(String Name,String desc) {
		super(Name, desc );
		setCost(super.getCost());
		}
}
