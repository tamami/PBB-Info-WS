package lab.aikibo.test;

import java.math.BigInteger;
import java.util.Date;

import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NumberParsing;

import org.hibernate.Session;

public class TestPembayaranSPPTEntity {
	
	public static void main(String args[]) {
		Date tanggal = new Date();
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select sum(jmlSpptYgDibayar) from PembayaranSPPT " +
				"where tglPembayaranSppt >= to_date('01/01/" + (tanggal.getYear() + 1900) + 
				"','DD/MM/YYYY') and tglPembayaranSppt <= to_date('" +
				tanggal.getDate() + "/" + (tanggal.getMonth() + 1) + "/" + (tanggal.getYear() + 1900) +
				"','DD/MM/YYYY')";
		Long nilai = ((Long) session.createQuery(sql).iterate().next()).longValue();
		//Iterator iterator = query.iterate();
		//Long nilai = ((Long) iterator.next()).longValue();
		String nilaiStr = NumberParsing.getRupiahString(new BigInteger("" + nilai));
		System.out.println(nilaiStr);
	}

}
