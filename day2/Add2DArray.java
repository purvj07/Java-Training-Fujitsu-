package day2;

public class Add2DArray {

	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},{2,1,3},{2,4,4}};    
		int b[][]={{1,3,2},{2,4,3},{1,2,4}};    
		    
		  
		int c[][]=new int[3][3];  
		
		
		for(int i=0;i<3;i++)
		{  
			for(int j=0;j<3;j++)
			{ 
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}    
		 System.out.println(); 
		}    
	}

}
