 import java.util.ArrayList;
 
public class Checkout {
	public double taxRate;
	ArrayList<DessertItem> reg = new ArrayList<DessertItem>();
	
	public Checkout() {
		
	}
	
	//clear the cash register
	public void clear(){
		reg.clear();
	}
	
	//A dessertItem is added to the end of the list of items
	public void enterItem(DessertItem item) {
		reg.add(item);
		
	}
	
	//get the number of items
	public int numberOfItems() {
		return reg.size();
		
	}
	
	//get the total cost of the items(before tax)
	public int totalCost() {
		int totalCost = 0;
		for(int i = 0; i < reg.size(); i++) {
			totalCost = (int) (totalCost + reg.get(i).getCost());
		}
		return totalCost;
		
	}
	
	//get the total tax for the items
	public int totalTax() {
		int totTax = 0;
		for(int i = 0; i < reg.size(); i++) {
			totTax = (int) (totTax + .8*(reg.get(i).getCost()));
		}
		return totTax;
	}
	
	//returns the tax rate for this purchase
	public double getTaxRate() {
		return taxRate;
	}
	
	//changes the tax rate for this purchase
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public String toString(){
		String receipt = "Output Receipt \n";
		receipt+= "Number of items: " + numberOfItems() + "\n";
		receipt+= "Total cost: " + totalCost() + "\n";
		receipt+= "Total tax: " + totalTax() + "\n";
		receipt+= "Cost + tax: " + totalCost() + totalTax() + "\n";
		receipt+="J & J Dessert Shop\n";
		receipt+= "---------------------\n";
	
		for (int i=0;i<reg.size();i++)
		{receipt+= reg.get(i).toString();
			
		}
		receipt+="\nTax:\t\t\t" + totalTax() + "\n";
		receipt+="Total cost:\t\t"+ totalCost();


		return receipt;
		
	}
	
	
	
	
	

	
}
