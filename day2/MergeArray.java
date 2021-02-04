package day2;
import java.util.Arrays;  
public class MergeArray 
{

	public static void main(String[] args) 
	{
		int[] fArray = {2,5,8,9};        
		int[] sArray = {15,3,7,12};  
		
		int fl =fArray.length;          
		int sl = sArray.length;    
		int[] result = new int[fl + sl];  
		
		System.arraycopy(fArray, 0, result, 0, fl);  
		System.arraycopy(sArray, 0, result, fl, sl);  
		System.out.println(Arrays.toString(result));   

	}

}
