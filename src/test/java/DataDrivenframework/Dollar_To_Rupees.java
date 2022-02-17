package DataDrivenframework;

import java.util.Scanner;

public class Dollar_To_Rupees {
public static void main(String[] args) {
	double dollar;
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter the dollar:");
	dollar=sc.nextLong();
	double rupees=dollar*74.26;
	System.out.println(rupees+"  "+"Rupees");
}
}
