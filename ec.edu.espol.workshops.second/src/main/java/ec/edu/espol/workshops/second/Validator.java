package ec.edu.espol.workshops.second;

/**
 * This class is used to create necessary validators.
 * @author Ana Carrión
 *
 */
public class Validator {
  
  public Validator() {

  }
  
  /**
   * Calculates premium based on customer properties.
   * 
   * @param license The license of one car
   * @return true if license starts with 080, false otherwise.
   */
  public static boolean isLicenseValid(String license) {
    return license.startsWith("080");
  }
}

