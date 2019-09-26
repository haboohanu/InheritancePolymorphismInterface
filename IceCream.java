
public class IceCream extends DessertItem {
	int icecreamCost;
	int icecreamCal;
	
	public IceCream(String name, int cost, int icecreamCal) {
		super(name);
		this.icecreamCost = cost;
		this.icecreamCal = icecreamCal;
	}
	
	public IceCream() {
		super();
		icecreamCost = 0;
		icecreamCal = 0;
	}

	
	public double getCost() {
		return icecreamCost;
	}
	public int getCalorie() {
		return icecreamCal;
	}
	public String toString() {
		return (name + "(IceCream)\t\t"
				+ "" + icecreamCost + "\n" + name + "(IceCream)\t\tcalories:" + icecreamCal + "\n");
		
	}
	
	

}
