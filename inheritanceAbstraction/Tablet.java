package inheritanceAbstraction;

public class Tablet extends Medicine
{
	public Tablet(double price, String expiry_date)
	{
		super(price,expiry_date);
	}

	@Override
	void displayLabel() 
	{
		System.out.println("Tablet: ");
		System.out.println("Oral medication");
		System.out.println("Store in a cool dry place");
	}

	
	
}
