package lab.aikibo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sppt")
public class SPPT implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String kdProv;
	private String kdDati2;
	private String kdKec;
	private String kdKel;
	private String kdBlok;
	private String noUrut;
	private String kdJnsOp;
	private String thnPajakSppt;
	private int siklusSppt;
	private String kdKanwilBank;
	private String kdKppbbBank;
	private String kdBankTunggal;
	private String kdBankPersepsi;
	private String kdTp;
	private String namaWpSppt;
	private String jlnWpSppt;
	private String blokKavNoWpSppt;
	private String rwWpSppt;
	private String rtWpSppt;
	private String kelurahanWpSppt;
	private String kotaWpSppt;
	private String kdPosWpSppt;
	private String npwpSppt;
	private String noPersilSppt;
	private String kdKlsTanah;
	private String thnAwalKlsTanah;
	private String kdKlsBng;
	private String thnAwalKlsBng;
	private Date tglJatuhTempoSppt;
	private long luasBumiSppt;
	private long luasBngSppt;
	private long njopBumiSppt;
	private long njopBngSppt;
	private long njopSppt;
	private long njoptkpSppt;
	private long njkpSppt;
	private long pbbTerhutangSppt;
	private long faktorPengurangSppt;
	private long pbbYgHarusDibayarSppt;
	private char statusPembayaranSppt;
	private char statusTagihanSppt;
	private char statusCetakSppt;
	private Date tglTerbitSppt;
	private Date tglCetakSppt;
	private String nipPencetakSppt;
	
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
	@Column(name="kd_blok")
	public String getKdBlok() {
		return kdBlok;
	}

	public void setKdBlok(String kdBlok) {
		this.kdBlok = kdBlok;
	}

	@Id
	@Column(name="no_urut")
	public String getNoUrut() {
		return noUrut;
	}

	public void setNoUrut(String noUrut) {
		this.noUrut = noUrut;
	}

	@Id
	@Column(name="kd_jns_op")
	public String getKdJnsOp() {
		return kdJnsOp;
	}

	public void setKdJnsOp(String kdJnsOp) {
		this.kdJnsOp = kdJnsOp;
	}

	@Id
	@Column(name="thn_pajak_sppt")
	public String getThnPajakSppt() {
		return thnPajakSppt;
	}

	public void setThnPajakSppt(String thnPajakSppt) {
		this.thnPajakSppt = thnPajakSppt;
	}

	@Column(name="siklusk_sppt")
	public int getSiklusSppt() {
		return siklusSppt;
	}

	public void setSiklusSppt(int siklusSppt) {
		this.siklusSppt = siklusSppt;
	}

	@Column(name="kd_kanwil_bank")
	public String getKdKanwilBank() {
		return kdKanwilBank;
	}

	public void setKdKanwilBank(String kdKanwilBank) {
		this.kdKanwilBank = kdKanwilBank;
	}

	@Column(name="kd_kppbb_bank")
	public String getKdKppbbBank() {
		return kdKppbbBank;
	}

	public void setKdKppbbBank(String kdKppbbBank) {
		this.kdKppbbBank = kdKppbbBank;
	}

	@Column(name="kd_bank_tunggal")
	public String getKdBankTunggal() {
		return kdBankTunggal;
	}

	public void setKdBankTunggal(String kdBankTunggal) {
		this.kdBankTunggal = kdBankTunggal;
	}

	@Column(name="kd_bank_persepsi")
	public String getKdBankPersepsi() {
		return kdBankPersepsi;
	}

	public void setKdBankPersepsi(String kdBankPersepsi) {
		this.kdBankPersepsi = kdBankPersepsi;
	}

	@Column(name="kd_tp")
	public String getKdTp() {
		return kdTp;
	}

	public void setKdTp(String kdTp) {
		this.kdTp = kdTp;
	}

	@Column(name="nm_wp_sppt")
	public String getNamaWpSppt() {
		return namaWpSppt;
	}

	public void setNamaWpSppt(String namaWpSppt) {
		this.namaWpSppt = namaWpSppt;
	}

	@Column(name="jln_wp_sppt")
	public String getJlnWpSppt() {
		return jlnWpSppt;
	}

	public void setJlnWpSppt(String jlnWpSppt) {
		this.jlnWpSppt = jlnWpSppt;
	}

	@Column(name="blok_kav_no_wp_sppt")
	public String getBlokKavNoWpSppt() {
		return blokKavNoWpSppt;
	}

	public void setBlokKavNoWpSppt(String blokKavNoWpSppt) {
		this.blokKavNoWpSppt = blokKavNoWpSppt;
	}

	@Column(name="rw_wp_sppt")
	public String getRwWpSppt() {
		return rwWpSppt;
	}

	public void setRwWpSppt(String rwWpSppt) {
		this.rwWpSppt = rwWpSppt;
	}

	@Column(name="rt_wp_sppt")
	public String getRtWpSppt() {
		return rtWpSppt;
	}

	public void setRtWpSppt(String rtWpSppt) {
		this.rtWpSppt = rtWpSppt;
	}

	@Column(name="kelurahan_wp_sppt")
	public String getKelurahanWpSppt() {
		return kelurahanWpSppt;
	}

	public void setKelurahanWpSppt(String kelurahanWpSppt) {
		this.kelurahanWpSppt = kelurahanWpSppt;
	}

	@Column(name="kota_wp_sppt")
	public String getKotaWpSppt() {
		return kotaWpSppt;
	}

	public void setKotaWpSppt(String kotaWpSppt) {
		this.kotaWpSppt = kotaWpSppt;
	}

	@Column(name="kd_pos_wp_sppt")
	public String getKdPosWpSppt() {
		return kdPosWpSppt;
	}

	public void setKdPosWpSppt(String kdPosWpSppt) {
		this.kdPosWpSppt = kdPosWpSppt;
	}

	@Column(name="npwp_sppt")
	public String getNpwpSppt() {
		return npwpSppt;
	}

	public void setNpwpSppt(String npwpSppt) {
		this.npwpSppt = npwpSppt;
	}

	@Column(name="no_persil_sppt")
	public String getNoPersilSppt() {
		return noPersilSppt;
	}

	public void setNoPersilSppt(String noPersilSppt) {
		this.noPersilSppt = noPersilSppt;
	}

	@Column(name="kd_kls_tanah")
	public String getKdKlsTanah() {
		return kdKlsTanah;
	}

	public void setKdKlsTanah(String kdKlsTanah) {
		this.kdKlsTanah = kdKlsTanah;
	}

	@Column(name="thn_awal_kls_tanah")
	public String getThnAwalKlsTanah() {
		return thnAwalKlsTanah;
	}

	public void setThnAwalKlsTanah(String thnAwalKlsTanah) {
		this.thnAwalKlsTanah = thnAwalKlsTanah;
	}

	@Column(name="kd_kls_bng")
	public String getKdKlsBng() {
		return kdKlsBng;
	}

	public void setKdKlsBng(String kdKlsBng) {
		this.kdKlsBng = kdKlsBng;
	}

	@Column(name="thn_awal_kls_bng")
	public String getThnAwalKlsBng() {
		return thnAwalKlsBng;
	}

	public void setThnAwalKlsBng(String thnAwalKlsBng) {
		this.thnAwalKlsBng = thnAwalKlsBng;
	}

	@Column(name="tgl_jatuh_tempo_sppt")
	public Date getTglJatuhTempoSppt() {
		return tglJatuhTempoSppt;
	}

	public void setTglJatuhTempoSppt(Date tglJatuhTempoSppt) {
		this.tglJatuhTempoSppt = tglJatuhTempoSppt;
	}

	@Column(name="luas_bumi_sppt")
	public long getLuasBumiSppt() {
		return luasBumiSppt;
	}

	public void setLuasBumiSppt(long luasBumiSppt) {
		this.luasBumiSppt = luasBumiSppt;
	}

	@Column(name="luas_bng_sppt")
	public long getLuasBngSppt() {
		return luasBngSppt;
	}

	public void setLuasBngSppt(long luasBngSppt) {
		this.luasBngSppt = luasBngSppt;
	}

	@Column(name="njop_bumi_sppt")
	public long getNjopBumiSppt() {
		return njopBumiSppt;
	}

	public void setNjopBumiSppt(long njopBumiSppt) {
		this.njopBumiSppt = njopBumiSppt;
	}

	@Column(name="njop_bng_sppt")
	public long getNjopBngSppt() {
		return njopBngSppt;
	}

	public void setNjopBngSppt(long njopBngSppt) {
		this.njopBngSppt = njopBngSppt;
	}

	@Column(name="njop_sppt")
	public long getNjopSppt() {
		return njopSppt;
	}

	public void setNjopSppt(long njopSppt) {
		this.njopSppt = njopSppt;
	}

	@Column(name="njoptkp_sppt")
	public long getNjoptkpSppt() {
		return njoptkpSppt;
	}

	public void setNjoptkpSppt(long njoptkpSppt) {
		this.njoptkpSppt = njoptkpSppt;
	}

	@Column(name="njkp_sppt")
	public long getNjkpSppt() {
		return njkpSppt;
	}

	public void setNjkpSppt(long njkpSppt) {
		this.njkpSppt = njkpSppt;
	}

	@Column(name="pbb_terhutang_sppt")
	public long getPbbTerhutangSppt() {
		return pbbTerhutangSppt;
	}

	public void setPbbTerhutangSppt(long pbbTerhutangSppt) {
		this.pbbTerhutangSppt = pbbTerhutangSppt;
	}

	@Column(name="faktor_pengurang_sppt")
	public long getFaktorPengurangSppt() {
		return faktorPengurangSppt;
	}

	public void setFaktorPengurangSppt(long faktorPengurangSppt) {
		this.faktorPengurangSppt = faktorPengurangSppt;
	}

	@Column(name="pbb_yg_harus_dibayar_sppt")
	public long getPbbYgHarusDibayarSppt() {
		return pbbYgHarusDibayarSppt;
	}

	public void setPbbYgHarusDibayarSppt(long pbbYgHarusDibayarSppt) {
		this.pbbYgHarusDibayarSppt = pbbYgHarusDibayarSppt;
	}

	@Column(name="status_pembayaran_sppt")
	public char getStatusPembayaranSppt() {
		return statusPembayaranSppt;
	}

	public void setStatusPembayaranSppt(char statusPembayaranSppt) {
		this.statusPembayaranSppt = statusPembayaranSppt;
	}

	@Column(name="status_tagihan_sppt")
	public char getStatusTagihanSppt() {
		return statusTagihanSppt;
	}

	public void setStatusTagihanSppt(char statusTagihanSppt) {
		this.statusTagihanSppt = statusTagihanSppt;
	}

	@Column(name="status_cetak_sppt")
	public char getStatusCetakSppt() {
		return statusCetakSppt;
	}

	public void setStatusCetakSppt(char statusCetakSppt) {
		this.statusCetakSppt = statusCetakSppt;
	}

	@Column(name="tgl_terbit_sppt")
	public Date getTglTerbitSppt() {
		return tglTerbitSppt;
	}

	public void setTglTerbitSppt(Date tglTerbitSppt) {
		this.tglTerbitSppt = tglTerbitSppt;
	}

	@Column(name="tgl_cetak_sppt")
	public Date getTglCetakSppt() {
		return tglCetakSppt;
	}

	public void setTglCetakSppt(Date tglCetakSppt) {
		this.tglCetakSppt = tglCetakSppt;
	}

	@Column(name="nip_pencetak_sppt")
	public String getNipPencetakSppt() {
		return nipPencetakSppt;
	}

	public void setNipPencetakSppt(String nipPencetakSppt) {
		this.nipPencetakSppt = nipPencetakSppt;
	}

}
