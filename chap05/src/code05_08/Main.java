package code05_08;

public class Main {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
		//	return x + y;

	}

	public static void main(String[] aregs) {
		System.out.println(add(add(10, 20), add(30, 40)));
		//		System.out.println(add(30,70));
		//		System.out.println(100);
//		byte r = new java.util.Random().nextInt(8);
//		short x = new java.util.Random().nextInt(3);
		int l = new java.util.Random().nextInt();
		long t = new java.util.Random().nextInt();
//		double = new java.util.Random().nextInt();
//		float = new java.util.Random().nextInt();
//		
		
//		System.out.println(r);
//		System.out.println(x);
		System.out.println(l);
		System.out.println(t);

	}
}
