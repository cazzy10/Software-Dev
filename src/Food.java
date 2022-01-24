
public class Food {
	
	
	synchronized public void eat(int eatingTime, String name){
		try {
			System.out.println(name + " has started eating");
			Thread.sleep(eatingTime);
			System.out.println(name + " has finished eating after " + eatingTime + " minutes");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
