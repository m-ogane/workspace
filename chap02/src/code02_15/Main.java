package code02_15;

public class Main {

	public static void main(String[] args) {
		/*		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、"+age+"歳の"+name+"さん");
		*/

		int maru = new java.util.Random().nextInt(6);
		int sankaku = new java.util.Random().nextInt(6);
		maru++;
		sankaku++;
		int kati = Math.max(maru, sankaku);
		System.out.println(maru+"とは"+sankaku+"は、"+kati+"の方が大きいので"+kati+"の勝ち");

	}

}
