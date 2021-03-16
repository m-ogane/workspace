package rensyu13_7;

public class Mainrezi {

	public int gouke() {
		Rezi r1 = new Rezi("ねぎ");
		r1.setNedan(100);
		Rezi r2 = new Rezi("にんじん");
		r2.setNedan(150);
		Rezi r3 = new Rezi("大根");
		r3.setNedan(200);

		int[] a = {r1.getNedan(),r2.getNedan(),r3.getNedan()};

		for (int i = 0; i < 3; i++) {
			int s = a[i];

			return s;
		}
		return 0;

	}
}