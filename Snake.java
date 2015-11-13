/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Snake extends LandAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("Hisssss");
	}
	
	public void layEggs(){
		System.out.println("A dangerous clutch of snake eggs were laid");
	}
	
	
}