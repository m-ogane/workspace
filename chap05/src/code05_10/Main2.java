package code05_10;

public class Main2 {

	public static String add(String x, String y) {
		return x + y;
	}
	public static String add(String x, int y) {
		return x + y;
	}
	public static String add(int x, String y) {
		return x + y;
	}

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(add("おはよう", 24));
		System.out.println(add(24,"おはよう"));
		System.out.println(add("おはよう", "こんにちは"));
//		System.out.println(add(24,"おはよう"));
	}

}
