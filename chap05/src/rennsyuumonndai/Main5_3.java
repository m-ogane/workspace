package rennsyuumonndai;

public class Main5_3 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String address = "誰かさんに";
		String text = ("ああああああああああああああああああああ");
		String title = "ss";
		email(address, title, text);
		email(address, text);
	}

	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
}
