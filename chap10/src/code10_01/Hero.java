package code10_01;

public class Hero {

	public Hero() {
		//System.out.println("Heroのコンストラクタが起動");
	}

	private String name = "ミナト";
	public int hp = 100;


	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("10ポイントのダメージをあたえた!");
	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した!");
	}

}
