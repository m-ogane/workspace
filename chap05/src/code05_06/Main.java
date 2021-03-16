package code05_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*int x =100;
		 *int y =10;
		 *add(x,y);
		 */

		int b = 100;
		int a = 10;
		add(a, b);
//		int a = 100;
		int as = a + b;
		System.out.println(a + "+" + b + "=" + as);
		//	int ans add();
	}

	public static int add(int x, int y) {
		System.out.println(x,y);
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
		return ans;
	}
}
