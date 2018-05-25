package Lab_07;

public class Ogre extends Entity{

	public static void main(String[] args) {

	}
	
	public void attack(int damageToInflict,Entity playerToAttack)
	{
		playerToAttack.setIntLife(playerToAttack.getIntLife() - damageToInflict);
		System.out.println("OUCH! " + playerToAttack.getStrName() + " is hit for " + damageToInflict);
		System.out.println(playerToAttack.getStrName() + " life is now: " + playerToAttack.getIntLife());
	}

}
