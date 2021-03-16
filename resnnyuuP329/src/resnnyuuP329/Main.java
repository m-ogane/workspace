package resnnyuuP329;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cleric c = new Cleric();
		c.name = "tarou";
		c.nowHp = 20;
		c.nowMp = 5;
		c.selfAid();
		System.out.println(c.nowMp);
		c.pray(1);
		System.out.println(c.nowMp);
	}

}
