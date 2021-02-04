package day2;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		int[] a= {3,10,7,2,20,15,23,32,43,1};
		System.out.println("Before Sorting");
		for(int i =0;i<a.length;i++)
		{
			
			System.out.print( a[i] +" ");
		}
		
		System.out.println();
		
		System.out.println("After Sorting");
		Arrays.sort(a);
		for(int i =0;i<a.length;i++)
		{
			
			System.out.print( a[i] +" ");
		}
		
		

	}

}
