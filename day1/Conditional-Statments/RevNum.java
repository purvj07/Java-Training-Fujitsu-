package day1;

public class RevNum {

	public static void main(String[] args) {
		int n =365;
		int rem;
		while(n!=0) {
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}

	}

}
