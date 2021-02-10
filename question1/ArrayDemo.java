package question1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		 System.out.println("Enter the required number of Persons Age to be compaired: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int []age = new int [size];
	      System.out.println("Enter the age : ");
	      for(int i=0; i<size; i++) {
	         age[i] = s.nextInt();
	      }
	      System.out.println("Ages to be compaired are : "+Arrays.toString(age));
	      int count = 0;
	     int children = 0;
	     int adults;
	     int seniorcitizen;
	      for(int i =0;i<size; i++)
	      {
	    	  if(age[i] < 18)
		      {
		    	  System.out.println("Children : ");
		    	 
		    	  
		      }
	    	  if (age[i] >= 18 || age[i] < 55)
	    	  {
	    		  
	    		
	    		  System.out.println("Adults: " );
	    	  }
	    	  
	    	  if (age[i]>= 55)
	    	  {
	    		  System.out.println("Senior Citizens : ");
	    		 
	    	  }
	      }
	      
	}

}
