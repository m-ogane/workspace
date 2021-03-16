package rensyuu2;

public abstract class Characer {
	String name;
	int hp;
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	public void attck() {
	}
}
