package com.madhu.predicate;

import java.lang.reflect.Method;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

Predicate<Integer> p1= i->i>10;
Predicate<Integer> p2 = i->i%2==0;
int[] arr = {5,10,12,22,20,18,14,9,7,3,13};
//methodOne(p1,arr);
//methodTwo(p2,arr);
methodOne(p1.and(p2), arr);
System.out.println("11111111111111111111111111111111111111111");
methodOne(p1.or(p2), arr);
System.out.println("negate:");
methodOne(p1.negate(), arr);


	}
	public static void methodOne(Predicate<Integer> p1, int[] arr) {
		for(int e:arr) {
			//System.out.println(">10:"+e);
			//if e>10 print
			if(p1.test(e))
			{//System.out.println(e+">10");
				System.out.println(e);
			}
		}
	}
	public static void methodTwo(Predicate<Integer>p2,int[] arr){
		for(int i:arr) {
			//System.out.println("%2:"+i);
			if(i%2==0)
			{//System.out.println(i+"%2==0");
				System.out.println(i);
			}
		}
	}

}
