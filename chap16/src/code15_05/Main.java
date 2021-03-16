package code15_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate i1 = LocalDate.now();
		LocalDate i2 = i1.plusDays(100);
		//long l = i2.toEpochDay();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年mm月dd日");
		System.out.println(i2.format(f));
	}

}
