package lab.aikibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pegawai")
public class Pegawai {
	
	private String nip;
	private String namaPegawai;
	private String nipBaru;
	
	public Pegawai(String nip, String nama, String nipBaru) {
		this.nip = nip;
		this.namaPegawai = nama;
		this.nipBaru = nipBaru;
	}
	
	public Pegawai() {}
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	@Id
	@Column(name="nip", unique=true)
	public String getNip() {
		return nip;
	}
	
	public void setNama(String nama) {
		this.namaPegawai = nama;
	}
	
	@Column(name="nm_pegawai", unique=true)
	public String getNama() {
		return namaPegawai;
	}
	
	public void setNipBaru(String nipBaru) {
		this.nipBaru = nipBaru;
	}
	
	@Column(name="nip_baru")
	public String getNipBaru() {
		return nipBaru;
	}

}
