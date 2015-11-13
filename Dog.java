/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Dog extends LandAnimal implements Animal, Mammal{

	
	public void reproduce(){
		giveBirth();
	}
	
	public void makeSound(){
		System.out.println("Woof");
	}
	
	public void giveBirth(){
		System.out.println("A baby puppy was born");
	}
	
	
}