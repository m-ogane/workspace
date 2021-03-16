package code17_101;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = null;
		try {
		System.out.println(s.length());
	}catch(NullPointerException e){
		System.out.println("例外をcatchしました");
	System.out.println("-----スタックトレース(ここから)----");
	e.printStackTrace();
	System.out.println("------スタックトレース(ここまで)----");
	}

	}


}
