package code15_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args)throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d = f.parse("1300年03月04日 15:48:45");
		System.out.println(d);
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s +"です");
	}

}
