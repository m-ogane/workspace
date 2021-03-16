package rensyu2_4;

public class Main00_00 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arrayA = {5, 8, 2};
		int[] arrayB;
		arrayB = arrayA;
		arrayA[0] = 100;
		System.out.println(arrayA[0]);
		int[] arrayC = {7,77,777};
		arrayA = arrayC;
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);
		arrayA = arrayB;
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);
		System.out.println(arrayC[0]);
		
		
	}

}
