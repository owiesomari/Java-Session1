package Polymorphism;
import Polymorphism.A;

public class App {

	public static void main(String[] args) {
		A []list = {new A(),new B(),new C()};
		for (int i = 0;i<list.length;i++)
		{
			list[i].print();
		}

	}

}
