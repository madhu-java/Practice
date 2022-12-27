package com.madhu.function;

import java.util.function.Function;
class MyFunction implements Function<String, Integer>{
	public Integer apply(String string) {
		return string.length();
	}
}
public class Test {

	public static void main(String[] args) {
		Function<String,Integer> myFunction = new MyFunction();
		System.out.println(myFunction.apply("Madhu"));
		////using lambda
		Function<String, Integer> f1= str->str.length();
		System.out.println(f1.apply("MADhuu"));;

	}

}
