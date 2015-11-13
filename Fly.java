/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* 
*/

public class Fly extends FlyingAnimal implements Animal, EggLayingAnimals{

	
	public void reproduce(){
		layEggs();
	}
	
	public void makeSound(){
		System.out.println("ZzzzzzzzzZZZZZzz");
	}
	
	public void layEggs(){
		System.out.println("Ugh maggots. Why maggots??");
	}
	
	
}