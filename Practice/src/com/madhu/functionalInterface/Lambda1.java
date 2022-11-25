package com.madhu.functionalInterface;
interface Add{
	void add();
}
@FunctionalInterface
interface Subtract{
	int sub(int a, int b );
}
interface Sqr{
	double sqr(int a);
}
interface Print{
	void print();
}
public class Lambda1 {

	public static void main(String[] args) {
		Add add = ()->System.out.println("adding...");
		add.add();
		
		Subtract subtract = (a, b)-> a-b;
		System.out.println(subtract.sub(10, 20));
		
		Sqr sqr= a-> a*a;
		System.out.println(sqr.sqr(2));
		
		Sqr sqr1= a-> {return  a*a;};
		System.out.println(sqr1.sqr(4));
		
		Print print = ()->{
			System.out.println("hello");
			System.out.println("how are you");
			System.out.println("bye");
		};
		print.print();
		
		

	}

}
