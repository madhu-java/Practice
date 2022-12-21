package com.madhu.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.TYPE_PARAMETER})
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.RUNTIME)
@interface Robot{
	boolean talk();
	int walkSpeed();
}
@Robot(talk = false, walkSpeed = 3)
class IRobot{
	private int roboID;
	private int price;
	public int getRoboID() {
		return roboID;
	}
	public void setRoboID(int roboID) {
		this.roboID = roboID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
public class AnnotationEx {

	public static void main(String[] args) {
		IRobot iRobot= new IRobot();
		iRobot.setRoboID(100);
		iRobot.setPrice(1000);
		System.out.println(iRobot.getRoboID());
		System.out.println(iRobot.getPrice());
		Class class1 = iRobot.getClass();
		Annotation annotations=class1.getAnnotation(Robot.class);
		Robot robot = (Robot)annotations;
		System.out.println("can this robot walk:"+robot.talk());
		int walkspeed = robot.walkSpeed();
		System.out.println("walking spped of the robot:"+walkspeed);

	}

}
