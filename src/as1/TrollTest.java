package as1;

public class TrollTest {

	public static void main(String[] args) {
		Troll a = new Troll("Jimmy");
		Troll b = new Troll("Jimbo");
		a.collect(12);
		b.collect(69.2);

		System.out.println("Troll " + a.name + " has " + a.displayLoot() + " coins");
		System.out.println("Troll " + b.name + " has " + b.displayLoot() + " coins");

		System.out.println("Together the trolls have " + Troll.treasury() + " coins");
		
		System.out.println("Big L the trolls now have " + Troll.reset() + " coins");

	}

}
