import java.util.ArrayList;
import java.util.List;

public class RealDuckFlock extends AbsFactQuackers {

	@Override
	public List<Quackable> createFlock() {
		ArrayList<Quackable> flock = new ArrayList<Quackable>();
		flock.add(new Duck());
		return flock;
	}

}
