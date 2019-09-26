
public class Candy extends DessertItem{
	
	int candyCal;
	double candyWeight;
	double ppp;
	
	
	
	public Candy(String name, int candyCal, double candyWeight, double ppp) {
		
		super(name);
		this.candyCal = candyCal;
		this.candyWeight = candyWeight;
		this.ppp = ppp;
	}
	
	public Candy() {
		super();
		candyCal = 0;
		candyWeight = 0;
		ppp = 0;
		
	}

	//return cost of the candy
	public double getCost() {
		return candyWeight * ppp;
	}
	
	//return the amount of calories
	public int getCalorie() {
		return candyCal;
	}
	
	public String toString() {
		return (candyWeight + " lbs. @ " + ppp + " /lb. \n" + name + "(Candy)\t\t " + (candyWeight * ppp) + "\n" + name + "(Candy)\t calories:" + candyCal + "\n") ;
		
	}
	
	

}
