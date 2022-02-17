package DataDrivenframework;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
public static void main(String[] args) {
	int amount=60000;
	Locale locale= new Locale("en", "US");
	NumberFormat numberformat= NumberFormat.getCurrencyInstance(locale);
	System.out.println(numberformat.format(amount));
}
}
