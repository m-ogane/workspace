package p176;

public class Rensyuu4_4kai_kai_kai {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers;
		numbers = new int[6];
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
		do {
			int num3 = new java.util.Random().nextInt(10);
			numbers[3] = num3;
		} while (numbers[2] == numbers[3] || numbers[3] == numbers[0]);

		do {
			int num4 = new java.util.Random().nextInt(10);
			numbers[4] = num4;
		} while (numbers[1] == numbers[2] || numbers[2] == numbers[0]);

		do {
			int num5 = new java.util.Random().nextInt(10);
			numbers[5] = num5;
		} while (numbers[1] == numbers[2] || numbers[4] == numbers[5]);

		for(int M == numbers);
		
	}

}