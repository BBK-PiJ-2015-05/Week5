/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Salmon extends AquaticAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("Blub blub");
	}
	
	public void layEggs(){
		System.out.println("Many salmon fish roe were released into the water");
	}
	
	
}