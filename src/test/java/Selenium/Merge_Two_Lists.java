package Selenium;

import java.util.ArrayList;

public class Merge_Two_Lists {
	public static void main(String[] args)
    {
ArrayList<String> al1 = new ArrayList<String>();
        al1.add("naveen");
        al1.add("naresh");
        al1.add("mahesh");
ArrayList<String> al2 = new ArrayList<String>();
        al2.add("baby");
        al2.add("darling");
        al2.add("senorita");
ArrayList<String> merge = new ArrayList<String>();
        merge.addAll(al1);
        merge.addAll(al2);
System.out.println("list1 : "+al1);
System.out.println("list2 : "+al2);
System.out.println("Merged : "+merge);
}
}
