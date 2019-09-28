public class Monster {
	// Monster properties
	private String name;
	public int health;
	private int damage;
	
	// Random damage points that vary from 1 to 5
	public int getRandomDamage() {
		return (int) (Math.random() * 5 + 1);
	}
	
	// Constructor
	public Monster(String name, int health, int damage) {
		this.name = "Monster";
		this.health = 50;
		this.damage = 2;
	}
	
	// Monsters attack each other!
	public void Attack(Monster opponent) {
		while(this.health > 0 && opponent.health > 0) {
			opponent.health -= this.getRandomDamage();
			this.health -= opponent.getRandomDamage();
		}
		if(opponent.health > this.health) {
			System.out.println(this.name + " lost!");
		} else {
			System.out.println(opponent.name + " lost!");
		}
	}
}