package lab.aikibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="realisasi_sppt_tahunan")
public class RealisasiSPPTTahunan {
	
	private int thn;
	private long nilai;
	
	@Id
	@Column(name="tahun")
	public int getThn() {
		return thn;
	}
	
	public void setThn(int thn) {
		this.thn = thn;
	}

	@Column(name="nilai")
	public long getNilai() {
		return nilai;
	}

	public void setNilai(long nilai) {
		this.nilai = nilai;
	}
	
}
