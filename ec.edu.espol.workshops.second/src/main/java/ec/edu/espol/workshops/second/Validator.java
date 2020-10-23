package ec.edu.espol.workshops.second;

public class Validator {
	public static boolean isLicenseValid(String license) {
		return (license.substring(0,2).equals("080"))?true:false;
	}
}
