package lab.aikibo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pembayaran_skp_spop")
public class PembayaranSKPSPOP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1436485159683484652L;
	
	private String kdProv;
	private String kdDati2;
	private String kdKec;
	private String kdKel;
	private String kdBlok;
	private String noUrut;
	private String kdJnsOp;
	private String thnPajakSkpSpop;
	private int pembayaranSkpSpopKe;
	private String kdKanwilBank;
	private String kdKppbbBank;
	private String kdBankTunggal;
	private String kdBankPersepsi;
	private String kdTp;
	private long dendaSkpSpop;
	private long jmlSkpSpopYgDibayar;
	private Date tglPembayaranSkpSpop;
	private Date tglRekamByrSkpSpop;
	private String nipPerekamByrSkpSpop;
	
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
	@Column(name="thn_pajak_skp_spop", nullable=false)
	public String getThnPajakSkpSpop() {
		return thnPajakSkpSpop;
	}

	public void setThnPajakSkpSpop(String thnPajakSkpSpop) {
		this.thnPajakSkpSpop = thnPajakSkpSpop;
	}

	@Id
	@Column(name="pembayaran_skp_spop_ke", nullable=false)
	public int getPembayaranSkpSpopKe() {
		return pembayaranSkpSpopKe;
	}

	public void setPembayaranSkpSpopKe(int pembayaranSkpSpopKe) {
		this.pembayaranSkpSpopKe = pembayaranSkpSpopKe;
	}

	@Column(name="kd_kanwil_bank", nullable=false)
	public String getKdKanwilBank() {
		return kdKanwilBank;
	}

	public void setKdKanwilBank(String kdKanwilBank) {
		this.kdKanwilBank = kdKanwilBank;
	}

	@Column(name="kd_kppbb_bank", nullable=false)
	public String getKdKppbbBank() {
		return kdKppbbBank;
	}

	public void setKdKppbbBank(String kdKppbbBank) {
		this.kdKppbbBank = kdKppbbBank;
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

	@Column(name="denda_skp_spop", nullable=false)
	public long getDendaSkpSpop() {
		return dendaSkpSpop;
	}

	public void setDendaSkpSpop(long dendaSkpSpop) {
		this.dendaSkpSpop = dendaSkpSpop;
	}

	@Column(name="jml_skp_spop_yg_dibayar", nullable=false)
	public long getJmlSkpSpopYgDibayar() {
		return jmlSkpSpopYgDibayar;
	}

	public void setJmlSkpSpopYgDibayar(long jmlSkpSpopYgDibayar) {
		this.jmlSkpSpopYgDibayar = jmlSkpSpopYgDibayar;
	}

	@Column(name="tgl_pembayaran_skp_spop", nullable=false)
	public Date getTglPembayaranSkpSpop() {
		return tglPembayaranSkpSpop;
	}

	public void setTglPembayaranSkpSpop(Date tglPembayaranSkpSpop) {
		this.tglPembayaranSkpSpop = tglPembayaranSkpSpop;
	}

	@Column(name="tgl_rekam_byr_skp_spop", nullable=false)
	public Date getTglRekamByrSkpSpop() {
		return tglRekamByrSkpSpop;
	}

	public void setTglRekamByrSkpSpop(Date tglRekamByrSkpSpop) {
		this.tglRekamByrSkpSpop = tglRekamByrSkpSpop;
	}

	@Column(name="nip_perekam_byr_skp_spop", nullable=false)
	public String getNipPerekamByrSkpSpop() {
		return nipPerekamByrSkpSpop;
	}

	public void setNipPerekamByrSkpSpop(String nipPerekamByrSkpSpop) {
		this.nipPerekamByrSkpSpop = nipPerekamByrSkpSpop;
	}
	
	
}
