package mondai;

public class Main {
	public static void main(String[] args) {
		Doubutu[] array = new Doubutu[3];
		array[0] = new Neko();
		array[1] = new Inu();
		array[2] = new Tori();
		for (Doubutu naku : array) {
			naku.nakigoe();

		}
		Hotel pt = new Hotel();
		pt.service(array);

	}

}
