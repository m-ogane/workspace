package cobe04_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = { 20, 30, 40, 50, 80 };
		int sum = 0;
		// ↑忘れるな
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			int avg = sum / scores.length;
			System.out.println("合計点" + sum);
			System.out.println("平均点" + avg);

			/*		int m = Math.max(80, i);
			System.out.println(m);
			int n = Math.min(80, i);
			System.out.println(n);
			*/

		}
		int s = (scores[0] * scores[1] * scores[2] * scores[3] * scores[4]);
		System.out.println(s);

		/*
				int a = scores[0];
				for (int j = 0; j < scores.length; j++) {
					if (a < scores[0]) {
						System.out.println(j);
					}
		*/
		//		int m Math.max(80, i);

	}

}
