package com.madhu.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEx {

	public static void main(String[] args) {
		ArrayList< Integer> aList = new ArrayList<>();
		aList.add(10);
		aList.add(5);
		aList.add(20);
		aList.add(15);
		aList.add(17);
		aList.add(12);
		System.out.println(aList);
		ArrayList<Integer> evenList= new ArrayList<>();
		for(Integer integer :aList) 
			if(integer%2==0)
				evenList.add(integer);
		
		System.out.println(evenList);
		
		//usng streams
		List<Integer> eList=aList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("usimg streams:"+eList);
		
		//change each object
		List<Integer> mapList=aList.stream().map(i->i*2).collect(Collectors.toList());
		mapList.forEach(System.out::println);
//count
		
		long evenCount=aList.stream().filter(i->i%2==0).count();
		System.out.println("even numbers count:"+evenCount);
	
	//sorted with natural sorting order
		
		List<Integer> sortedList=aList.stream().sorted().collect(Collectors.toList());
	
	System.out.println("sorted list");
	sortedList.forEach(System.out::println);
	
	//ascending sorted order
	List<Integer> ascList=aList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	
	System.out.println("ascending order");
	ascList.forEach(System.out::println);
	//min and max
	    Integer mInteger=aList.stream().min((i1,i2)->i1.compareTo(i2)).get();
	
	System.out.println("min o the list"+mInteger);
	Integer maInteger= aList.stream().max((a,b)->a.compareTo(b)).get();
	System.out.println("max value of the list:"+maInteger);
	System.out.println("printing  array");
	//toArray--to convertthe collection to array
	Object[]objects = aList.stream().toArray();
	for(Object object:objects) {
		System.out.println(object);
	}
	System.out.println("printing integer array");
	//to convert a collection to int array
	Integer[] integers=aList.stream().toArray(Integer[]::new);
	for(Integer integer:integers ) {
		System.out.println(integer);
	}
	//stream.of()
	System.out.println("using stream.of()");
	Stream stream = Stream.of(9,99,999,9999,99999);
	stream.forEach(System.out::println);
	Double[] double1 = {10.0,10.01,10.02,10.03};
	Stream stream2 = Stream.of(double1);
	System.out.println(stream2);
	stream2.forEach(System.out::println);
	
	
	
	
	
	}

}
