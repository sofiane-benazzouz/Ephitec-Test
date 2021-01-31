package epithecExercices;

public class ExempleStep2 {
	/**
	 *  message is written in the following format:[name]: My name  will go down in  history!.
	 *  for a Warrior, and[name]: May the  gods be with me.
	 * 
	 * Exemple of the display:
	 * Jean-Luc: My name will go down in history!
	 * Robert: May the gods be with me.
	 * Jean-Luc: Rrrrrrrrr....Jean-Luc: I’ll crush you with my hammer!
	 * Robert: Rrrrrrrrr....Robert: Feel the power of my magic!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************Step2*************************");
		Character  warrior = new  Warrior("Jean -Luc");
		Character  mage = new  Mage("Robert");
		warrior.attack("hammer");
		mage.attack("magic");

	}

}
