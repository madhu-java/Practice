package com.madhu.inheitance;
class Parent1{
	public void speak() {
		System.out.println("parent is pseaking chinese");
	}
	public void cook() {
		System.out.println("parent can cook");
	}
}
class Child1 extends Parent1{
	public void speak() {
		System.out.println("child1 is pseaking indonesian");
	}
	public void swim() {
		System.out.println("child1 can swim");
	}
	
}
class Child2 extends Parent1{
	public void speak() {
		System.out.println("child2 is pseaking german");
	}
	public void skate() {
		System.out.println("child2 can skate");
	}
	
}
public class ExPoly {

	public static void main(String[] args) {
		//tight coupling
//		Parent1 parent1 = new Parent1();
//		Child1 child1 = new Child1();
//		Child2 child2 = new Child2();
//		parent1.speak();
//		child1.speak();
//		child2.speak();
		Parent1 p;
		p = new Child1();
		p.speak();
		p.cook();
		((Child1) p).swim();//downcasting the parent to execute specialized methods
		p = new Child2();
		p.speak();
		p.cook();
		((Child2)p).skate();
		Child1 child1 = new Child1();
		child1.cook();
		child1.speak();
		

	}

}
//class HelloWorld {
//
//    static int a = 10;
//
//    static {
//        a = 10;
//        a = sheela();
//    }
//
//    public static int sheela() {
//        System.out.println("Sheela begin");
//        System.out.println("variable: " + a);
//        System.out.println("variable: " + b);
//        System.out.println("sheela end");
//        return 60;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("main begin");
//        sheela();
//        System.out.println("variable: " + a);
//        System.out.println("variable: " + b);
//        leela();
//        System.out.println("main end");
//
//    }
//
//    public static int leela() {
//        System.out.println("leela begin");
//        System.out.println("variable: " + a);
//        System.out.println("variable: " + b);
//        System.out.println("leela end");
//        return 90;
//    }
//
//    static int b = 30;
//
//    static {
//        b = 15;
//        b = leela();
//    }
//
//}
