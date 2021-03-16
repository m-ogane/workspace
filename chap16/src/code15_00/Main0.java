package code15_00;

public class Main0 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i <=100; i++) {
			sb.append(i+",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
		System.out.println(a[1]);
	}
}
