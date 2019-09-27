public class Monster {
	// Monster properties
	private String name;
	private int health;
	private int damage;
	
	// Constructor
	public Monster(String name, int health, int damage) {
		this.name = "Monster";
		this.health = 30;
		this.damage = 2;
	}
	
	// Attack
	public String Attack(Monster opponent) {
		while(true) {
			opponent.health -= this.damage;
			return String.format("%s attacks %s for 2 damage!", this.name, opponent.name, this.damage);
		}
	}
}