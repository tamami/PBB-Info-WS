package lab.aikibo.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import lab.aikibo.entity.Pegawai;

public class LihatDataPegawai {
	
	public static void main(String args[]) {
		@SuppressWarnings("deprecation")
		AnnotationConfiguration anoConfig = new AnnotationConfiguration();
		anoConfig.addAnnotatedClass(Pegawai.class);
		SessionFactory sf = anoConfig.configure().buildSessionFactory();
		Session session = sf.openSession();
		
		List message = session.createQuery("from Pegawai").list();
		System.out.println("Found " + message.size() + " employee");
		session.close();
	}

}
