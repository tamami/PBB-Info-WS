package lab.aikibo.service;

import java.math.BigInteger;
import java.util.Date;

import lab.aikibo.manager.RealisasiSPPTManager;
import lab.aikibo.manager.SPPTManager;
import lab.aikibo.util.NumberParsing;

public class PBBService {
	
	public long getRealisasiSPPT() {
		return RealisasiSPPTManager.getRealisasiSPPT();
	}
	
	public String getRealisasiSPPTTahunan(int tahun) {
		return NumberParsing.getRupiahString(new BigInteger("" + RealisasiSPPTManager.getRealisasiSPPTTahunan(2005)));
	}
	
	public String getRealisasiSPPTByNow() {
		return RealisasiSPPTManager.getRealisasiSPPT(new Date());
	}
	
	public String getRealisasiSPPTByDate(int tanggal, int bulan, int tahun) {
		return RealisasiSPPTManager.getRealisasiSPPT(new Date((tahun - 1900), (bulan - 1), tanggal));
	}
	
	public String getKetetapanSPPTByNow() {
		return SPPTManager.getJumlahSppt(new Date().getYear() + 1900);
	}
	
	public String getKetetapanSPPTByTahun(int year) {
		return SPPTManager.getJumlahSppt(year);
	}
	
	public String getNilaiSPPTByNow() {
		return SPPTManager.getNilaiSppt(new Date().getYear() + 1900);
	}
	
	public String getNilaiSPPTByTahun(int year) {
		return SPPTManager.getNilaiSppt(year);
	}
	
	public String getProsentaseRealisasiSPPTByNow() {
		return SPPTManager.prosentaseRealisasiSpptToString(new Date().getYear() + 1900);
	}
	
	public String getProsentaseRealisasiSPPTByTahun(int year) {
		return SPPTManager.prosentaseRealisasiSpptToString(year);
	}
	
	public String getRealisasiSKPByNow() {
		return null;
	}
	
	public String getRealisasiSKPByDate(int tanggal, int bulan, int tahun) {
		return null;
	}

}
