package day4;

public class Customer 
{ 
	private String customerName;
	private Address residentialAddress;
//	public Customer() {
//		super();
//	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getCustomerDetails()
	{
		
		System.out.println("Customer : " +customerName);
		System.out.println("Residential Address : "+residentialAddress.getAddressLine() +residentialAddress.getCity());
	}
	
	
	
  
}
