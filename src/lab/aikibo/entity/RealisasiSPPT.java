package lab.aikibo.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="realisasi_sppt")
public class RealisasiSPPT {
	
	private Date tanggalPembayaran;
	private long jumlahPembayaran;
	
	public RealisasiSPPT() {}
	
	public RealisasiSPPT(long jumlahPembayaran) {
		this.jumlahPembayaran = jumlahPembayaran;
	}
	
	@Id
	@Column(name="tgl_pembayaran_sppt")
	public Date getTanggalPembayaran() {
		return tanggalPembayaran;
	}
	
	public void setTanggalPembayaran(Date tanggal) {
		this.tanggalPembayaran = tanggal;
	}
	
	@Column(name="jumlah_pembayaran")
	public long getJumlahPembayaran() {
		return jumlahPembayaran;
	}
	
	public void setJumlahPembayaran(long nilai) {
		this.jumlahPembayaran = nilai;
	}

}
