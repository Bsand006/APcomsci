package as1;

public class Troll {

	String name;
	double money;
	static int trolls = 0;
	static double treasury = 0;

	public Troll(String n) {
		name = n;
		trolls++;
		
	}

	public void collect(double loot) {
		money = loot;
		treasury += loot;
	}

	public double displayLoot() {
		return money;
	}

	public static double treasury() {
		return treasury;
	}
	
	public static double reset() {
		treasury = 0;
		return treasury;
	}
}
