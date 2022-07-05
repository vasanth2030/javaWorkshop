package oops;

public class Cat extends Animal{
	public void jump()
	{
		System.out.println("Jumping");
	}
	
	public void eat()
	{
		System.out.println("Eating cat food");
		super.eat();
	}
	
	public void eat(String food)
	{
		System.out.println("Eating "+food);
	}
}
