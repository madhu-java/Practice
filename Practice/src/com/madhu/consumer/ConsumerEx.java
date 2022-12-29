package com.madhu.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{
	public void accept(String name) {
		System.out.println("accept method called:"+name);
	}
}
public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = new MyConsumer();
		consumer.accept("Hello");
		Consumer<Integer> consumer1 = i->System.out.println(i*i);
        consumer1.accept(10);
        ArrayList<String> names= new ArrayList<>();
        names.add("Hello");
        names.add("Hello1");
        names.add("Hello2");
        names.add("Hello3");
        //traditional way
        Consumer<String> consumer2 = new MyConsumer();
        names.forEach(consumer2);
        //lambda expression
        names.forEach(name->System.out.println(name));
        //method reference
        names.forEach(System.out::println);
        
        
	}

}
