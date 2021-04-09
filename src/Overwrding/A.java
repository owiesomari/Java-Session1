package Overwrding;

public  class A
{
	int x;
	
	
	
	
	public A(int x) {
		super();
		this.x = x;
	}




	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public void f1(A a )
	{
		System.out.println("Method1");
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
