package com.madhu.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Authenticator.RequestorType;

//creating a multivalued annotation
@Target(ElementType.TYPE)//target type of annotation
@Retention(RetentionPolicy.RUNTIME)//till what point we want to retaing the annotation

@interface CricketPlayer{
	int runs() default 20000;//anotherway of assigning values
	String country()default "IND";
}

//@CricketPlayer(country = "IND", runs = 20000)
@CricketPlayer
class ViratKohli{
	private int innings;
	private String name;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Annotations {

	public static void main(String[] args) {
		ViratKohli vKohli= new ViratKohli();
		vKohli.setInnings(100);
		System.out.println(vKohli.getInnings());
		vKohli.setName("VK");
		System.out.println(vKohli.getName());
		Class class1 = vKohli.getClass();
		Annotation annotation = class1.getAnnotation(CricketPlayer.class);
		CricketPlayer cPlayer = (CricketPlayer)annotation;
		int runs =cPlayer.runs();
		System.out.println(runs);
		String countryString =cPlayer.country();
		System.out.println(countryString);
		

	}

}
