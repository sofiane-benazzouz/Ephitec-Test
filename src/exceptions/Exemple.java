package exceptions;

public class Exemple {
	/**
	 * **********************Step5 and step6*************************
	 * 
	 * shows the following display 
	 * 
	 * Jean-Luc: My name will go down in history!
	 * Robert: May the gods be with me.
	 * Jean-Luc: A screwdriver?? 
	 * What should I do with this?!
	 * Robert: I don’t need this stupid hammer! 
	 * Don’t misjudge my powers!Jean-Luc: Rrrrrrrrr....
	 * Jean-Luc: I’ll crush you with my hammer!
	 * Robert: I refuse to fight with my bare hands
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************Step5 and step6*************************");
		Character  warrior = new  Warrior("Jean -Luc");
		Character  mage    = new  Mage("Robert");
		warrior.tryToAttack("screwdriver");
		mage.tryToAttack("hammer");
		warrior.tryToAttack("hammer");
		try {
			mage.attack("");
			} 
		catch (WeaponException e) {
			System.out.println(e.getMessage ());
		}


	}

}
