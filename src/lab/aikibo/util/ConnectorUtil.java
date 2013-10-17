package lab.aikibo.util;

import lab.aikibo.entity.PembayaranSKP;
import lab.aikibo.entity.PembayaranSKPKB;
import lab.aikibo.entity.PembayaranSKPSPOP;
import lab.aikibo.entity.PembayaranSPPT;
import lab.aikibo.entity.PembayaranSTP;
import lab.aikibo.entity.RealisasiSKP;
import lab.aikibo.entity.RealisasiSPPT;
import lab.aikibo.entity.RealisasiSPPTTahunan;
import lab.aikibo.entity.SPPT;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConnectorUtil {
	
	private AnnotationConfiguration config;
	private SessionFactory sf;
	
	public ConnectorUtil() {
		init();
	}
	
	private void init() {
		config = new AnnotationConfiguration();
		// prepare for Annotated Class
		config.addAnnotatedClass(RealisasiSPPT.class);
		config.addAnnotatedClass(RealisasiSPPTTahunan.class);
		config.addAnnotatedClass(RealisasiSKP.class);
		config.addAnnotatedClass(PembayaranSKP.class);
		config.addAnnotatedClass(PembayaranSKPKB.class);
		config.addAnnotatedClass(PembayaranSKPSPOP.class);
		config.addAnnotatedClass(PembayaranSTP.class);
		config.addAnnotatedClass(PembayaranSPPT.class);
		config.addAnnotatedClass(SPPT.class);
		sf = config.configure().buildSessionFactory();
	}
	
	public SessionFactory getSessionFactory() {
		return sf;
	}

}
