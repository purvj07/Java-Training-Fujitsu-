package day1;

public class Pattern5to1 {

	public static void main(String[] args) {
		int i, j, rows=4;  
		for (i = rows; i >= 1; i--)   
		{  
		for (j = 1; j <= i; j++)  
		{  
		System.out.print(j+" ");  
		}  
		System.out.println();  
		}  

	}

}
