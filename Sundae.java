
public class Sundae extends IceCream {
	double toppingCost;
	String topping;
	int sundaeCal;
	
	public Sundae(String name, int cost, int sundaeCal, String topping, double toppingCost) {
		super( name, cost, sundaeCal);
		this.toppingCost = toppingCost;
		this.topping = topping;
		this.sundaeCal = sundaeCal;
	}
	
	public Sundae() {
		super();
		toppingCost = 0;
		topping = "none";
	}
	
	public int getCalorie() {
		return sundaeCal;
		
	}
	public double getCost() {
		return icecreamCost + toppingCost;
	}
	public String toString() {
		return (name + "(Sundae) with\n" + topping +"(Topping)\t\t" + (icecreamCost + toppingCost) + "\n"+ name + "(Sundae)\tcalories:" + sundaeCal + "\n");
		
	}
}
}
