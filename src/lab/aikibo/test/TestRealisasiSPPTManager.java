package lab.aikibo.test;

import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import lab.aikibo.entity.RealisasiNilaiSPPT;
import lab.aikibo.entity.RealisasiSPPT;
import lab.aikibo.manager.RealisasiSPPTManager;
import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NumberParsing;

public class TestRealisasiSPPTManager {
	
	public static void main(String args[]) {
		RealisasiSPPTManager rsm = new RealisasiSPPTManager();
		System.out.println("Realisasinya : " + rsm.getRealisasiSPPT());
		
		System.out.println();
		System.out.println("Realisasi Thn 2005 : " + 
				NumberParsing.getRupiahString(new BigInteger("" + rsm.getRealisasiSPPTTahunan(2005))));
		
		// BERHASIL
		System.out.println();
		System.out.println("Test stored procedure dengan SQLQuery");
		ConnectorUtil cu = new ConnectorUtil();
		Session session = cu.getSessionFactory().openSession();
		Date tanggal = new Date();
		String sql = "select tgl_pembayaran_sppt, jumlah_pembayaran from realisasi_sppt " +
				"where tgl_pembayaran_sppt >= to_date('01/01/" + (tanggal.getYear() + 1900) + 
				"','DD/MM/YYYY') and tgl_pembayaran_sppt <= to_date('" +
				tanggal.getDate() + "/" + tanggal.getMonth() + "/" + (tanggal.getYear() + 1900) +
				"','DD/MM/YYYY')";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(RealisasiSPPT.class);
		List list = query.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			RealisasiSPPT real = (RealisasiSPPT) iterator.next();
			System.out.println("nilainya sampe " + tanggal.getDate() + " adalah " + real.getJumlahPembayaran());
		}
		
		// INI JUGA BERHASIL
		Long nilai = ((Long) session.createQuery("select sum(jumlahPembayaran) from " +
				"RealisasiSPPT where tanggalPembayaran >= to_date('01/01/1993','DD/MM/YYYY') " +
				"and tanggalPembayaran <= to_date('30/12/1993','DD/MM/YYYY')").iterate().next()).longValue();
		System.out.println("cetak nilainya : " + nilai);
		
		System.out.println();
		System.out.println("ini nilai dari RealisasiSPPTManager : ");
		System.out.println(RealisasiSPPTManager.getRealisasiSPPT(new Date(1993 - 1900, 11, 30)));
	}

}
