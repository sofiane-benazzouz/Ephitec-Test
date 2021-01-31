package testEcpitech;

import static org.junit.Assert.*;

import exceptions.Warrior;
import org.junit.Test;


/**
 * @author benazzouz
 *
 */
public class WarriorTest extends CharacterTest{
	private Warrior warrior;
	
	
	/**
	 * constructor for create Warrior test character.
	 */
	public WarriorTest() {
		this.warrior = new Warrior("jin");
	}
	
	/**
	 * this method return a mock object for Warrior.
	 * and complete the possible Warrior character weapons in the list 'weapons'
	 */
	@Override
	protected MockCharacter getInstence(){
		// TODO Auto-generated method stub
		this.weapons.add("hammer");
		this.weapons.add("swand");
		return new MockCharacter(this.warrior,this.weapons);
	}
	
	/**
	 * test if Character create it good type. 
	 */
	@Test
	public void characterWarriorTest() {
		assertEquals(this.warrior.getRPGClass(),"Warrior");
	}



}




