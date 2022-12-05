package com.madhu.wrapperclasses;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimlPrecision {

	public static void main(String[] args) {
		double d = 3.123456789;
//method 1
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(2);
		System.out.println("setting DecimlPrecision using nf:" + numberFormat.format(d));
//method2
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		double d1 = 2.3545364374;
		System.out.println("using decimal precision:" + decimalFormat.format(d1));
		// method 3
		double d2 = 4.45565767;
		System.out.printf("using printf Printing decimal with 4 decimals: %.4f", d);
		System.out.println();
		// method 4:
		double d3 = 5.354657676;
		System.out.println("using string format:" + String.format("%.3f", d3));
	}

}
