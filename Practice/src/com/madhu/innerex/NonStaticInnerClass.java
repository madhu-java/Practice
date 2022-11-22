package com.madhu.innerex;
class Computer{
	int number=10;
	public void display() {
		System.out.println("in computer class");
	}
	class Chip{
		int chipNumber=0;
		public void config() {
			System.out.println("in Chip class");
		}
	}
}
public class NonStaticInnerClass {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.display();
		Computer.Chip chip =  computer.new Chip();
		chip.config();
		System.out.println(chip.chipNumber);
		System.out.println(computer.number);

	}

}
