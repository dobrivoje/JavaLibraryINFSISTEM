/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ent.infsistem;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "RPRO001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rpro001.findAll", query = "SELECT r FROM Rpro001 r"),
    @NamedQuery(name = "Rpro001.findByNalog", query = "SELECT r FROM Rpro001 r WHERE r.nalog = :nalog"),
    @NamedQuery(name = "Rpro001.findByDatnal", query = "SELECT r FROM Rpro001 r WHERE r.datnal = :datnal"),
    @NamedQuery(name = "Rpro001.findByRBrs", query = "SELECT r FROM Rpro001 r WHERE r.rBrs = :rBrs"),
    @NamedQuery(name = "Rpro001.findByMBrs", query = "SELECT r FROM Rpro001 r WHERE r.mBrs = :mBrs"),
    @NamedQuery(name = "Rpro001.findByProd", query = "SELECT r FROM Rpro001 r WHERE r.prod = :prod"),
    @NamedQuery(name = "Rpro001.findByProd2", query = "SELECT r FROM Rpro001 r WHERE r.prod2 = :prod2"),
    @NamedQuery(name = "Rpro001.findByBilok", query = "SELECT r FROM Rpro001 r WHERE r.bilok = :bilok"),
    @NamedQuery(name = "Rpro001.findByOrg", query = "SELECT r FROM Rpro001 r WHERE r.org = :org"),
    @NamedQuery(name = "Rpro001.findByMag", query = "SELECT r FROM Rpro001 r WHERE r.mag = :mag"),
    @NamedQuery(name = "Rpro001.findByPosl", query = "SELECT r FROM Rpro001 r WHERE r.posl = :posl"),
    @NamedQuery(name = "Rpro001.findByDokument", query = "SELECT r FROM Rpro001 r WHERE r.dokument = :dokument"),
    @NamedQuery(name = "Rpro001.findByVrdok", query = "SELECT r FROM Rpro001 r WHERE r.vrdok = :vrdok"),
    @NamedQuery(name = "Rpro001.findByDatdok", query = "SELECT r FROM Rpro001 r WHERE r.datdok = :datdok"),
    @NamedQuery(name = "Rpro001.findByTimdok", query = "SELECT r FROM Rpro001 r WHERE r.timdok = :timdok"),
    @NamedQuery(name = "Rpro001.findByVal", query = "SELECT r FROM Rpro001 r WHERE r.val = :val"),
    @NamedQuery(name = "Rpro001.findByDatdpo", query = "SELECT r FROM Rpro001 r WHERE r.datdpo = :datdpo"),
    @NamedQuery(name = "Rpro001.findByMaguliz", query = "SELECT r FROM Rpro001 r WHERE r.maguliz = :maguliz"),
    @NamedQuery(name = "Rpro001.findByDatmag", query = "SELECT r FROM Rpro001 r WHERE r.datmag = :datmag"),
    @NamedQuery(name = "Rpro001.findByKupdob", query = "SELECT r FROM Rpro001 r WHERE r.kupdob = :kupdob"),
    @NamedQuery(name = "Rpro001.findByKatbr", query = "SELECT r FROM Rpro001 r WHERE r.katbr = :katbr"),
    @NamedQuery(name = "Rpro001.findByOpis", query = "SELECT r FROM Rpro001 r WHERE r.opis = :opis"),
    @NamedQuery(name = "Rpro001.findByKol", query = "SELECT r FROM Rpro001 r WHERE r.kol = :kol"),
    @NamedQuery(name = "Rpro001.findByCena", query = "SELECT r FROM Rpro001 r WHERE r.cena = :cena"),
    @NamedQuery(name = "Rpro001.findByIznos", query = "SELECT r FROM Rpro001 r WHERE r.iznos = :iznos"),
    @NamedQuery(name = "Rpro001.findByStorno", query = "SELECT r FROM Rpro001 r WHERE r.storno = :storno"),
    @NamedQuery(name = "Rpro001.findByTip", query = "SELECT r FROM Rpro001 r WHERE r.tip = :tip"),
    @NamedQuery(name = "Rpro001.findByDatPren", query = "SELECT r FROM Rpro001 r WHERE r.datPren = :datPren"),
    @NamedQuery(name = "Rpro001.findByTimPren", query = "SELECT r FROM Rpro001 r WHERE r.timPren = :timPren"),
    @NamedQuery(name = "Rpro001.findBySifpor", query = "SELECT r FROM Rpro001 r WHERE r.sifpor = :sifpor"),
    @NamedQuery(name = "Rpro001.findByPorez", query = "SELECT r FROM Rpro001 r WHERE r.porez = :porez"),
    @NamedQuery(name = "Rpro001.findByPlporez", query = "SELECT r FROM Rpro001 r WHERE r.plporez = :plporez"),
    @NamedQuery(name = "Rpro001.findByMarza", query = "SELECT r FROM Rpro001 r WHERE r.marza = :marza"),
    @NamedQuery(name = "Rpro001.findByPcSp", query = "SELECT r FROM Rpro001 r WHERE r.pcSp = :pcSp"),
    @NamedQuery(name = "Rpro001.findByPcBp", query = "SELECT r FROM Rpro001 r WHERE r.pcBp = :pcBp"),
    @NamedQuery(name = "Rpro001.findByNdCena", query = "SELECT r FROM Rpro001 r WHERE r.ndCena = :ndCena"),
    @NamedQuery(name = "Rpro001.findByPdCena", query = "SELECT r FROM Rpro001 r WHERE r.pdCena = :pdCena"),
    @NamedQuery(name = "Rpro001.findByPv", query = "SELECT r FROM Rpro001 r WHERE r.pv = :pv"),
    @NamedQuery(name = "Rpro001.findByRabat", query = "SELECT r FROM Rpro001 r WHERE r.rabat = :rabat"),
    @NamedQuery(name = "Rpro001.findById", query = "SELECT r FROM Rpro001 r WHERE r.id = :id"),
    @NamedQuery(name = "Rpro001.findByLoza", query = "SELECT r FROM Rpro001 r WHERE r.loza = :loza"),
    @NamedQuery(name = "Rpro001.findByMarker", query = "SELECT r FROM Rpro001 r WHERE r.marker = :marker"),
    @NamedQuery(name = "Rpro001.findByVMarza", query = "SELECT r FROM Rpro001 r WHERE r.vMarza = :vMarza"),
    @NamedQuery(name = "Rpro001.findByVRabat", query = "SELECT r FROM Rpro001 r WHERE r.vRabat = :vRabat"),
    @NamedQuery(name = "Rpro001.findByVZavt", query = "SELECT r FROM Rpro001 r WHERE r.vZavt = :vZavt"),
    @NamedQuery(name = "Rpro001.findByRuc", query = "SELECT r FROM Rpro001 r WHERE r.ruc = :ruc"),
    @NamedQuery(name = "Rpro001.findByBrUg", query = "SELECT r FROM Rpro001 r WHERE r.brUg = :brUg"),
    @NamedQuery(name = "Rpro001.findByUBrs", query = "SELECT r FROM Rpro001 r WHERE r.uBrs = :uBrs"),
    @NamedQuery(name = "Rpro001.findByBrProm", query = "SELECT r FROM Rpro001 r WHERE r.brProm = :brProm"),
    @NamedQuery(name = "Rpro001.findByDatProm", query = "SELECT r FROM Rpro001 r WHERE r.datProm = :datProm"),
    @NamedQuery(name = "Rpro001.findByTaxa", query = "SELECT r FROM Rpro001 r WHERE r.taxa = :taxa"),
    @NamedQuery(name = "Rpro001.findBySavPor", query = "SELECT r FROM Rpro001 r WHERE r.savPor = :savPor"),
    @NamedQuery(name = "Rpro001.findByIdSloga", query = "SELECT r FROM Rpro001 r WHERE r.idSloga = :idSloga"),
    @NamedQuery(name = "Rpro001.findByTransfer", query = "SELECT r FROM Rpro001 r WHERE r.transfer = :transfer"),
    @NamedQuery(name = "Rpro001.findByFist", query = "SELECT r FROM Rpro001 r WHERE r.fist = :fist")})
