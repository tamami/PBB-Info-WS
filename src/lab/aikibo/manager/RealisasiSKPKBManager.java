package lab.aikibo.manager;

import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NumberParsing;

public class RealisasiSKPKBManager {
	
	public static String getRealisasiSKPKB(Date tanggal) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select sum(jmlSkpKbYgDibayar) from PembayaranSKPKB where " +
				"tglPembayaranSkpKb between to_date('01/01/" + (tanggal.getYear() + 1900) +
				"','DD/MM/YYYY') and to_date('" + tanggal.getDate() + "/" + 
				(tanggal.getMonth() + 1) + "/" + (tanggal.getYear() + 1900) + "')";
		try {
			Query query = session.createQuery(sql);
			Iterator iterator = query.iterate();
			if(!iterator.hasNext()) {
				session.close();
				return null;
			}
			Long nilai = (Long) iterator.next();
			String nilaiStr = NumberParsing.getRupiahString(new BigInteger("" + nilai));
			return nilaiStr;
		} catch(Exception e) {
			session.close();
			return null;
		}
	}

}
