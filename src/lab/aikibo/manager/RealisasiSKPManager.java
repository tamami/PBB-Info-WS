package lab.aikibo.manager;

import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NumberParsing;

public class RealisasiSKPManager {
	public static String getRealisasiSKP(Date tanggal) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select sum(jmlSkpYgDibayar) from PembayaranSKP where " + 
				"tglPembayaranSkp between to_date(01/01/'" + 
				(tanggal.getYear() + 1900) + "','DD/MM/YYYY') and to_date('" +
				tanggal.getDate() + "/" + (tanggal.getMonth() + 1) + "/" +
				(tanggal.getYear() + 1900) + "','DD/MM/YYYY')";
		try {
			Query query = session.createQuery(sql);
			Iterator iterator = query.iterate();
			if(!iterator.hasNext()) {
				session.close();
				return null;
			}	
			Long nilai = ((Long) iterator.next()).longValue();
			String nilaiStr = NumberParsing.getRupiahString(new BigInteger("" + nilai));
			session.close();
			return nilaiStr;
		} catch(Exception e) {
			System.err.println(e);
			session.close();
			return null;
		}
	}
}
