package epithecExercices;

import exceptions.WeaponException;

public abstract class Character implements Movable {
	protected String name;
	protected final String RGBClass;
	protected Integer life ;
	protected Integer agility;
	protected Integer strength;
	protected Integer wit;
	
	/**
	 * constructor of Character class
	 * @param name is name of character
	 * @param value is type of character
	 */
	public Character(String name,String value) {
		this.RGBClass = value;
		this.name = name;
		
	}
	
	/**
	 * attack function allow the character to be able to attack if they have a good weapon.
	 * else the exception is raise .
	 * @param weapon
	 * @throws WeaponException
	 */
	protected abstract void attack(String weapon);
	
	//getter
	
	/**
	 * @return the Name of current character
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	/**
	 * @return the life point of the current character.
	 */
	public Integer getLife() {
		// TODO Auto-generated method stub
		return this.life;
	}

	/**
	 * @return the Agility point of the current character.
	 */
	public Integer getAgility() {
		// TODO Auto-generated method stub
		return this.agility;
	}


	/**
	 * @return the Strength point of the current character.
	 */
	public Integer getStrength() {
		// TODO Auto-generated method stub
		return this.strength;
	}


	/**
	 * @return the wit point of the current character.
	 */
	public Integer getWit() {
		// TODO Auto-generated method stub
		return this.wit;
	}



	/**
	 * @return the type of character.
	 */
	public String getRPGClass() {
		// TODO Auto-generated method stub
		return this.RGBClass;
	}


	// setter
	/**
	 * @param name name of character.
	 */
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}



	/**
	 * @param life point of character.
	 */
	public void setLife(Integer life) {
		// TODO Auto-generated method stub
		this.life = life;
	}



	/**
	 * @param agility : the new agility point of character
	 */
	public void setAgility(Integer agility) {
		// TODO Auto-generated method stub
		this.agility = agility;
		
	}



	/**
	 * @param strength the new strength point of character
	 */
	public void setStrength(Integer strength) {
		// TODO Auto-generated method stub
		this.strength = strength;
	}



	/**
	 * @param wit the new wit point of character
	 */
	public void setWit(Integer wit) {
		// TODO Auto-generated method stub
		this.wit = wit;
		
	}
	
	// movable methodes 
	/**
	 * this function allow to character to move right
	 */
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println("["+this.getName()+"]:	"+"Move Right");
	}
	
	/**
	 * this function allow to character to move left
	 */
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println("["+this.getName()+"]:	"+"Move Left");
	}
	
	/**
	 * this function allow to character to move forward
	 */
	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("["+this.getName()+"]:	"+"Move Forward");
	}
	
	/**
	 * this function allow to character to move back
	 */
	@Override
	public void moveBack() {
		// TODO Auto-generated method stub
		System.out.println("["+this.getName()+"]:	"+"Move Back");
		
	}
	
	/**
	 * this function allow the characters to unsheathe their weapons.
	 * @param name 
	 */
	public void Unsheathe(String name) {
		System.out.print("["+this.getName()+"]:	"+"unsheathes his weapon");
	}

	

}
