package code15_02;

public class Sub {
	String folder = "c:\\javadev";
	String folder2 = "c:\\user\\";
	String file = "readme.txt";

	public String filebun(String folder, String file) {
		if (!folder.endsWith("\\")) {
			folder += "\\"; //なぜ+= +じゃだめ？
		}
//		String fullfile = folder + file;
		return folder + file;
	}
}
