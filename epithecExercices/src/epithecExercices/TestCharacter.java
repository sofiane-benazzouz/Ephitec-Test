package epithecExercices;

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
	
	public void moveRight() {
		// TODO Auto-generated method stub
		super.moveRight();
	}

	
	public void moveLeft() {
		// TODO Auto-generated method stub
		super.moveLeft();
	}

	
	public void moveForward() {
		// TODO Auto-generated method stub
		super.moveForward();
	}

	
	public void moveBack() {
		// TODO Auto-generated method stub
		super.moveBack();
	}

}
