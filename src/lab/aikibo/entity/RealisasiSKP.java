package lab.aikibo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="realisasi_skp")
public class RealisasiSKP {
	
	private Date tglPembayaran;
	private long jmlPembayaran;
	
	public RealisasiSKP() {}
	
	@Id
	@Column(name="tgl_pembayaran_skp")
	public Date getTglPembayaran() {
		return tglPembayaran;
	}
	
	public void setTglPembayaran(Date tglPembayaran) {
		this.tglPembayaran = tglPembayaran;
	}

	@Column(name="jml_skp_yg_dibayar")
	public long getJmlPembayaran() {
		return jmlPembayaran;
	}

	public void setJmlPembayaran(long jmlPembayaran) {
		this.jmlPembayaran = jmlPembayaran;
	}
	
}
