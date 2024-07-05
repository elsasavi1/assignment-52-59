package common;

/**
 * 53.Create product class with id,name,price,qnty and create object with some data and display
 *  that data using toString
 */
public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return this.id+","+this.name+","+this.price+","+this.quantity;
	}
	
	public boolean equals(Product p) {
		return (this.id == p.id) && (this.name.equals(p.name))
				&& (this.price == p.price) && (this.quantity == p.quantity);
		
	}
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(1);
		product.setName("Tide");
		product.setPrice(10.99);
		product.setQuantity(5);
		
		System.out.println(product);
	}
	
}

