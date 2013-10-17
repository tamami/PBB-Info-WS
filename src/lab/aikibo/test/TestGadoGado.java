package lab.aikibo.test;

import java.text.NumberFormat;
import java.util.Locale;

public class TestGadoGado {
	
	public static void main(String args[]) {
		Double nilai = new Double(0.123987345987349857);
		NumberFormat nf = NumberFormat.getPercentInstance(Locale.UK);
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(nilai));
		
		Long nilaiLong = new Long(1423094);
		nf = NumberFormat.getNumberInstance(Locale.UK);
		System.out.println(nf.format(nilaiLong));
	}

}
