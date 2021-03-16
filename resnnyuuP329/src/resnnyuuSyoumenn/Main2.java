package resnnyuuSyoumenn;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car2 c = new Car2();
		c.fuel = 20;


		c.accelarate(45);
		int hasixtuta = c.run(2);
		System.out.println(hasixtuta+"km/h走行!!");
		System.out.println(c.run(2)+"km/h走行!!");
		c.showMeter();
		c.stop();
		c.showMeter();
	}

}
