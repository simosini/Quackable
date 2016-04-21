import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class QuackableTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	/*private final ArrayList<Quackable> extracted() {
		ArrayList<Quackable> flock = new ArrayList<Quackable>();
		flock.add(new Duck());
		flock.add(new RubberDuck());
		flock.add(new AdapterGoose2());
		return flock;
	}*/
	
	/*private ArrayList<Quackable> extracted2() {
		ArrayList<Quackable> flock = new ArrayList<Quackable>();
		flock.add(new DecorateQuackers(new Duck()));
		flock.add(new DecorateQuackers(new RubberDuck()));
		flock.add(new DecorateQuackers(new AdapterGoose2()));
		return flock;
	}*/
	
	
	@Before
	public void resetAndSetUpstream(){
		DecorateQuackers.reset();
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void test1() {
		Quackable duck = new Duck();
		duck.quack();
		assertEquals("quack\n", outContent.toString());		
	}
	
	@Test
	public void test2() {
		Quackable rubberDuck = new RubberDuck();
		rubberDuck.quack();
		assertEquals("squeak\n", outContent.toString());		
	}
	
	@Test
	public void test3() {
		Quackable goose = new AdapterGoose(new Goose());
		Quackable goose2 = new AdapterGoose2();
		goose.quack();
		//goose2.quack();
		assertEquals("honk\n", outContent.toString());	
	}
	
	/*@Test
	public void test4() {
		String quacks = createString(extracted());
		assertEquals("quacksqueakhonk", quacks);
	}*/
	
	/*@Test
	public void test5() {
		String quacks = createString(extracted2());
		assertEquals("quacksqueakhonk", quacks);
		assertEquals(3, DecorateQuackers.numOfQuacks());
	}
	
	@Test
	public void test6() {
		AbsFactQuackers absquack = new AbsFactQuackers();
		ArrayList<Quackable> flock = new ArrayList<Quackable>();
		flock.add(absquack.createDuck());
		flock.add(absquack.createRubberDuck());
		flock.add(absquack.createGoose());
		flock.add(absquack.createDecoratedDuck());
		flock.add(absquack.createDecoratedGoose());
		flock.add(absquack.createDecoratedRubberDuck());
		for (Quackable q : flock)
			q.quack();
		assertEquals(3, DecorateQuackers.numOfQuacks());
	}
	
	@Test
	public void test7() throws Exception {
		CompositeQuacker flock = new CompositeQuacker();
		flock.addQuacker(new Duck());
		flock.addQuacker(new RubberDuck());
		flock.addQuacker(new AdapterGoose2());
		flock.quack();
		assertEquals("quack\naqueak\nhonk\n", outContent.toString());
	}*/
	
	@Test
	public void test8() throws Exception {
		List <Quackable> realFlock = new RealDuckFlock().createFlock();
		List <Quackable> fakeFlock = new FakeDuckFlock().createFlock();
		
	}
	
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	


	/*private String createString(ArrayList<Quackable> flock) {
		StringBuilder expression = new StringBuilder();
		for (Quackable quack : flock)
			expression.append(quack.quack());
		return expression.toString();
	}*/
	
	
	
	

}
