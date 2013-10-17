package lab.aikibo.util;

import java.math.BigInteger;

public class NumberParsing {
	
	public static String getRupiahString(BigInteger nilai) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Rp. ");
		
		if(nilai.compareTo(new BigInteger("1000000000")) == 1) {
			return (buffer.toString() + getMilyaran(nilai) + ",-");
		} else if(nilai.compareTo(new BigInteger("1000000")) == 1) {
			return (buffer.toString() + getJutaan(nilai.longValue()) + ",-");
		} else if(nilai.compareTo(new BigInteger("1000")) == 1) {
			return (buffer.toString() + getRibuan(nilai.longValue()) + ",-");
		}
		return null;
	}
	
	public static String getNilaiString(BigInteger nilai) {
		StringBuffer buffer = new StringBuffer();
		if(nilai.compareTo(new BigInteger("1000000000")) == 1) {
			return getMilyaran(nilai);
		} else if(nilai.compareTo(new BigInteger("1000000")) == 1) {
			return getJutaan(nilai.longValue());
		} else if(nilai.compareTo(new BigInteger("1000")) == 1) {
			return getRibuan(nilai.longValue());
		}
		return null;
	}
	
	public static String getRibuan(long nilai) {
		StringBuffer buffer = new StringBuffer();
		long temp;
		
		buffer.append(nilai / 1000);
		temp = nilai % 1000;
		buffer.append(".");
		
		if(temp == 0)
			buffer.append("000");
		else {
			if(temp >= 100) 
				buffer.append(temp);
			else if(temp < 100 && temp >= 10)
				buffer.append("0" + temp);
			else
				buffer.append("00" + temp);
		}
		
		return buffer.toString();
	}
	
	public static String getJutaan(long nilai) {
		StringBuffer buffer = new StringBuffer();
		long temp;
		
		buffer.append(nilai / 1000000);
		temp = nilai % 1000000;
		buffer.append(".");
		
		if((temp / 1000) == 0) 
			buffer.append("000");
		else {
			if((temp / 1000) >= 100) 
				buffer.append(temp / 1000);
			else if(((temp / 1000) < 100) && (temp / 1000) >= 10)
				buffer.append("0" + (temp / 1000));
			else
				buffer.append("00" + (temp / 1000));
		}
		temp = temp % 1000;
		buffer.append(".");
		if(temp == 0) 
			buffer.append("000");
		else {
			if(temp >= 100) 
				buffer.append(temp);
			else if(temp < 100 && temp >= 10) 
				buffer.append("0" + temp);
			else
				buffer.append("00" + temp);
		}
		
		return buffer.toString();
	}
	
	public static String getMilyaran(BigInteger nilai) {
		StringBuffer buffer = new StringBuffer();
		long temp;
		
		buffer.append(nilai.divide(new BigInteger("1000000000")).toString());
		temp = nilai.divideAndRemainder(new BigInteger("1000000000"))[1].longValue();
		buffer.append(".");
		
		if((temp / 1000000) == 0)
			buffer.append("000");
		else {
			if((temp / 1000000) >= 100)
				buffer.append(temp / 1000000);
			else if(((temp / 1000000) < 100) && ((temp / 1000000) >= 10))
				buffer.append("0" + (temp / 1000000));
			else 
				buffer.append("00" + (temp / 1000000));
		}
		temp = temp % 1000000;
		buffer.append(".");
		
		if((temp / 1000) == 0)
			buffer.append("000");
		else {
			if((temp / 1000) >= 100)
				buffer.append(temp / 1000);
			else if(((temp / 1000) < 100) && ((temp / 1000) >= 10))
				buffer.append("0" + (temp / 1000));
			else
				buffer.append("00" + (temp / 1000));
		}
		buffer.append(".");
		
		temp = temp % 1000;
		if(temp == 0) 
			buffer.append("000");
		else {
			if(temp >= 100)
				buffer.append(temp);
			else if((temp < 100) && (temp >= 10))
				buffer.append("0" + temp);
			else
				buffer.append("00" + temp);
		}
		
		return buffer.toString();
	}
	
	public static void main(String args[]) {
		BigInteger nilai = new BigInteger("400020");
		
		System.out.println(getRupiahString(nilai));
	}

}
