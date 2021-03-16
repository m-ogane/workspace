package code17_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileWriter fw =  null;
		try {
		fw = new FileWriter("data.txt");
			fw.write("hello!");

		} catch (Exception e) {
			System.out.println("何らかの例外が発生しまた。");
		} finally {
			if(fw != null)
			try {
				fw.close();
				System.out.println("成功");

			} catch (IOException e) {
				;
			}

		}

	}
}
