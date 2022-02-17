package Selenium;

import java.util.ArrayList;

public class Merge_Two_Numbers {
public static void main(String[] args) {
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
	al1.add(60);
	ArrayList<Integer> al2= new ArrayList<Integer>();
	al2.add(80);
	al2.add(90);
	al2.add(100);
	al2.add(150);
	al2.add(200);
	ArrayList<Integer> merge = new ArrayList<Integer>();
	merge.addAll(al1);
	merge.addAll(al2);
	System.out.println("arraylist1 :  "+al1);
	System.out.println("arraylist2  : "+al2);
	System.out.println("merged : "+merge);
}
}
