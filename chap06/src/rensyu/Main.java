package rensyu;

public class Main {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println(calc(num));
		}
		public static int calc(int[] num) {
			int total =0;
			for(int n :num) {
				total += n;
			}
			return total;
		}
	}