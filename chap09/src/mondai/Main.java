package mondai;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int baseHP = 25;
		Thief t = new Thief("アサカ", baseHP);
		System.out.println(baseHP + " ; " + t.hp);
		heal(baseHP);
		heal(t);
		System.out.println(baseHP + " : " + t.hp);
	}

}
