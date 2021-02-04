package day2;

public class largest_smallest {

	public static void main(String[] args) {
		int [] a = {5,7,9,10,1,3,12,4};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
		}
		System.out.println("Largest no "+ a[0] );
		System.out.println("SecLargest no "+ a[1] );
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
		}
		System.out.println("Smallest no "+ a[0]	 );
		System.out.println("SecSmallest no "+ a[1] );
	}
}
		
		


