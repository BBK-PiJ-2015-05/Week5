/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Pigeon extends FlyingAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("coo coo");
	}
	
	public void layEggs(){
		System.out.println("A nest of pigeon eggs was laid");
	}
	
	
}