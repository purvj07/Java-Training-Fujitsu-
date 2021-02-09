package encapsulationInheritance;

import java.util.*;

public class BookDetails {

	public static void main(String[] args) 
	{
		Book b = new Book();
		EngineeringBook e = new EngineeringBook();
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Book No: ");
			b.setBookNo(input.nextInt());
			System.out.println("Authors Name: ");
			b.setAuthor(input.next());
			System.out.println("Title: ");
			b.setTitle(input.next());
			System.out.println("Price: ");
			b.setPrice(input.nextInt());
			System.out.println("Category: ");
			e.setCategory(input.next());
			
			
		}
		
		
	    
		
		
	}

}
