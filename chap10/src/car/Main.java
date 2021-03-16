package car;

public class Main {

	public static void main(String[] args) {

		Keicar k = new Keicar("アルト", 100, 28.5);
		System.out.println(k.getName());
		k.syurui();
		k.run();
		k.stop();
		System.out.println("価格" + k.getPrs() + "万円");
		System.out.println("燃費" + k.getNenpi() + "km");

		KogataTrack kt = new KogataTrack("エルフ", 300, 10);
		System.out.println(kt.getName());
		kt.syurui();
		kt.run();
		kt.stop();
		kt.kinou();
		System.out.println("価格" + kt.getPrs() + "万円");
		System.out.println("燃費" + kt.getNenpi() + "km");


	}
}