package epithecExercices;

public class ExempleStep3 {
	
	/**
	 * **********************Step3*************************
	 * 
	 * The main class display the following messages, 
	 * 
	 * respectively:
	 * 
	 * [name]:  moves  right
	 * [name]:  moves  left
	 * [name]:  moves  back
	 * [name]:  moves  forward
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**********************Step3*************************");
		Character  character = new  TestCharacter("soso");
		
		
		character.moveForward();
		character.moveLeft();
		character.moveRight();
		character.moveBack();
		
		
		
	}

}
