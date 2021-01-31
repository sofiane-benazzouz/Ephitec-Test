package testEcpitech;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.Mage;


public class MageTest extends CharacterTest{
	
	private Mage mage;
	
	/**
	 * Constructor Mage Character test.
	 */
	public MageTest() {
		this.mage = new Mage("jin");
	}
	
	/**
	 * this method return a mock object for Mage.
	 * and complete the possible Mage character weapons in the list 'weapons'
	 */
	@Override
	protected MockCharacter getInstence(){
		// TODO Auto-generated method stub
		this.weapons.add("magic");
		this.weapons.add("wand");
		return new MockCharacter(this.mage,this.weapons);
		
	}
	
	/**
	 * test if Character create it good type. 
	 */
	@Test
	public void characterMageTest() {
		assertEquals(this.mage.getRPGClass(),"Mage");
	}


}
