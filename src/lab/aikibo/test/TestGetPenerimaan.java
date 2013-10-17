package lab.aikibo.test;

import java.util.Iterator;
import java.util.List;

import lab.aikibo.entity.PembayaranSPPT;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestGetPenerimaan {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(PembayaranSPPT.class);
		SessionFactory sf = config.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		//List pembayaran = session.createQuery("from PembayaranSPPT").list();
		//System.out.println("Found " + pembayaran.size() + " pembayaran");
		
		Iterator pembayaran = session.createQuery("from PembayaranSPPT").iterate();
		long realisasi = 0;
		while(pembayaran.hasNext()) {
			PembayaranSPPT pembSPPT = (PembayaranSPPT) pembayaran.next();
			realisasi += pembSPPT.getJmlSpptYgDibayar();
		}
		System.out.println("Realisasinya : " + realisasi);
		session.close();
	}

}
