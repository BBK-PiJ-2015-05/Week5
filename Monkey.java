/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Monkey extends LandAnimal implements Animal, Mammal{

	
	public void reproduce(){
		giveBirth();
	}
	
	public void makeSound(){
		System.out.println("Oo Oo Ah Ah");
	}
	
	public void giveBirth(){
		System.out.println("A baby monkey was born");
	}
	
	
}