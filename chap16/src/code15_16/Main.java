package code15_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate idate = LocalDate.parse("2017/09/22", fmt);

		LocalDate ldatep = idate.plusDays(1000);//??
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);

		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");//どこから1000日後?
		} else {
			System.out.println("正しい");
		}
	}
}