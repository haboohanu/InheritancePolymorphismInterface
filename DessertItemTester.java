
public class DessertItemTester {
	public static void main(String[] args) {
		DessertItem c1  = new Candy("AlmondJoy", 500, 3.8, .30);
		
		System.out.println(c1);
		IceCream ic1 = new IceCream("vanilla", 5, 600);
		System.out.println(ic1);
		Cookie co1 = new Cookie("ChocChip", 240, 20, 4.99 );
		System.out.println(co1);
		System.out.println(co1.getCost());
		Sundae s1 = new Sundae("strawberry", 8, 800, "hotfudge", .50);
		System.out.println(s1);
		Candy c2 = new Candy();
		System.out.println(c2);
		Checkout r1 = new Checkout();
		r1.enterItem(c1);
		r1.enterItem(ic1);
		r1.enterItem(co1);
		r1.enterItem(s1);
		System.out.println(r1);
		
		
	
	}

}
