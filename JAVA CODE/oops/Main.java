package oops;

public class Main {
	
	public static void main(String[] args) {
		Animal dog= new Animal("Labrador","Chicken");
		
//		dog.setName("Labrador");
//		dog.setFavoriteFood("Chicken");
		
		System.out.println(dog.getName());
		System.out.println(dog.getFavoriteFood());
	}

}
