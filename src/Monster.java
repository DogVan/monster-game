import java.util.Random;

public class Monster {
	// Monster properties
	private String name;
	private int health;
	private int damage;
	
	// Random damage points that vary from 1 to 5
	int randomDamagePoints = (int)(Math.random() * 1 + 5);
	
	// Constructor
	public Monster(String name, int health, int damage) {
		this.name = "Monster";
		this.health = 50;
		this.damage = 2;
	}
	
	// Opponent attacks Monster 1 - Player
	public void AttackPlayer(Monster player) {
		while(health > 0) {
			
		}
	}
	
	// Player attacks Monster 2 - Opponent
	public void AttackOpponent(Monster opponent) {
		while(health > 0) {
			
		}
	}
}