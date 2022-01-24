import java.util.Random;


public class Animal implements Runnable{
	
	private String name;
	private int position;
	private int speed;
	private int maxRest;
	private static boolean winner = false;
	private int maxEat;
	public int getMaxEat() {
		return maxEat;
	}


	public void setMaxEat(int maxEat) {
		this.maxEat = maxEat;
	}

	private Food food;
	
	public Animal(Food food){
		this.food = food;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMaxRest() {
		return maxRest;
	}

	public void setMaxRest(int maxRest) {
		this.maxRest = maxRest;
	}

	//@override run method from runnable class
	public void run(){
		System.out.println("starting race " + getName());
		while(position<125 && !isWinner()){
			position += speed;
			Random rand = new Random();
			
			try {
				Thread.sleep(rand.nextInt(maxRest) + 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!isWinner()){
				System.out.println(getName() + " is at " + position + " yards");
				food.eat(rand.nextInt(maxEat) + 1, getName());
			}
			
		}
		
		if(position >= 125 && !isWinner()){
			setWinner(true);
			System.out.println(getName() + " won");
		}
	}


	public synchronized static boolean isWinner() {
		return winner;
	}


	public synchronized static void setWinner(boolean caz) {
		Animal.winner = caz;
	}

}
