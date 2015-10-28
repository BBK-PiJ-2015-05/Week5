/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 6 Java Magic
*/

// Teacher.java
public class Teacher {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void teach(String lessonName) {
		System.out.println("Teaching lesson: " + lessonName);
	}
}
