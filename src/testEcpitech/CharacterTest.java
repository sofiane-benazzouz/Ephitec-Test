package testEcpitech;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import exceptions.Character;
import exceptions.WeaponException;

import org.junit.Before;
import org.junit.Test;


/**
 * 
 * @author benazzouz
 * 
 * i used the principle of code factoring to avoid repetitions.
 * most of the test performed in this class
 * for runs the test under you must be in Warrior or Mage and run tests.
 * Warrior and Mage class runs the same tests from the class Warrior and Mage.
 *
 */
public abstract class CharacterTest {
	
	/**
	 * 'ByteArrayOutputStream' allow to get back the stream out and and redirect it in the array.
	 */
	private ByteArrayOutputStream outPut;
	/**
	 * list of all weapons used by characters
	 */
	protected ArrayList<String> weapons;
	/**
	 * the simulator of the Character Type.
	 */
	private MockCharacter Mcharacter;
	
	/**
	 * Initialize Given attributes
	 */
	@Before
	public void SetUp() {
		this.weapons = new ArrayList<String>();
		this.Mcharacter =  getInstence();
		this.outPut = new ByteArrayOutputStream();
	}
	
	/**
	 * this method it used in the two class who who inherits from CharacterTest.
	 */
	protected abstract MockCharacter getInstence();
	
	/**
	 * test character attack in the case when the character have good given.
	 * I get back the stream out and and redirect it in the array named ByteArrayOutputStream.
	 * After we prepare the display with and Icompare it with given string using assertEquals.
	 * 
	 */
	@Test
	public void AttackTestWithGoodWeapon() throws WeaponException {
		System.setOut(new PrintStream(outPut));
		this.Mcharacter.MockAttackTest(this.weapons.get(0));
		assertEquals("jin "+ this.weapons.get(0),outPut.toString());
	}
	
	/**
	 * test character attack in the case when the character not have any weapon given.
	 * I get back the stream out and and redirect it in the array named ByteArrayOutputStream.
	 * After we prepare the display with and I compare it with given string using assertEquals.
	 *
	 */
	@Test
	public void AttackTestWithNoWeapon() {
		try {
			this.Mcharacter.MockAttackTest("");
		} catch (WeaponException e) {
			// TODO Auto-generated catch block
			assertEquals("no weapon",e.getMessage());
		}
	}
	
	/**
	 * test character attack with wrong weapon
	 * I get back the stream out and and redirect it in the array named ByteArrayOutputStream.
	 * After we prepare the display with and I compare it with given string using assertEquals.
	 *
	 */
	@Test
	public void AttackTestWithWrongWeapon() {
		try {
			this.Mcharacter.MockAttackTest("coco");
		} catch (WeaponException e) {
			// TODO Auto-generated catch block
			assertEquals("not good weapon",e.getMessage());
		}
	}
	
	/**
	 * test if character can move.
	 * we get back the stream out and and redirect it in the array named ByteArrayOutputStream.
	 * After we prepare the display with and we compare it with given string using assertEquals.
	 *
	 */
	@Test
	public void TestMoveCharacter() {
		System.setOut(new PrintStream(outPut));
		this.Mcharacter.MockMoveTest();
		assertEquals("move","move");
	}

	/**
	 * Mock object simulating the character's behavior 
	 */
	public class MockCharacter{
		private String name;
		private ArrayList<String> weapons;
		
		/**
		 * constructor for create Mock character
		 */
		public MockCharacter(Character character,ArrayList<String> weapons) {
			this.name = character.getName();
			this.weapons = weapons;
		}
		
		/**
		 * MockAttackTest simulating the Attack function of character
		 * the Attack function allow character to attack using weapon adapted to the character.
		 */
		public void MockAttackTest(String weapon) throws WeaponException {
			if(weapons.contains(weapon.toLowerCase())){
				System.out.print(this.name+" "+weapon);
			}else if(weapon.equals("")) {
				throw new WeaponException("no weapon");
			}else {
				throw new WeaponException("not good weapon");
			}
		}
		
		/**
		 *  this function simulate character move 
		 */
		public void MockMoveTest() {
			System.out.println("move");
		}
		
		
	}
	
	
	

}
