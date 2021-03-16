package code09_08;

public class Hero {

	String name;
	int hp;

	public void attck() {

	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		//		this.hp = 100;
		this("ダミー");

	}

	public Hero(int hp) {

	}

	public Hero(String nam, int hp) {
		this(49);

	}
}
