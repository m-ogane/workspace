package cobe04_15;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arrayA = { 1, 2, 3 };
		int[] arrayB = { 1, 2, 3 };
	//	arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);
		System.out.println(arrayB[1]);
	}

}
