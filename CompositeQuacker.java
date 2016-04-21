import java.util.ArrayList;
import java.util.List;

public class CompositeQuacker implements Quackable {
	List<Quackable> flock;
	
	public CompositeQuacker() {
		flock = new ArrayList<Quackable>();
	}

	@Override
	public void quack() {
		for (Quackable quacker : flock) {
			quacker.quack();
		}
	}
	
	public void addQuacker(Quackable q){
		flock.add(q);
	}
	
	public void removeQuacker(Quackable q) {
		flock.remove(q);
	}
	
}
