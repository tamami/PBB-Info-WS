package lab.aikibo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pembayaran_skp")
public class PembayaranSKP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7372645852037067705L;
	
	private String kdProv;
	private String kdDati2;
	private String kdKec;
	private String kdKel;
	private String kdBlok;
	private String noUrut;
	private String kdJnsOp;
	private String thnPajakSkp;
	private Date tglTerbitSkp;
	private int pembayaranSkpKe;
	private String kdKanwilBank;
	private String kdKppbbBank;
	private String kdBankTunggal;
	private String kdBankPersepsi;
	private String kdTp;
	private Date tglPembayaranSkp;
	private String ntpn;
	private long dendaSkp;
	private long jmlSkpYgDibayar;
	private String uraianBayarSkp;
	private String nmPenyetor;
	private Date tglRekamByrSkp;
	private String nipPerekamByrSkp;
	
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
	@Column(name="thn_pajak_skp", nullable=false)
	public String getThnPajakSkp() {
		return thnPajakSkp;
	}

	public void setThnPajakSkp(String thnPajakSkp) {
		this.thnPajakSkp = thnPajakSkp;
	}

	@Id
	@Column(name="tgl_terbit_skp", nullable=false)
	public Date getTglTerbitSkp() {
		return tglTerbitSkp;
	}

	public void setTglTerbitSkp(Date tglTerbitSkp) {
		this.tglTerbitSkp = tglTerbitSkp;
	}

	@Id
	@Column(name="pembayaran_skp_ke", nullable=false)
	public int getPembayaranSkpKe() {
		return pembayaranSkpKe;
	}

	public void setPembayaranSkpKe(int pembayaranSkpKe) {
		this.pembayaranSkpKe = pembayaranSkpKe;
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

	@Column(name="tgl_pembayaran_skp", nullable=false)
	public Date getTglPembayaranSkp() {
		return tglPembayaranSkp;
	}

	public void setTglPembayaranSkp(Date tglPembayaranSkp) {
		this.tglPembayaranSkp = tglPembayaranSkp;
	}

	@Column(name="ntpn")
	public String getNtpn() {
		return ntpn;
	}

	public void setNtpn(String ntpn) {
		this.ntpn = ntpn;
	}

	@Column(name="denda_skp", nullable=false)
	public long getDendaSkp() {
		return dendaSkp;
	}

	public void setDendaSkp(long dendaSkp) {
		this.dendaSkp = dendaSkp;
	}

	@Column(name="jml_skp_yg_dibayar", nullable=false)
	public long getJmlSkpYgDibayar() {
		return jmlSkpYgDibayar;
	}

	public void setJmlSkpYgDibayar(long jmlSkpYgDibayar) {
		this.jmlSkpYgDibayar = jmlSkpYgDibayar;
	}

	@Column(name="uraian_bayar_skp")
	public String getUraianBayarSkp() {
		return uraianBayarSkp;
	}

	public void setUraianBayarSkp(String uraianBayarSkp) {
		this.uraianBayarSkp = uraianBayarSkp;
	}

	@Column(name="nm_penyetor")
	public String getNmPenyetor() {
		return nmPenyetor;
	}

	public void setNmPenyetor(String nmPenyetor) {
		this.nmPenyetor = nmPenyetor;
	}

	@Column(name="tgl_rekam_byr_skp", nullable=false)
	public Date getTglRekamByrSkp() {
		return tglRekamByrSkp;
	}

	public void setTglRekamByrSkp(Date tglRekamByrSkp) {
		this.tglRekamByrSkp = tglRekamByrSkp;
	}

	@Column(name="nip_perekam_byr_skp", nullable=false)
	public String getNipPerekamByrSkp() {
		return nipPerekamByrSkp;
	}

	public void setNipPerekamByrSkp(String nipPerekamByrSkp) {
		this.nipPerekamByrSkp = nipPerekamByrSkp;
	}
	

}
