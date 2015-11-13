/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Cat extends LandAnimal implements Animal, Mammal{

	
	public void reproduce(){
		giveBirth();
	}
	
	public void makeSound(){
		System.out.println("Purrr");
	}
	
	public void giveBirth(){
		System.out.println("A baby kitten was born");
	}
	
	
}