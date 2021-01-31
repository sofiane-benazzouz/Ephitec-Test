package exceptions;

import java.util.ArrayList;

public class Mage extends Character {
	
	/**
	 * list of all weapons used by characters.
	 */
	ArrayList<String> weapons = new ArrayList<>();
	
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
	 * else the exception is raise.
	 * @param weapon 
	 * @throws WeaponException 
	 */
	@Override
	protected void attack(String weapon) throws WeaponException{
		// TODO Auto-generated method stub
		if(weapons.contains(weapon.toLowerCase())) {
				System.out.println("["+this.getName()+"]:	"+"Rrrrrrrrrrrrrr....");
				System.out.println("["+this.getName()+"]:	"+"feel the power of my ["+weapon+"]");
		}else if(weapon.equals("")){
			throw new WeaponException("["+this.getName()+"] I refuse  to fight  with my bare  hand");
		}
		else{
				throw new WeaponException("["+this.getName()+"] I don't need  this  stupid "+weapon+ "! Don't misjudge  my  powers!");
			}
		
	}
	
	/**
	 * this function allow to character to move right
	 */
		public void moveRight() {
			// TODO Auto-generated method stub
			super.moveRight();
			System.out.println("Like furtivel");
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
			System.out.println(" Like  furtivel");
			
		}
		

}
