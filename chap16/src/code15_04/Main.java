package code15_04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day +=100;
		c.set(Calendar.DAY_OF_MONTH, day);

		Date future = c.getTime(); //変換方法乗ってる？

		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年mm月dd日");
		System.out.println(f.format(future));


	}

}
