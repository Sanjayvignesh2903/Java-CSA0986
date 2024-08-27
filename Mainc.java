import java.io.*;
class A {
    int s = 1000;
	void houserent()
	{
		int hr=200;
		int ns=s+hr;
		System.out.println("Net Salary : " + ns);
		
	}
}
class B extends A {
    int bf = 100;
}
class Mainc {
    public static void main(String args[])
    {
        B b = new B();
        System.out.println("Salary : " + b.s);
		
       System.out.println("Benefits : " + b.bf);
	   b.houserent();
    }
}