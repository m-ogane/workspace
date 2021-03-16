package Lesson12;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String tugihe;//後で解説 {}の外に出れないからここに入れない
		//とwhileにつかえない
		do {
			int num = new java.util.Random().nextInt(10)+1;
			System.out.println("1から9の数字を入力");
			int input = new java.util.Scanner(System.in).nextInt();
			if (num == input) {
				System.out.println("あたり！");
			} else {
				System.out.println("はずれ");
			}
			System.out.println("続ける?(y/n)");
		tugihe = new java.util.Scanner(System.in).nextLine();
		}while (tugihe.equals("y"));
	}

}
