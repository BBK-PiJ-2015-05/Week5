/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 7 Final means no change
* erroneous code that will try to call on a Final class
*/

public class ErrorFinal extends String{

	/**
	* class cannot extend from a final class
	*any method trying to access it's variables will fail
	*/
	public void printEven(){
		for(int i = 0; i < this.length; i++){
			if(i % 2 == 0){
			System.out.print(this.charAt(i));
			}
		}
	}
}