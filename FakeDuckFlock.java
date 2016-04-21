import java.util.ArrayList;
import java.util.List;

public class FakeDuckFlock extends AbsFactQuackers{
	
	@Override
	public List<Quackable> createFlock() {
		ArrayList<Quackable> flock = new ArrayList<Quackable>();
		flock.add(new RubberDuck());
		flock.add(new AdapterGoose2());
		return flock;
	}
	
}
