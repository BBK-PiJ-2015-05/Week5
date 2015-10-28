/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 1 Extension, extension...
* Main to launch Phone classes
*/

public class PhoneLauncher{
	public static void main (String[] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	private void launch(){
		SmartPhone myCell = new SmartPhone("Nokia");
		myCell.browseWeb("Facebook");
		System.out.println(myCell.findPosition());
		System.out.println(myCell.getBrand());
		myCell.ringAlarm("Program!!");
		myCell.playGame("Fallout");
		myCell.call("001");
		myCell.call("2");
		myCell.call("3");
		myCell.call("4");
		myCell.call("5");
		myCell.call("6");
		myCell.call("7");
		myCell.call("008");
		myCell.call("9");
		myCell.call("10");
		myCell.call("11");
		myCell.printLastNumbers();
	}
}