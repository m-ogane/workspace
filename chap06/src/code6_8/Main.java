package code6_8;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double tanka = 100;
		double kosuu = 10;
		double tax = 0.08;
		
		System.out.println("商品単価(税抜き):" + tanka);
		System.out.println("個数:" + kosuu);
		System.out.println("消費税:" + tax);
		System.out.println("金額(税込):" + (tanka * kosuu) * tax);

	}

}
