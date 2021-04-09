package Polymorphism;

public abstract class A
{
	public abstract void print();
	public void genaricPrint() {
		System.out.println("Generic Print");
	}
	
}

class B extends A{

	@Override
	public void print() {
		System.out.println("Class B");
		
	}
	
}
class C extends A
{
	@Override
	public void print() {
		System.out.println("Class C");
		
	}
}
