package code17_11;

public class Person {

	// TODO 自動生成されたメソッド・スタブ
	int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalAccessError("年齢は0以上の数を指定すべきです。指定値=" + age);
		}
		this.age = age;
	}

	public static void main(String[] args) {
	}
}
