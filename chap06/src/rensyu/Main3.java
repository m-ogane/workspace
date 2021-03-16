package rensyu;
public class Main3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int s = kei(a, b);
		int t = kei(a, b, c);
		int f = kei2(a, b);
		String hh =("っさ");
		double g = 1.2;
		double h = 1.5;
		double j = kei(g, h);
		String l =kei(hh,a);
		String gg =kei(a,hh);
	}
	public static int kei(int x, int y) {
		int z = x + y;
		return z;
	}
	public static int kei2(int x, int y) {
		int z = x + y;
		return z;
	}
	public static int kei(int x, int y, int w) {
		int z = x + y + w;
		return z;
	}
	public static double kei(double x, double y) {
		double z = x + y;
		return z;
	}
	public static String kei(String x, int y) {
		String sss = x+y;
		return sss;
		}
	public static String kei(int x, String y) {
	 String sss =x+y;
	return sss;
	}
}