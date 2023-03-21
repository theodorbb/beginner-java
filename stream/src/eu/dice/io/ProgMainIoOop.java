package eu.dice.io;

import java.util.ArrayList;
import java.util.List;

public class ProgMainIoOop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] prices = new double[] { 16.78, 9.76, 11.23 };
		int[] units = new int[] { 11, 9, 6 };

		List<String> descs = new ArrayList<String>(); // descs=descriptions
		descs.add("Pen");
		descs.add("Mug");
		descs.add("T-Shirt");
		
		Invoice f = new Invoice(prices, units, descs);
		f.saveInvoice("invoice2.txt");
		f.readandCalcInvoice("invoice2.txt");
		
		System.out.printf("Total = %f \n", f.getTotal());
	}

}
