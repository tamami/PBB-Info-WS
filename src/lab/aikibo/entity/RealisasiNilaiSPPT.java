package lab.aikibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="realisasi_sppt")
public class RealisasiNilaiSPPT {
	
	private long nilai;

	@Id
	@Column(name="nilai")
	public long getNilai() {
		return nilai;
	}

	public void setNilai(long nilai) {
		this.nilai = nilai;
	}

}
