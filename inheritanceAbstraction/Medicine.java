package inheritanceAbstraction;

abstract class Medicine 
{
	double price;
	String expiry_date;
	public Medicine(double price, String expiry_date) {
		super();
		this.price = price;
		this.expiry_date = expiry_date;
	}
	
	abstract void displayLabel();
	void getDetails()
	{
		System.out.println("Price is: "+price);
		System.out.println("Expiry-Date: "+expiry_date);
		
	}

}
