package rensyu13_7;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・タブ

		Wizard w = new Wizard();
		Wand w2 = new Wand();

		w2.setName("ロッド");
		System.out.println(w2.getName());

		w2.setPower(11);
		System.out.println(w2.getPower());

		w.setName("アサカ");
		System.out.println(w.getName());

		w.setHp(0);
		System.out.println(w.getHp());

		w.setMp(10);
		System.out.println(w.getMp());

	}

}
