/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 6 Java Magic
* A lecturer has both teaching and research responsibilities
*/

public class Lecturer extends Teacher {
	
	/**
	* constructor from the super class requires a String name
	* added new constructor to fix this compiler issue
	* @param name
	*/
	public Lecturer(String name) {
		super(name);
	}
	
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
}
