package aggregationEncapsulation2;


public class TestCustomer {

	public static void main(String[] args) 
	
	{
		Address ad = new Address("Ist Main HSR Layout,", "Bangalore");
		Address ad1 = new Address("Ist Main Electronics city, ", "Banglore");
		
		Customer c = new Customer("John",ad,ad1);
		c.getCustomerDetails();
		
		

	}

}
