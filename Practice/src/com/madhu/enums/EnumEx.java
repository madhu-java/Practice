package com.madhu.enums;
enum Compass{
	EAST,WEST,NORTH,SOUTH;
}
public class EnumEx {
	enum Colors{
		RED,BLUE,GREEN;
	}

	public static void main(String[] args) {
		System.out.println(Colors.BLUE);
		System.out.println(Compass.EAST);
		Compass compass=Compass.WEST;
		System.out.println(compass);
		System.out.println("11111111111111111111111111111");
		Compass[] compasses=Compass.values();
		for(Compass c:compasses) {
			System.out.println(c);
		}
		System.out.println(Compass.valueOf("NORTH"));

	}

}
