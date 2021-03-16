package mondai01;

public class Meibo {
	String touroku ;
	String name;
	String gender;
	int		age;
	String addr;
public void hyouzi() {
	System.out.println(touroku+"\t"+name+"\t"+gender+"\t"+age+"\t"+"addr");
}
	public static void main(String[] args) {
		//見積もりオブジェクトを3つ作成
		Meibo meibo01 = new Meibo();
		Meibo meibo02 = new Meibo();
		Meibo meibo03 = new Meibo();

		//1つ目のオブジェクトにデータをセット
		meibo01.touroku="07-11";
		meibo01.name="山田";
		meibo01.gender="男";
		meibo01.age=34;
		meibo01.addr="東京都";

		//2つ目のオブジェクトにデータをセット
		meibo02.touroku="07-13";
		meibo02.name="鈴木";
		meibo02.gender="女";
		meibo02.age=45;
		meibo02.addr="神奈川県";

		//3つ目のオブジェクトにデータをセット
		meibo03.touroku="07-16";
		meibo03.name="田中";
		meibo03.gender="男";
		meibo03.age=41;
		meibo03.addr="東京都";

		System.out.println("登録日\t|氏名\t|性別\t|年齢\t|住所");
		System.out.println("--------|-------|-------|-------|--------");
		//1つ目のオブジェクトに対して表示用のメソッドを実行
		meibo01.hyouzi();

		//2つ目のオブジェクトに対して表示用のメソッドを実行
		meibo02.hyouzi();

		//3つ目のオブジェクトに対して表示用のメソッドを実行
		meibo03.hyouzi();
	}

}

