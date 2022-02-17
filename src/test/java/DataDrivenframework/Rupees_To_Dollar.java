package DataDrivenframework;

import java.util.Scanner;

public class Rupees_To_Dollar {
	public static void main(String[] args) {
		double rupees;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the rupees:");
		rupees=sc.nextLong();
		double dollar=rupees/74.26;
		System.out.println(dollar+"  "+"dollar");
	}
}
