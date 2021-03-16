package rennsyuumonndai;

public class Main5_4 {

	public static void main(String[] args) {
		double a = calcTriangleArea(10.0, 5.0);
		double b = calcCircleArea(5.0);
		System.out.println("三角形の底辺の長さが" + "10.0cm、" + "高さが5.0C㎠の場合、" + "面積は" + a + "平方cmです。");
		System.out.println("円の半径が5.0cmの場合、面積は" + b + "㎠");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double s = (bottom * height) / 2;
		return s;
	}

	public static double calcCircleArea(double radius) {
		double s = (radius * radius * Math.PI);
		return s;

	}

}
