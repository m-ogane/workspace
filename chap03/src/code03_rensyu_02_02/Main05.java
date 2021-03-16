package code03_rensyu_02_02;

public class Main05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int daia = new java.util.Random().nextInt(6);
		int daib = new java.util.Random().nextInt(6);
		daia ++;
		daib ++;

		int win = Math.max(daia,daib);
		
		if (daia==daib) {
			System.out.println("引き分け");
		}
			else {

		System.out.println(daia+"と"+daib+"は"+win+"の方が大きいので"+win+"の勝ち");
			}
		}


	}

