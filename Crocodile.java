/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Crocodile extends AquaticAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("Hssss");
	}
	
	public void layEggs(){
		System.out.println("A very well protected nest of crocodile eggs was laid");
	}
	
	
}