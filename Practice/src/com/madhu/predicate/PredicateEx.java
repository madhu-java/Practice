package com.madhu.predicate;

import java.util.function.Predicate;

class Test implements Predicate<Integer>{
	@Override
	public boolean test(Integer i) {
		if(i>10)
			return true;
		else return false;
	}
}
public class PredicateEx {

	public static void main(String[] args) {
		Test t= new Test();
		System.out.println(t.test(12));
		System.out.println(t.test(2));
		Predicate<Integer> predicate =i->i%2==0;
		System.out.println("100 is even:"+predicate.test(100));
      String string= "Hello";
      Predicate<String> predicate2 = str->str.length()>3;
      System.out.println(string+" length is > 3:"+predicate2.test(string));
	}

}
