package day2;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a = { 1,4,34,56,7};
		int [] b = {1,4,34,56,7};
		int key;
		System.out.println( "Enter a key value to search" );
		Scanner in = new Scanner( System.in );
		        	
	    key = in.nextInt();

		for( int i = 0; i < a.length; i++ )
		{
			if( key == a[i] )
			{
				System.out.println( i );
		        System.exit(0);
		        }
			}
		System.out.println( "-1" );
		}
	}



