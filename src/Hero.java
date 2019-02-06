
public class Hero {
	private String name;
	private int hp;
	private int mp;
	Hero() {
//		this.name = "Kara";
		this.hp = 100;
		this.mp = 10;
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

	public void attack() {

	}
}
