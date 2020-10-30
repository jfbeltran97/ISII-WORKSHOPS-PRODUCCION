package ec.edu.espol.workshops.second;

/**
 * This class is used to calculate the insurance for a customer.
 * @author Johnny Beltrán
 *
 */
public final class CarInsurance {

  /**
   * Base value from which the premium is calculated.
   */
  public static final int BASE = 500;

  private CarInsurance() {

  }

  /**
   * Calculates premium based on customer properties.
   * 
   * @param c The customer for whom the value is calculated.
   * @return The calculated premium if customer is valid, -1 otherwise.
   */
  public static int calculatePremium(Customer c) {
    if (!c.isValid()) {
      return -1;
    }
    int premium = BASE;
    premium -= 100 * (c.ageBetween(45, 65) ? 1 : 0);
    premium -= 200 * (c.isFemale() || c.isMarried() ? 1 : 0);
    premium += 1500 * (c.isMale() && !c.isMarried() && c.getAge() < 25 ? 1 : 0);
    return premium;
  }
}