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
	static class Board{
		int boardNumber = 13;
		public void print() {
			System.out.println("in Board class");
		}
	}
}
 abstract class Driver{
	abstract void installDriver();
}
public class NonStaticInnerClass {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.display();
		Computer.Chip chip =  computer.new Chip();
		chip.config();
		System.out.println(chip.chipNumber);
		System.out.println(computer.number);
		//inner static class
		Computer.Board  board =  new Computer.Board();
		board.print();
		//annonymous class
		Driver driver  = new Driver() {
			
			@Override
			void installDriver() {
				System.out.println("installing driver");
				
			}
		};
		driver.installDriver();

	}

}
