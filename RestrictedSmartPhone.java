/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 4 Visibility
* RestrictedSmartPhone extends SmartPhone
* uncompilable code
*/
public class RestrictedSmartPhone extends SmartPhone{
	
	/**
	* @param brand constructor
	*/	
	public RestrictedSmartPhone(String brand){
		super(brand);
	}
	
	/**
	* @param game erroneous code
	* this method will create an error
	* method's accessibility cannot be overridden by a subclass
	*/
	@Override
	private void playGame(String game){
		//does nothing you evil kids
	}
}