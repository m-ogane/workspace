package code02_06;

public class Mani {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//	int i = 3.2;
//char ch = 1;
//int i =ch;

//System.out.println(ch+i);

		char ch = '1';

        // 暗黙的にint型、double型にキャストする。
        int i = ch;
        double d = ch;
        System.out.println(ch + "をint型にキャストした結果: " + i);
        System.out.println(ch + "をdouble型にキャストした結果: " + d);

        // 引数がdouble型のメソッドに対して、char型を引数として渡す。

	}

}
