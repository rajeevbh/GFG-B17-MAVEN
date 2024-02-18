package mypkg;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public void show()
	{
		System.out.println("GFG Show Function!!");
	}
	public void hello()
	{
		System.out.println("GFG Hello Function!!");
	}
	public void test()
	{
		System.out.println("Hello! Docker conatiner from GitHub Actions");
	}

	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		System.out.println("Sum is :"+calc.sum(20, 10));
		System.out.println("Diff is :"+calc.diff(20, 10));
		System.out.println("Multiplication is :"+calc.mul(20, 10));
		System.out.println("Division is :"+calc.div(20, 10));
		calc.show();
		calc.hello();
		calc.test();
	}
}
