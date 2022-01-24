
public class AnimalRace {

	public static void main(String[] args) {
		
		Food grass = new Food();
		
		Animal tortoise = new Animal(grass);
		Animal hare = new Animal(grass);
		
		hare.setMaxRest(200);
		hare.setSpeed(7);
		hare.setPosition(0);
		hare.setName("bugs");
		hare.setMaxEat(20);
		
		
		tortoise.setSpeed(4);
		tortoise.setMaxRest(150);
		tortoise.setPosition(0);
		tortoise.setName("Arnold");
		tortoise.setMaxEat(10);
		
		Thread tortoiseThread = new Thread(tortoise);
		Thread hareThread = new Thread(hare);
		
		tortoiseThread.start();
		hareThread.start();
		
		

	}

}
