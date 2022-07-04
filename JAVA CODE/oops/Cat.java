package oops;

public class Cat extends Animal{
	public void jump()
	{
		System.out.println("Jumping");
	}
	
	public void eat()
	{
		super.eat();
	}
	
	public void eat(String food)
	{
		System.out.println("Eating "+food);
	}
}
