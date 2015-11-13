/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Dolphin extends AquaticAnimal implements Animal, Mammal{

	
	public void reproduce(){
		giveBirth();
	}
	
	public void makeSound(){
		System.out.println("Eee Eee");
	}
	
	public void giveBirth(){
		System.out.println("A small dolphin was born");
	}
	
	
}