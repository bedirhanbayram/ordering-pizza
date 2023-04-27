package pizza1;
public class Waiter {
	
	public static void main(String[] args) {
	Pastry[] orders= new Pastry[100];		
	Pastry b1=new Margarita();
	b1.setSize(1.5);
	orders[0]= b1;
	Pastry b2=new Pizza("anchuez","Anchuez pls");
	orders[1]= b2;
	Pizza b3= new Vegeterrian();
	orders[2]= b3;
	System.out.println("TOTAL COST " + CalculateCost(orders));
}
	public static double CalculateCost(Pastry[] theorder) {
		double cost=0;
		for(int i=0;i<3;i++) {
			System.out.println(theorder[i]);
			cost+=theorder[i].getCost();
		}
		
		return cost;
		
	}

}