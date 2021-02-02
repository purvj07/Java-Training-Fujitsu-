package day1;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 11;
		for(int i = 2; i <= num/2; i++)
		{
			if( (num % i == 0))
			{
				System.out.println( num + " is not a prime number" );
		System.exit(0);		
			}
		}
		System.out.println(num + " is a prime number" );
	

	}

}
