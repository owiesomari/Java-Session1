package Overwrding;

public  class A
{
	public void print() {
		System.out.println("Class A");
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
		super.print();
		System.out.println("Class C");
		
	}
}
