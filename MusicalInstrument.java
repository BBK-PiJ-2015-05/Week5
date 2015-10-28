/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 5 Multiple Inheritance
*/

public class MusicalInstrument{
	private String sound;
	
	public MusicalInstrument(String sound){
		this.sound = sound;
	}
	
	public void play(){
		System.out.printf("%s, %s, %s\n", sound, sound, sound);
	}
}