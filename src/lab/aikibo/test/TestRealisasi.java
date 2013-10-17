package lab.aikibo.test;

import java.util.Iterator;
import java.util.List;

import lab.aikibo.entity.RealisasiSPPT;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestRealisasi {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(RealisasiSPPT.class);
		SessionFactory sf = config.configure().buildSessionFactory();
		
		//SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		List pembayaran = session.createQuery("from RealisasiSPPT").list();
		System.out.println("Found " + pembayaran.size() + " pembayaran");
		
		Iterator iPembayaran = pembayaran.iterator();
		while(iPembayaran.hasNext()) {
		  RealisasiSPPT realisasi = (RealisasiSPPT) iPembayaran.next();
		  System.out.println("Realisasinya : " + new Long((long) realisasi.getJumlahPembayaran()));
		}
		session.close();
	}

}
