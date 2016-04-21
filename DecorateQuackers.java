
public class DecorateQuackers implements Quackable {
	private Quackable quacker;
	private static int counter;
	
	public DecorateQuackers(Quackable quacker) {
		this.quacker = quacker;
		counter = 0;
	}
	@Override
	public void quack() {
		counter++;
		quacker.quack();
	}
	
	public static int numOfQuacks(){
		return counter;
	}
	public static void reset() {
		counter = 0;		
	}
}
