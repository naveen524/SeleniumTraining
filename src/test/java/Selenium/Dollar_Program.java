package Selenium;

import java.text.DecimalFormat;

public class Dollar_Program {
	public static void main(String[] args) {
		double amount=60000.00;
		String currentFormatter = new DecimalFormat("#").format(amount);
		System.out.println("after removing decimal values actual amount will be:-"+currentFormatter);
	}
}
