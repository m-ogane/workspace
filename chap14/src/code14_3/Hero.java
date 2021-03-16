package code14_3;

public class Hero {
	int hp;
	String name;

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hero [hp=" + hp + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)&& this.hp == h.hp) {
				return true;
			}
		}
		return false;
	}

}