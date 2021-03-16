package resnnyuuSyoumenn;

public class Car {
	int fuel;
	int speed;

	public void accelarate(int kasoku) {
		int nowSpeed = this.speed + kasoku;
		System.out.println(nowSpeed + "km/hに加速しました");
	}

	public int run(int hour) {
		fuel -= hour;
		int souKouKyori = this.speed * hour;
		System.out.println(souKouKyori + "km/h走行した");
		return souKouKyori;
	}

	public void stop() {
		this.speed = 0;
		System.out.println("止まりました");
	}

	public void showMeter() {
		System.out.println("現在の燃料" + fuel);
		System.out.println("現在の速度" + speed);
	}

}
