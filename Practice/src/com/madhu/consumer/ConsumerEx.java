package com.madhu.consumer;

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
	}

}
