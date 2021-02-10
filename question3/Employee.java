package question3;



class Employee extends Exception
{
	private String firstName;
	private String lastName;



	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	class NameCheck 
	{
		private final String Null = null;

		void name(String firstName, String lastName ) throws Employee
		{
			if(firstName == Null)
			{
				System.out.println("Entry Missing");
			}

			else if (firstName.length() <3)
			{
				System.out.println("minimum 3 character");
			}
		}
	}

		
	public static void main(String[] args)  throws Employee
		{
			NameCheck nameCheck = new NameCheck();
			nameCheck.name("pu", "");
		}




