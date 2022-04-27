public class ProAthlete extends Athlete {
	
	void test() {
		System.out.println("My method");
	}
	
	public static void main(String args[]) {
		ProAthlete proAthlete = new ProAthlete();
		proAthlete.test();
	}
}

final class Athlete {
	String name = "";
	String sport = "";
}

//Compile-time error
