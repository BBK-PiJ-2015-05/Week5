/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Frog extends AquaticAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("Ribbot");
	}
	
	public void layEggs(){
		System.out.println("Many tadpoles grew from eggs laid in the water");
	}
	
	
}