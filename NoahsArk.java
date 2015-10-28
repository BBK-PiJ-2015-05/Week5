/**
* PiJ Birkbeck 2015-2016
* Week 5 Day 10
* Exercise 8. Noah's Ark(*)
* practices uses of abstracts and interfaces
*/

public class NoahsArk{

	
	public static void main(String[] args){
		
		Bear bear = new Bear();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Monkey monkey = new Monkey();
		Beetle beetle = new Beetle();
		Eagle eagle = new Eagle();
		Pigeon pigeon = new Pigeon();
		Crocodile croc = new Crocodile();
		Salmon salmon = new Salmon();
		Shark shark = new Shark();
		Snake snake = new Snake();
		Dolphin dolphin = new Dolphin();
		Fly fly = new Fly();
		Frog frog = new Frog();
		Lizard lizard = new Lizard();
		Whale whale = new Whale();


		System.out.println("Noah called all the animals of the world (except that horrible platypus, he is totally not welcome on Noah's Ark. I mean come on can't he be normal and have babies like the rest of the mammals... Him and the echidna can just go off into a ridiculous corner of the world like Australia and leave us alone)");
		

		whale.call();
		whale.makeSound();

		lizard.call();
		lizard.makeSound();

		frog.call();
		frog.makeSound();

		fly.call();
		fly.makeSound();

		dolphin.call();
		dolphin.makeSound();

		snake.call();
		snake.makeSound();

		shark.call();
		shark.makeSound();

		salmon.call();
		salmon.makeSound();

		croc.call();
		croc.makeSound();

		pigeon.call();
		pigeon.makeSound();

		eagle.call();
		eagle.makeSound();

		beetle.call();
		beetle.makeSound();

		monkey.call();
		monkey.makeSound();

		dog.call();
		dog.makeSound();

		cat.call();
		cat.makeSound();
		
		bear.call();
		bear.makeSound();

		System.out.println();
		System.out.println("After some time...");
		bear.reproduce();
		cat.reproduce();
		dog.reproduce();
		monkey.reproduce();
		beetle.reproduce();
		eagle.reproduce();
		pigeon.reproduce();
		snake.reproduce();
		lizard.reproduce();
		beetle.reproduce();
		croc.reproduce();
		dolphin.reproduce();
		fly.reproduce();
		frog.reproduce();
		salmon.reproduce();
		shark.reproduce();
		whale.reproduce();
	
	}
}