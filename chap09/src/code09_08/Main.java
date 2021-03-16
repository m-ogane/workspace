package code09_08;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero("ミナト");

		System.out.println(h.name + "\t" + h.hp);

		Hero h2 = new Hero("アサ");

		System.out.println(h2.name + "\t" + h2.hp);

		Hero h3 = new Hero();
		System.out.println(h3.name + "\t" + h3.hp);

		Hero h4 = new Hero("太郎",88);
		System.out.println(h4.name + "\t" + h4.hp);

	}

}
