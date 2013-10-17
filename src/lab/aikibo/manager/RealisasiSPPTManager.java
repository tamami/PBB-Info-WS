package lab.aikibo.manager;

import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import lab.aikibo.entity.PembayaranSPPT;
import lab.aikibo.entity.RealisasiSPPT;
import lab.aikibo.entity.RealisasiSPPTTahunan;
import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NumberParsing;

public class RealisasiSPPTManager {
	
	public static long getRealisasiSPPT() {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		//session.beginTransaction();
		Iterator iterator = session.createQuery("from RealisasiSPPT").iterate();
		if(iterator.hasNext()) {
			RealisasiSPPT realisasi = (RealisasiSPPT) iterator.next();
			return (long) realisasi.getJumlahPembayaran();
		}
		
		return -1;
	}
	
	public static long getRealisasiSPPTTahunan(int tahun) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select * from realisasi_sppt_tahunan where tahun = :tahun";
		SQLQuery query = session.createSQLQuery(sql);
		query.setParameter("tahun", tahun);
		query.addEntity(RealisasiSPPTTahunan.class);
		
		List list = query.list();
		if(!list.isEmpty()) {
			RealisasiSPPTTahunan realisasi = (RealisasiSPPTTahunan) list.get(0);
			session.close();
			return realisasi.getNilai();
		}
		session.close();
		return 0;
	}
	
	public static String getRealisasiSPPT(Date tanggal) {
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		
		String sql = "select sum(jumlahPembayaran) from RealisasiSPPT " +
				"where tanggalPembayaran >= to_date('01/01/" + (tanggal.getYear() + 1900) + 
				"','DD/MM/YYYY') and tanggalPembayaran <= to_date('" +
				tanggal.getDate() + "/" + (tanggal.getMonth() + 1) + "/" + (tanggal.getYear() + 1900) +
				"','DD/MM/YYYY')";
		Long nilai = ((Long) session.createQuery(sql).iterate().next()).longValue();
		//Iterator iterator = query.iterate();
		//Long nilai = ((Long) iterator.next()).longValue();
		String nilaiStr = NumberParsing.getRupiahString(new BigInteger("" + nilai));
		return nilaiStr;
	}

}
