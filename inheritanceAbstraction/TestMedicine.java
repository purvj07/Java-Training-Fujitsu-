package inheritanceAbstraction;


import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) 
	{
		double i = Math.random()*4;
		int j = (int)i;
		System.out.println(j);
		
		switch(j)
		{
		case 1: Medicine m = new Syrup(57.23,"23-04-2022");
		        m.displayLabel();
		        break;
		
		case 2: Medicine m1 = new Ointment(127.25,"2-08-2023");
                m1.displayLabel();
                break;        
		        
		case 3: Medicine m2 = new Tablet(100.00,"15-05-2022");
                m2.displayLabel();
                break;         
		
		
		
		}

	}

}
