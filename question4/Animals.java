package question4;

public class Animal 
{
	void shout()
	{
		System.out.println("Shout of Animals");
	}
}

class Dog extends Animal
{
	void shout()
	{
		System.out.println("Dog barks");
	}
}

class Horse extends Animal
{
	void shout()
	{
		System.out.println("Horse neighs");
	}
}

class Cat extends Animal
{
	void shout()
	{
		System.out.println("Cat meows");
	}
}

public class Animals
{
	public static void main( String [] args)
	{
		Animal a1 = new Dog();
		a1.shout();
		Animal a2 = new Horse();
		a2.shout();
		Animal a3 = new Cat();
		a3.shout();
		
	}
}

