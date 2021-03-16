package cobe04_18;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] scores = new int[2][3];
		scores[0][0] = 40;//兄　国語
		scores[0][1] = 50;//数学
		scores[0][2] = 60;//歴史
		//		scores [0][3]=10;
		scores[1][0] = 80;//弟の国語
		scores[1][1] = 90;//数学
		scores[1][2] = 70;
		//	scores [3][2]=30;
		System.out.println(scores[1][1]);//弟の数学の点数
	}

}
