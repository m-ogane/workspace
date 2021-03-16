package code16_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
	//	System.out.println(points);
	//	System.out.println(points.get(1));
		for(int i :points) {
			System.out.println(i);
			Iterator<Integer> it = points.iterator();
			while(it.hasNext()) {
				Integer e = it.next();
				System.out.println(e);
		}


		}
		Integer i1 = Integer.valueOf(16);
		int i2 = i1.intValue();
	//	System.out.println(i2);

	}

}
