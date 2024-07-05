package common;

/**
 * 56.Create two product class objects and compare its data

 */
public class CompareProducts {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setId(1);
		p1.setName("Book1");
		p1.setPrice(55);
		p1.setQuantity(2);
		
		p2.setId(1);
		p2.setName("Book1");
		p2.setPrice(55);
		p2.setQuantity(2);
		
		
		System.out.println(p1.equals(p2));//updated product class to override equals

	}

}
