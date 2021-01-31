package epithecExercices;

import java.util.ArrayList;

public class Mage extends Character {
	
	ArrayList<String> weapons = new ArrayList<>();
	
	
	/**
	 * 
	 * 
	 * @param name the name of the Warrior type character
	 */
	public Mage(String name) {
		// TODO Auto-generated constructor stub
		super(name,"Mage");
		this.life = 70;
		this.agility = 10;
		this.strength = 3;
		this.wit = 10;
		this.weapons.add("magic");
		this.weapons.add("wand");
		System.out.println("["+this.getName()+"]:	"+"May the gods be with me.");
	}
	
	/**
	 * attack function allow the character to attack another character if they have a good weapon.
	 * 
	 * @param weapon 
	 */
	@Override
	protected void attack(String weapon) {
		// TODO Auto-generated method stub
		if(weapons.contains(weapon.toLowerCase())) {
			System.out.println("["+this.getName()+"]:	"+"May the gods be with me.");
			System.out.println("["+this.getName()+"]:	"+"Rrrrrrrrrrrrrr....");
			System.out.println("["+this.getName()+"]:	"+"feel the power of my ["+weapon+"]");
		}
		
	}
	/**
	 * this function allow to character to move right
	 */
		public void moveRight() {
			// TODO Auto-generated method stub
			super.moveRight();
			System.out.println(" Like furtivel");
		}

		/**
		 * this function allow to character to move left
		 */
		public void moveLeft() {
			// TODO Auto-generated method stub
			super.moveLeft();
			System.out.println(" Like furtivel");
		}

		/**
		 * this function allow to character to move forward
		 */
		public void moveForward() {
			// TODO Auto-generated method stub
			super.moveForward();
			System.out.println(" Like furtivel");
		}

		/**
		 * this function allow to character to move back
		 */
		public void moveBack() {
			// TODO Auto-generated method stub
			super.moveBack();
			System.out.println(" Like furtivel");
			
		}
		

}
