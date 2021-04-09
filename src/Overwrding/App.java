package Overwrding;
import Overwrding.A;

public class App {
	public void print(String s) {
		System.out.println(s);
	}
	private void print(String s1,String s2) {
		System.out.println(s1+","+s2);
	}

	public static void main(String[] args) {
		new App().print("Session");
		new App().print("Session","1");

	}

}
