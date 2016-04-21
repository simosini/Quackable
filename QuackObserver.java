
public class QuackObserver {
	private int counter = 0;
	
	public String update(){
		return "Observer1 : ho sentito " + (++counter) + " duck";
	}

	public int getTotal() {
		return counter;
	}
}
