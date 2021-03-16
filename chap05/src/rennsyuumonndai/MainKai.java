package rennsyuumonndai;

public class MainKai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] address = { "誰かさんに", "ああ", "ｆｆｆｆ" };
		//		String text = ("ああああああああああああああああああああ");
		//		String title = "ss";
		//		email(address, title, text);
		//		email(address, text);0
		email(address);
	}

	public static void email(String[] address) {
		System.out.println(address[0] + "に、以下のメールを送信しました");
			System.out.println("件名:" + address[1]);
			System.out.println("本文:" + address[2]);

		//	public static void email(String address, String title, String text) {
		//		System.out.println(address + "に、以下のメールを送信しました");
		//		System.out.println("件名:" + title);
		//		System.out.println("本文:" + text);
		//	}
		//
		//	public static void email(String address, String text) {
		//		System.out.println(address + "に、以下のメールを送信しました");
		//		System.out.println("件名:無題");
		//		System.out.println("本文:" + text);
		//	}
	}
}
