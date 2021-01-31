package exceptions;

public class TestCharacter extends Character {
	
	public TestCharacter(String name) {
		super(name,"Character");
		this.life = 50;
		this.agility = 2;
		this.strength = 2;
		this.wit = 2;
	}
	


	@Override
	protected void attack(String weapon) {
		System.out.println("["+this.getName()+"]:	"+"Rrrrrrrrrrrrrr....");
	}

}
