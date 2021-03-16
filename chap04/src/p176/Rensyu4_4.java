package p176;

public class Rensyu4_4 {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();

		/*	for(int i =0; i <numbers.length; i++) {
				if (input == numbers[i]) {
				System.out.println("アタリ");
				}
			}*/

		for (int x : numbers) {
			//	if (input == numbers[x]) {//無視
			if (input == x) {
				//	int x = nembers[0];
				//boolean nubers[x] =true; 無視

				System.out.println("アタリ");

			}

		}

	}
}