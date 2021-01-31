package exceptions;

import java.util.ArrayList;

public class Warrior extends Character{
	
	/**
	 *  list of all weapons used by characters.
	 */
	ArrayList<String> weapons = new ArrayList<>();
	
	/**
	 * 
	 * 
	 * @param name the name of the Warrior type character
	 */
	public Warrior(String name) {
		// TODO Auto-generated constructor stub
		super(name,"Warrior");
		this.life = 100;
		this.agility = 8;
		this.strength = 10;
		this.wit = 3;
		this.weapons.add("hammer");
		this.weapons.add("sword");
		System.out.println("["+this.getName()+"]:	"+"My name will go down in history!");
	}
	
	/**
	 * attack function allow the character to attack another character if they have a good weapon.
	 * else the exception is raise.
	 * @param weapon 
	 * @throws WeaponException 
	 */
	@Override
	protected void attack(String weapon) throws WeaponException {
		// TODO Auto-generated method stub
		if(weapons.contains(weapon.toLowerCase())) {
				System.out.println("["+this.getName()+"]:	"+"Rrrrrrrrrrrrrr....");
				System.out.println("["+this.getName()+"]:	"+"I will crush you with my ["+weapon+"]");
			}
		else if(weapon.equals("")){
				throw new WeaponException("["+this.getName()+"] I refuse  to fight  with my bare  hand");
			}
		else {
				throw new WeaponException("["+this.getName()+"] a "+weapon+" ??  What  should I do with  this!");
			}
	}
	
	/**
	 * this function allow to character to move right
	 */
	public void moveRight() {
		// TODO Auto-generated method stub
		super.moveRight();
		System.out.println(" Like a bad boy");
	}

	/**
	 * this function allow to character to move left
	 */
	public void moveLeft() {
		// TODO Auto-generated method stub
		super.moveLeft();
		System.out.println("t Like a bad boy");
	}

	/**
	 * this function allow to character to move forward
	 */
	public void moveForward() {
		// TODO Auto-generated method stub
		super.moveForward();
		System.out.println(" Like a bad boy");
	}

	/**
	 * this function allow to character to move back
	 */
	public void moveBack() {
		// TODO Auto-generated method stub
		super.moveBack();
		System.out.println(" Like a bad boy");
		
	}

}
