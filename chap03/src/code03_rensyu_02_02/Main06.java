package code03_rensyu_02_02;

public class Main06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ran = new java.util.Random().nextInt(9);
		ran++;
		System.out.println("1桁の数字を入力してください。");
		int nyu = new java.util.Scanner(System.in).nextInt();

		if (ran == nyu){
		System.out.println("ビンゴ");
		}	else {
		System.out.println("はずれ;");
		}

	}

}
