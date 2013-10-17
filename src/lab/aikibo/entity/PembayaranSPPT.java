package lab.aikibo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pembayaran_sppt")
public class PembayaranSPPT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String kdProv;
	private String kdDati2;
	private String kdKec;
	private String kdKel;
	private String kdBlok;
	private String noUrut;
	private String kdJnsOp;
	private String thnPajakSppt;
	private Integer pembayaranSpptKe;
	private String kdKanwilBank;
	private String kdKpPbbBank;
	private String kdBankTunggal;
	private String kdBankPersepsi;
	private String kdTp;
	private Long dendaSppt;
	private Long jmlSpptYgDibayar;
	private Date tglPembayaranSppt;
	private Date tglRekamBayarSppt;
	private String nipRekamBayarSppt;
	
	public PembayaranSPPT() {}

	@Id
	@Column(name="kd_propinsi", nullable=false)
	public String getKdProv() {
		return kdProv;
	}

	public void setKdProv(String kdProv) {
		this.kdProv = kdProv;
	}

	@Id
	@Column(name="kd_dati2", nullable=false)
	public String getKdDati2() {
		return kdDati2;
	}

	public void setKdDati2(String kdDati2) {
		this.kdDati2 = kdDati2;
	}

	@Id
	@Column(name="kd_kecamatan", nullable=false)
	public String getKdKec() {
		return kdKec;
	}

	public void setKdKec(String kdKec) {
		this.kdKec = kdKec;
	}

	@Id
	@Column(name="kd_kelurahan", nullable=false)
	public String getKdKel() {
		return kdKel;
	}

	public void setKdKel(String kdKel) {
		this.kdKel = kdKel;
	}

	@Id
	@Column(name="kd_blok", nullable=false)
	public String getKdBlok() {
		return kdBlok;
	}

	public void setKdBlok(String kdBlok) {
		this.kdBlok = kdBlok;
	}

	@Id
	@Column(name="no_urut", nullable=false)
	public String getNoUrut() {
		return noUrut;
	}

	public void setNoUrut(String noUrut) {
		this.noUrut = noUrut;
	}

	@Id
	@Column(name="kd_jns_op", nullable=false)
	public String getKdJnsOp() {
		return kdJnsOp;
	}

	public void setKdJnsOp(String kdJnsOp) {
		this.kdJnsOp = kdJnsOp;
	}

	@Id
	@Column(name="thn_pajak_sppt", nullable=false)
	public String getThnPajakSppt() {
		return thnPajakSppt;
	}

	public void setThnPajakSppt(String thnPajakSppt) {
		this.thnPajakSppt = thnPajakSppt;
	}

	@Id
	@Column(name="pembayaran_sppt_ke", nullable=false)
	public int getPembayaranSpptKe() {
		return pembayaranSpptKe;
	}

	public void setPembayaranSpptKe(int pembayaranSpptKe) {
		this.pembayaranSpptKe = pembayaranSpptKe;
	}

	@Column(name="kd_kanwil_bank", nullable=false)
	public String getKdKanwilBank() {
		return kdKanwilBank;
	}

	public void setKdKanwilBank(String kdKanwilBank) {
		this.kdKanwilBank = kdKanwilBank;
	}

	@Column(name="kd_kppbb_bank", nullable=false)
	public String getKdKpPbbBank() {
		return kdKpPbbBank;
	}

	public void setKdKpPbbBank(String kdKpPbbBank) {
		this.kdKpPbbBank = kdKpPbbBank;
	}

	@Column(name="kd_bank_tunggal", nullable=false)
	public String getKdBankTunggal() {
		return kdBankTunggal;
	}

	public void setKdBankTunggal(String kdBankTunggal) {
		this.kdBankTunggal = kdBankTunggal;
	}

	@Column(name="kd_bank_persepsi", nullable=false)
	public String getKdBankPersepsi() {
		return kdBankPersepsi;
	}

	public void setKdBankPersepsi(String kdBankPersepsi) {
		this.kdBankPersepsi = kdBankPersepsi;
	}

	@Column(name="kd_tp", nullable=false)
	public String getKdTp() {
		return kdTp;
	}

	public void setKdTp(String kdTp) {
		this.kdTp = kdTp;
	}

	@Column(name="denda_sppt", nullable=true)
	public Long getDendaSppt() {
		return dendaSppt;
	}

	public void setDendaSppt(Long dendaSppt) {
		this.dendaSppt = dendaSppt;
	}

	@Column(name="jml_sppt_yg_dibayar", nullable=false)
	public long getJmlSpptYgDibayar() {
		return jmlSpptYgDibayar;
	}

	public void setJmlSpptYgDibayar(long jmlSpptYgDibayar) {
		jmlSpptYgDibayar = jmlSpptYgDibayar;
	}

	@Column(name="tgl_pembayaran_sppt", nullable=false)
	public Date getTglPembayaranSppt() {
		return tglPembayaranSppt;
	}

	public void setTglPembayaranSppt(Date tglPembayaranSppt) {
		this.tglPembayaranSppt = tglPembayaranSppt;
	}

	@Column(name="tgl_rekam_byr_sppt", nullable=false)
	public Date getTglRekamBayarSppt() {
		return tglRekamBayarSppt;
	}

	public void setTglRekamBayarSppt(Date tglRekamBayarSppt) {
		this.tglRekamBayarSppt = tglRekamBayarSppt;
	}

	@Column(name="nip_rekam_byr_sppt", nullable=false)
	public String getNipRekamBayarSppt() {
		return nipRekamBayarSppt;
	}

	public void setNipRekamBayarSppt(String nipRekamBayarSppt) {
		this.nipRekamBayarSppt = nipRekamBayarSppt;
	}
	
	

}
