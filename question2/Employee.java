package question2;


public class Employee

{
	String firstName;
	String lastName;
	
	
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	@Override
	public String toString() {
		return firstName+ " "+lastName;
	}


public static void main(String[] args) 
{
		
		Employee e1 = new Employee("Purvi","Jain");
		Employee e2 = new Employee("Piyush","Tyagi");
		Employee e3 = new Employee("Ravi","Joshi");
		
	
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		

	}

}
