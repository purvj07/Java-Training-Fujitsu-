package day4;



public class TestCustomer {

	public static void main(String[] args) {
		
		Address ad = new Address("Ist Main HSR Layout,", "Bangalore");
		Customer c = new Customer("John",ad);
        c.getCustomerDetails();
	}

}

