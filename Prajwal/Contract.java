

public class Contract implements Cloneable{

	private Mobile smartPhone;
	private int month;
	private double plan;
	private double total; 
	
	
	public Contract(Mobile smartPhone, int month, double plan) {
		
		this.smartPhone = smartPhone;
		this.month = month;
		this.plan = plan;
		this.total = (smartPhone.getPrice() + (month * plan)); 
		
	}
	
	public void setTotal(double total) {
		
		this.total = total;
		
	}
	
	public double getTotal() {
		
		return total;
		
	}
	
	public void setMonth(int month) {
		
		this.month = month;
		
	}
	
	public int getMonth() {
		
		return month;
		
	}
	
	public void setPlan(int plan) {
		
		this.plan = plan;
		
	}
	
	public double getPlan() {
		
		return plan;
		
	}
	
	public void setSmartPhone(Mobile m) {
		
		this.smartPhone = m;
			
	}
	
	public Mobile getSmartPhone() {
		
		return smartPhone;
		
	}
	
	public void setSmartphoneProperties(String Description, double price) {
		
		smartPhone.setDescription(Description);
		smartPhone.setPrice(price);
		
		
	}
	public Contract clone() throws CloneNotSupportedException{
		
		Contract c1 = (Contract)super.clone();  //Only clones the contract not the mobile inside the contract Cast the contract to clone
		c1.setSmartPhone((Mobile)smartPhone.clone());//clones the mobile as well as contract 
		return c1;
		
	
	}
	
	public String toString() {
		return "Description: " + smartPhone.getDescription() +"\n"+"Price: $"+smartPhone.getPrice()+
				"\n" + "Plan: $"+ this.getPlan() + "\n" + "Month: "+ this.getMonth() + "\n" + "Total: $"+ this.getTotal()+"\n"; 
		
	}

}