public class Rpro001 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "NALOG")
    private String nalog;
    @Column(name = "DATNAL")
    private String datnal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "R_BRS")
    private Double rBrs;
    @Column(name = "M_BRS")
    private Double mBrs;
    @Column(name = "PROD")
    private String prod;
    @Column(name = "PROD2")
    private String prod2;
    @Column(name = "BILOK")
    private String bilok;
    @Column(name = "ORG")
    private String org;
    @Column(name = "MAG")
    private String mag;
    @Column(name = "POSL")
    private String posl;
    @Column(name = "DOKUMENT")
    private String dokument;
    @Column(name = "VRDOK")
    private String vrdok;
    @Column(name = "DATDOK")
    private String datdok;
    @Column(name = "TIMDOK")
    private String timdok;
    @Column(name = "VAL")
    private Double val;
    @Column(name = "DATDPO")
    private String datdpo;
    @Column(name = "MAGULIZ")
    private String maguliz;
    @Column(name = "DATMAG")
    private String datmag;
    @Column(name = "KUPDOB")
    private String kupdob;
    @Column(name = "KATBR")
    private String katbr;
    @Column(name = "OPIS")
    private String opis;
    @Column(name = "KOL")
    private Double kol;
    @Column(name = "CENA")
    private Double cena;
    @Column(name = "IZNOS")
    private Double iznos;
    @Column(name = "STORNO")
    private String storno;
    @Column(name = "TIP")
    private String tip;
    @Column(name = "DAT_PREN")
    private String datPren;
    @Column(name = "TIM_PREN")
    private String timPren;
    @Column(name = "SIFPOR")
    private String sifpor;
    @Column(name = "POREZ")
    private Double porez;
    @Column(name = "PLPOREZ")
    private Double plporez;
    @Column(name = "MARZA")
    private Double marza;
    @Column(name = "PC_SP")
    private Double pcSp;
    @Column(name = "PC_BP")
    private Double pcBp;
    @Column(name = "ND_CENA")
    private Double ndCena;
    @Column(name = "PD_CENA")
    private Double pdCena;
    @Column(name = "PV")
    private Double pv;
    @Column(name = "RABAT")
    private Double rabat;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "LOZA")
    private String loza;
    @Column(name = "MARKER")
    private Double marker;
    @Column(name = "V_MARZA")
    private Double vMarza;
    @Column(name = "V_RABAT")
    private Double vRabat;
    @Column(name = "V_ZAVT")
    private Double vZavt;
    @Column(name = "RUC")
    private Double ruc;
    @Column(name = "BR_UG")
    private String brUg;
    @Column(name = "U_BRS")
    private Double uBrs;
    @Column(name = "BR_PROM")
    private Double brProm;
    @Column(name = "DAT_PROM")
    private String datProm;
    @Column(name = "TAXA")
    private Double taxa;
    @Column(name = "SAV_POR")
    private Double savPor;
    @Column(name = "ID_SLOGA")
    private String idSloga;
    @Column(name = "TRANSFER")
    private String transfer;
    @Column(name = "FIST")
    private String fist;

    public Rpro001() {
    }

    public Rpro001(Long id) {
        this.id = id;
    }

    public String getNalog() {
        return nalog;
    }

    public void setNalog(String nalog) {
        this.nalog = nalog;
    }

    public String getDatnal() {
        return datnal;
    }

    public void setDatnal(String datnal) {
        this.datnal = datnal;
    }

    public Double getRBrs() {
        return rBrs;
    }

    public void setRBrs(Double rBrs) {
        this.rBrs = rBrs;
    }

    public Double getMBrs() {
        return mBrs;
    }

    public void setMBrs(Double mBrs) {
        this.mBrs = mBrs;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getProd2() {
        return prod2;
    }

    public void setProd2(String prod2) {
        this.prod2 = prod2;
    }

    public String getBilok() {
        return bilok;
    }

    public void setBilok(String bilok) {
        this.bilok = bilok;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getPosl() {
        return posl;
    }

    public void setPosl(String posl) {
        this.posl = posl;
    }

    public String getDokument() {
        return dokument;
    }

    public void setDokument(String dokument) {
        this.dokument = dokument;
    }

    public String getVrdok() {
        return vrdok;
    }

    public void setVrdok(String vrdok) {
        this.vrdok = vrdok;
    }

    public String getDatdok() {
        return datdok;
    }

    public void setDatdok(String datdok) {
        this.datdok = datdok;
    }

    public String getTimdok() {
        return timdok;
    }

    public void setTimdok(String timdok) {
        this.timdok = timdok;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }

    public String getDatdpo() {
        return datdpo;
    }

    public void setDatdpo(String datdpo) {
        this.datdpo = datdpo;
    }

    public String getMaguliz() {
        return maguliz;
    }

    public void setMaguliz(String maguliz) {
        this.maguliz = maguliz;
    }

    public String getDatmag() {
        return datmag;
    }

    public void setDatmag(String datmag) {
        this.datmag = datmag;
    }

    public String getKupdob() {
        return kupdob;
    }

    public void setKupdob(String kupdob) {
        this.kupdob = kupdob;
    }

    public String getKatbr() {
        return katbr;
    }

    public void setKatbr(String katbr) {
        this.katbr = katbr;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Double getKol() {
        return kol;
    }

    public void setKol(Double kol) {
        this.kol = kol;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Double getIznos() {
        return iznos;
    }

    public void setIznos(Double iznos) {
        this.iznos = iznos;
    }

    public String getStorno() {
        return storno;
    }

    public void setStorno(String storno) {
        this.storno = storno;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDatPren() {
        return datPren;
    }

    public void setDatPren(String datPren) {
        this.datPren = datPren;
    }

    public String getTimPren() {
        return timPren;
    }

    public void setTimPren(String timPren) {
        this.timPren = timPren;
    }

    public String getSifpor() {
        return sifpor;
    }

    public void setSifpor(String sifpor) {
        this.sifpor = sifpor;
    }

    public Double getPorez() {
        return porez;
    }

    public void setPorez(Double porez) {
        this.porez = porez;
    }

    public Double getPlporez() {
        return plporez;
    }

    public void setPlporez(Double plporez) {
        this.plporez = plporez;
    }

    public Double getMarza() {
        return marza;
    }

    public void setMarza(Double marza) {
        this.marza = marza;
    }

    public Double getPcSp() {
        return pcSp;
    }

    public void setPcSp(Double pcSp) {
        this.pcSp = pcSp;
    }

    public Double getPcBp() {
        return pcBp;
    }

    public void setPcBp(Double pcBp) {
        this.pcBp = pcBp;
    }

    public Double getNdCena() {
        return ndCena;
    }

    public void setNdCena(Double ndCena) {
        this.ndCena = ndCena;
    }

    public Double getPdCena() {
        return pdCena;
    }

    public void setPdCena(Double pdCena) {
        this.pdCena = pdCena;
    }

    public Double getPv() {
        return pv;
    }

    public void setPv(Double pv) {
        this.pv = pv;
    }

    public Double getRabat() {
        return rabat;
    }

    public void setRabat(Double rabat) {
        this.rabat = rabat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoza() {
        return loza;
    }

    public void setLoza(String loza) {
        this.loza = loza;
    }

    public Double getMarker() {
        return marker;
    }

    public void setMarker(Double marker) {
        this.marker = marker;
    }

    public Double getVMarza() {
        return vMarza;
    }

    public void setVMarza(Double vMarza) {
        this.vMarza = vMarza;
    }

    public Double getVRabat() {
        return vRabat;
    }

    public void setVRabat(Double vRabat) {
        this.vRabat = vRabat;
    }

    public Double getVZavt() {
        return vZavt;
    }

    public void setVZavt(Double vZavt) {
        this.vZavt = vZavt;
    }

    public Double getRuc() {
        return ruc;
    }

    public void setRuc(Double ruc) {
        this.ruc = ruc;
    }

    public String getBrUg() {
        return brUg;
    }

    public void setBrUg(String brUg) {
        this.brUg = brUg;
    }

    public Double getUBrs() {
        return uBrs;
    }

    public void setUBrs(Double uBrs) {
        this.uBrs = uBrs;
    }

    public Double getBrProm() {
        return brProm;
    }

    public void setBrProm(Double brProm) {
        this.brProm = brProm;
    }

    public String getDatProm() {
        return datProm;
    }

    public void setDatProm(String datProm) {
        this.datProm = datProm;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getSavPor() {
        return savPor;
    }

    public void setSavPor(Double savPor) {
        this.savPor = savPor;
    }

    public String getIdSloga() {
        return idSloga;
    }

    public void setIdSloga(String idSloga) {
        this.idSloga = idSloga;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getFist() {
        return fist;
    }

    public void setFist(String fist) {
        this.fist = fist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rpro001)) {
            return false;
        }
        Rpro001 other = (Rpro001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.Rpro001[ id=" + id + " ]";
    }
    
}
