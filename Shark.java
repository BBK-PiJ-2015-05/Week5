/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Shark extends AquaticAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("Quiet danger");
	}
	
	public void layEggs(){
		System.out.println("Large shark eggs were released into the water");
	}
	
	
}