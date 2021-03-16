package rensyu2_4;

public class Main_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sankakuArea(8591, 9029);
	}

	public static void sankakuArea(double teihen, double takasa) {
		double kotae = (teihen * takasa) / 2;
		printArea(kotae);
	}

	public static void printArea(double kai) {
		System.out.println("三角形の面積は" + kai + "cmです");
	}
}
