package rennsyuumonndai;

public class Main5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "ss";
		String address = "誰かさんに";
		String text = ("ああああああああああああああああああああ");
		email(address, title, text);
//		email("ss","ss","sss");
	}

	public static void email(String address, String title, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);

	}
}
