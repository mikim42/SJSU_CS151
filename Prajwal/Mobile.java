

public class Mobile implements Cloneable{

	private String Description;
	private double price;
	
	public Mobile(String Description, double price) {
		
		this.Description = Description;
		this.price = price;
		
	}
	
	
	
	
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		this.Description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
