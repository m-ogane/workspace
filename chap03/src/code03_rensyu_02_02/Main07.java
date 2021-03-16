package code03_rensyu_02_02;

public class Main07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("パスワードを登録します");
		String pw = new java.util.Scanner(System.in).nextLine();
		System.out.println("パスワードの確認をします");
		String pwkaku = new java.util.Scanner(System.in).nextLine();

		if  (pw.equals (pwkaku) ) {
			System.out.println("登録しました");
		}
			else {
				System.out.println("パスワードが異なります");

			}
		}



}
