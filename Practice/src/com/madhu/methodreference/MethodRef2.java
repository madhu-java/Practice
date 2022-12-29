package com.madhu.methodreference;
interface interfacee{
	void print(int i);
}
public class MethodRef2 {
public void m1(int i) {
	System.out.println("i:"+i*i);
	
}
	public static void main(String[] args) {
		interfacee inter1 = x->System.out.println(x);
		inter1.print(10);
		
		  //inter inter =  new MethodRefEx()::m1;
		interfacee inter2 = new MethodRef2()::m1;
		inter2.print(10);

	}

}
