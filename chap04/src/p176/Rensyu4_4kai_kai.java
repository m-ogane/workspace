package p176;

public class Rensyu4_4kai_kai {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers;
		numbers = new int[3];
		int num0 = new java.util.Random().nextInt(10);
		numbers[0] = num0;
		do {
			int num1 = new java.util.Random().nextInt(10);
			numbers[1] = num1;
		} while (numbers[0] == numbers[1]);
		do {
			int num2 = new java.util.Random().nextInt(10);
			numbers[2] = num2;
		} while (numbers[1] == numbers[2] || numbers[2] == numbers[0]);

		for(int m : numbers )
		System.out.println(m);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
	System.out.println("1桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int x : numbers) {
			if (input == x) {
				System.out.println("アタリ");
			}
		}
	}
}
