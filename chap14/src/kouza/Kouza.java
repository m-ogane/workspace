package kouza;

public class Kouza {
	String accountNumber;
	int balance;

	public String toString() {

		return "\\" + this.balance + "口座番号" + this.accountNumber;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Kouza) {
			Kouza k = (Kouza) o;

			if (this.accountNumber.equals(k.accountNumber)) {
				return true;
			}

		}
		return false;
	}
}
