package exceptions;

public class WeaponException extends Exception{

	/**
	 * this exception will be waived when the character's weapon 
	 * is not present or the character does not have a good weapon
	 * 
	 * @param string the display message when exception raise
	 */
	public WeaponException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
		
}
