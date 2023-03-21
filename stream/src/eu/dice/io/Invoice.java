package eu.dice.io;

import java.io.*;
import java.util.List;

public class Invoice {
	private double[] prices;
	private int[] units;
	private List<String> descriptions;
	private double total;
	
	public Invoice(double[] pricesArray, int[] unitsArray, List<String> productsDescriptions) {
		prices = pricesArray;
		units = unitsArray;
		descriptions = productsDescriptions;
	}
	
	public void saveInvoice(String fileName) {
		DataOutputStream out = null;
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			out = new DataOutputStream(bos);

			for (var i = 0; i < prices.length; i++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descriptions.get(i)); // pt String-uri, Universal Text Format
			}

			out.close();

		} catch (IOException ioe) {
			
		}
	}
	
	public void readandCalcInvoice(String fileName) {
		DataInputStream in = null;
		try {
			this.total = 0.0;
			FileInputStream fos = new FileInputStream(fileName);
			BufferedInputStream bos = new BufferedInputStream(fos);

			in = new DataInputStream(bos);

			for (var i = 0; i < prices.length; i++) {
				in.readDouble();
				in.readInt();
				in.readUTF(); // pt String-uri, Universal Text Format
				this.total += (prices[i]*units[i]);
			}

			in.close();

		} catch (IOException ioe) {
			
		}
	}

	public double getTotal() {
		return total;
	}
}
