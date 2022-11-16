package com.madhu.abstractex;
 abstract class Shapes{
	protected double area;
	abstract protected void input();
	abstract protected void compute();
	public void disp(){
		System.out.println("Area is:"+area);
	}
}
 class Square extends Shapes{
	 private int side;
	 //inceasig visibility fro protected to public
	 public void input() {
		 side = 20;
	 }
	 public void compute() {
		 area= side *side;
	 }
	 
 }
 class Rectangle extends Shapes{
	 private int length;
	 private int width;
	 //inceasig visibility fro protected to public
	 public void input() {
		 width = 20;
		 length=30;
	 }
	 public void compute() {
		 area= length *width;
	 }
	 
 }
 class Circle extends Shapes{
	 private int radius;
	 final private double pi = 3.14;
	 //inceasig visibility fro protected to public
	 public void input() {
		 radius = 20;
	 }
	 public void compute() {
		 area= pi * radius *radius;
	 }
	 
 }
 class Measure{
	 public void getArea(Shapes shapes) {
		 shapes.input();
		 shapes.compute();
		 shapes.disp();
	 }
 }
public class ExAbstract {

	public static void main(String[] args) {
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Measure measure = new Measure();
		measure.getArea(square);
		measure.getArea(rectangle);
		measure.getArea(circle);
		}

}
