package epithecExercices;

public class Exemple1 {
	/**
	 * main class run attack method.
	 * Example of the display:
	 * Jean-Luc
	 * 50
	 * 2
	 * 2
	 * 2
	 * Character
	 * Jean-Luc: Rrrrrrrrr....
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("**********************Step1*************************");
		Character  perso = new  TestCharacter("Jean -Luc");
		
		System.out.println(perso.getName());
		System.out.println(perso.getLife());
		System.out.println(perso.getAgility());
		System.out.println(perso.getStrength());
		System.out.println(perso.getWit());
		System.out.println(perso.getRPGClass());
		perso.attack("my  weapon");

	}

}
