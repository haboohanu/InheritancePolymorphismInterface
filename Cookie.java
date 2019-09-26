
public class Cookie extends DessertItem{
	
	int cookieCal;
	int numOfCookies;
	double ppd;
	
	public Cookie(String name, int cookieCal, int numOfCookies, double ppd) {
		
		super(name);
		this.cookieCal = cookieCal;
		this.numOfCookies = numOfCookies;
		this.ppd = ppd;
	}
	
	public Cookie() {
		super();
		cookieCal = 0;
		numOfCookies = 0;
		ppd = 0;
	}
	
	

	public double getCost() {
		return (float) (numOfCookies/12 * ppd) ;
	}
	
	public int getCalorie() {
		return cookieCal;
	}
	public String toString() {
		return (numOfCookies + " @ " + ppd + " /dz. \n" + name + "(Cookie)\t\t " + (numOfCookies/12 * ppd) + "\n" + name + "(Cookie)\t calories:" + cookieCal + "\n") ;
		
	}
}
