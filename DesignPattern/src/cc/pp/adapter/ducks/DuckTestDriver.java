package cc.pp.adapter.ducks;

public class DuckTestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says ...\n");
		turkey.gobble();
		turkey.fly();

		System.out.println("The Duck says ...\n");
		testDuck(duck);

		System.out.println("The TurkeyAdapter says ...");
		testDuck(turkeyAdapter);

	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
