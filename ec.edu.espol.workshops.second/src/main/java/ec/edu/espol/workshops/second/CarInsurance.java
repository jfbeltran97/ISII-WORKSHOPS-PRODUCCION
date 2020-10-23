package ec.edu.espol.workshops.second;

public class CarInsurance {
	public static final int BASE = 500;
	
	private CarInsurance() {
		
	}
	
	public static int calculatePremium(Customer c) {
		if (!c.isValid()) return -1;
		int premium = BASE;
		if( c.ageBetween(45, 65) ) premium -= 100;
		if( c.isFemale() || c.isMarried() )
			premium -= 200;
		else if ( c.isMale() && !c.isMarried() && c.getAge() < 25 )
			premium += 1500;
		return premium;
	}
}
