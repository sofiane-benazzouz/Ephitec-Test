package epithecExercices;

public class ExempleStep4 {
	/**
	 * **********************Step4*************************
	 * 
	 *  display the following messages that correspond to the class that overloads them:
	 *  
	 *  for a warrior:
	 *  
	 *  [name]:  moves  right  like a bad boy.
	 *  [name]:  moves  left  like a bad boy.
	 *  [name]:  moves  back  like a bad boy.
	 *  [name]:  moves  forward  like a bad boy.
	 *  
	 *  for a mage:
	 *  [name]:  moves  right  furtively.
	 *  [name]:  moves  left  furtively.
	 *  [name]:  moves  back  furtively.
	 *  [name]:  moves  forward  furtively.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************Step4*************************");
		Warrior  warrior = new  Warrior("Jean -Luc");
		Mage  	 mage    = new  Mage("Robert");
		warrior.moveRight ();
		warrior.moveLeft ();
		warrior.moveBack ();
		warrior.moveForward ();
		mage.moveRight ();
		mage.moveLeft ();
		mage.moveBack ();
		mage.moveForward ();

	}

}
