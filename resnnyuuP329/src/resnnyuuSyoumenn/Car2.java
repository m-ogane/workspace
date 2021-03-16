package resnnyuuSyoumenn;

public class Car2 {
	int fuel;
	int speed;

	public void accelarate(int kasoku) {
		this.speed += kasoku;
		System.out.println(this.speed + "km/hに加速しました");
	}

	public int run(int hour) {
		int souKouKyori = this.speed * hour;
		this.fuel -= hour;
		//System.out.println(souKouKyori + "km/h走行した");
		return souKouKyori;
	}

	public void stop() {
		this.speed = 0;
		System.out.println("止まりました");
	}

	public void showMeter() {
		System.out.println("現在の燃料" + this.fuel);
		System.out.println("現在の速度" + this.speed);
	}

}
