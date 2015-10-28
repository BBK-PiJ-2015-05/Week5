/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 5 Multiple Inheritance
*/

public class Guitar extends MusicalInstrument implements WoodenInstrument{

	public Guitar(String sound){
		super(sound);
	}
	
	public void burn(){
		System.out.println("crackle, crackle");
	}
}