
public class AdapterGoose implements Quackable {
	private Goose goose;
	
	public AdapterGoose(Goose goose){
		this.goose = goose;
	}
	@Override
	public void quack() {
		goose.honk();
	}

}
