package lab.aikibo.test;

import java.util.Iterator;
import java.util.List;

import lab.aikibo.entity.RealisasiSPPT;
import lab.aikibo.entity.RealisasiSPPTTahunan;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.impl.SQLQueryImpl;

public class TestRealisasiTahunan {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(RealisasiSPPTTahunan.class);
		
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		String sql = "select tahun, nilai from realisasi_sppt_tahunan where tahun = :tahun";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(RealisasiSPPTTahunan.class);
		query.setParameter("tahun", 1995);
		List pembayaran = query.list();
		System.out.println("Found " + pembayaran.size() + " pembayaran");
		
		Iterator iPembayaran = pembayaran.iterator();
		while(iPembayaran.hasNext()) {
		  RealisasiSPPTTahunan realisasi = (RealisasiSPPTTahunan) iPembayaran.next();
		  System.out.println("Realisasinya : " + new Long((long) realisasi.getNilai()));
		}
		session.close();
	}
	
}
