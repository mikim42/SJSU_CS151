

public class MyTest {

public static void main(String[] args) {
	
	Mobile m = new Mobile("Iphone", 1000.00);
	Contract c1 = new Contract(m,12,40);
	Contract c2 = null;
	Contract c3 = null;
	
	try {
		
		c2 = c1.clone();
		c3 = c1.clone();
		
		
		
	}
	
	catch(CloneNotSupportedException ex) {
		
		System.out.println("We had a problem with copying the contract. Please try again!");
		
		
	}
	
	c3.setMonth(24);
	c3.setPlan(20);
	c3.setSmartphoneProperties("Galaxy", 500.00);
	System.out.println("-----------------------\n");
	System.out.println("Original Contact");
	System.out.println(c1.toString());
	System.out.println("\n");
	System.out.println("Copied Contract");
	System.out.println(c2.toString());
	System.out.println("-----------------------\n");
	System.out.println("Original Contact");
	System.out.println(c1.toString());
	System.out.println("\n");
	System.out.println("Modified Contract");
	System.out.println(c3.toString());
}

}
