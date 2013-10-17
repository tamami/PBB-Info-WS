package lab.aikibo.manager;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;

import org.hibernate.Query;
import org.hibernate.Session;

import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NumberParsing;

public class SPPTManager {
	
	public static String getJumlahSppt(int tahun) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select count(*) from SPPT where tglTerbitSppt between " +
				"to_date('01/01/" + tahun + "','DD/MM/YYYY') and to_date('31/12/" +
				tahun + "','DD/MM/YYYY')";
		try {
			Query query = session.createQuery(sql);
			Iterator iterator = query.iterate();
			if(!iterator.hasNext()) {
				session.close();
				return null;
			}
			Long nilai = (Long) iterator.next();
			String nilaiStr = NumberParsing.getNilaiString(new BigInteger("" + nilai));
			session.close();
			return nilaiStr;
		} catch(Exception e) {
			session.close();
			return null;
		}
	}
	
	public static String getNilaiSppt(int tahun) {
		Long nilai = getNilaiSpptToLong(tahun);
		String nilaiStr = NumberParsing.getRupiahString(new BigInteger("" + nilai));
		return nilaiStr;
	}
	
	public static Long getNilaiSpptToLong(int tahun) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select sum(pbbYgHarusDibayarSppt) from SPPT where " +
				"tglTerbitSppt between to_date('01/01/" + tahun + "','DD/MM/YYYY') " +
				"and to_date('31/12/" + tahun + "','DD/MM/YYYY')";
		try {
			Query query = session.createQuery(sql);
			Iterator iterator = query.iterate();
			if(!iterator.hasNext()) {
				session.close();
				return null;
			}
			Long nilai = (Long) iterator.next();
			return nilai;
		} catch(Exception e) {
			session.close();
			return null;
		}
	}
	
	public static Long getRealisasiSpptToLong(int tahun) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select sum(jmlSpptYgDibayar) from PembayaranSPPT where " +
				"tglPembayaranSppt between to_date('01/01/" + tahun + "','DD/MM/YYYY') and " +
				"to_date('31/12/" + tahun + "','DD/MM/YYYY')";
		try {
			Query query = session.createQuery(sql);
			Iterator iterator = query.iterate();
			if(!iterator.hasNext()) {
				session.close();
				return null;
			}
			Long nilai = (Long) iterator.next();
			session.close();
			return nilai;
		} catch(Exception e) {
			session.close();
			return null;
		}
	}
	
	public static Double prosentaseRealisasiSppt(int tahun) {
		Long realisasi = getRealisasiSpptToLong(tahun);
		Long ketetapan = getNilaiSpptToLong(tahun);
		return (Double) (realisasi.doubleValue() / ketetapan.doubleValue() * 100);
	}
	
	public static String prosentaseRealisasiSpptToString(int tahun) {
		//TODO implementasi ubah nilai Double jadi String
		Double nilai = prosentaseRealisasiSppt(tahun);
		System.out.println(nilai);
		NumberFormat nf = NumberFormat.getInstance(Locale.UK);
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		return nf.format(nilai);
	}

}
