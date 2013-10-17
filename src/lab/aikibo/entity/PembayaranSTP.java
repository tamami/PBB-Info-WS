package lab.aikibo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pembayaran_stp")
public class PembayaranSTP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2668735369072916619L;

	private String kdProv;
	private String kdDati2;
	private String kdKec;
	private String kdKel;
	private String kdBlok;
	private String noUrut;
	private String kdJnsOp;
	private Date tglTerbitStp;
	private int pembayaranStpKe;
	private String kdKanwilBank;
	private String kdKppbbBank;
	private String kdBankTunggal;
	private String kdBankPersepsi;
	private String kdTp;
	private Date tglPembayaranStp;
	private String ntpn;
	private long dendaStp;
	private long jmlStpYgDibayar;
	private String uraianBayarStp;
	private String nmPenyetor;
	private Date tglRekamByrStp;
	private String nipPerekamByrStp;
	
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
	@Column(name="tgl_terbit_stp", nullable=false)
	public Date getTglTerbitStp() {
		return tglTerbitStp;
	}

	public void setTglTerbitStp(Date tglTerbitStp) {
		this.tglTerbitStp = tglTerbitStp;
	}

	@Id
	@Column(name="pembayaran_stp_ke", nullable=false)
	public int getPembayaranStpKe() {
		return pembayaranStpKe;
	}

	public void setPembayaranStpKe(int pembayaranStpKe) {
		this.pembayaranStpKe = pembayaranStpKe;
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

	@Column(name="tgl_pembayaran_stp", nullable=false)
	public Date getTglPembayaranStp() {
		return tglPembayaranStp;
	}

	public void setTglPembayaranStp(Date tglPembayaranStp) {
		this.tglPembayaranStp = tglPembayaranStp;
	}

	@Column(name="ntpn")
	public String getNtpn() {
		return ntpn;
	}

	public void setNtpn(String ntpn) {
		this.ntpn = ntpn;
	}

	@Column(name="denda_stp")
	public long getDendaStp() {
		return dendaStp;
	}

	public void setDendaStp(long dendaStp) {
		this.dendaStp = dendaStp;
	}

	@Column(name="jml_stp_yg_dibayar", nullable=false)
	public long getJmlStpYgDibayar() {
		return jmlStpYgDibayar;
	}

	public void setJmlStpYgDibayar(long jmlStpYgDibayar) {
		this.jmlStpYgDibayar = jmlStpYgDibayar;
	}

	@Column(name="uraian_bayar_stp")
	public String getUraianBayarStp() {
		return uraianBayarStp;
	}

	public void setUraianBayarStp(String uraianBayarStp) {
		this.uraianBayarStp = uraianBayarStp;
	}

	@Column(name="nm_penyetor")
	public String getNmPenyetor() {
		return nmPenyetor;
	}

	public void setNmPenyetor(String nmPenyetor) {
		this.nmPenyetor = nmPenyetor;
	}

	@Column(name="tgl_rekam_byr_stp", nullable=false)
	public Date getTglRekamByrStp() {
		return tglRekamByrStp;
	}

	public void setTglRekamByrStp(Date tglRekamByrStp) {
		this.tglRekamByrStp = tglRekamByrStp;
	}

	@Column(name="nip_perekam_byr_stp", nullable=false)
	public String getNipPerekamByrStp() {
		return nipPerekamByrStp;
	}

	public void setNipPerekamByrStp(String nipPerekamByrStp) {
		this.nipPerekamByrStp = nipPerekamByrStp;
	}
	
}
