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
@Table(name = "NALP001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nalp001.findAll", query = "SELECT n FROM Nalp001 n"),
    @NamedQuery(name = "Nalp001.findByFnalog", query = "SELECT n FROM Nalp001 n WHERE n.fnalog = :fnalog"),
    @NamedQuery(name = "Nalp001.findByProfcen", query = "SELECT n FROM Nalp001 n WHERE n.profcen = :profcen"),
    @NamedQuery(name = "Nalp001.findByNalog", query = "SELECT n FROM Nalp001 n WHERE n.nalog = :nalog"),
    @NamedQuery(name = "Nalp001.findByVrdok", query = "SELECT n FROM Nalp001 n WHERE n.vrdok = :vrdok"),
    @NamedQuery(name = "Nalp001.findByStorno", query = "SELECT n FROM Nalp001 n WHERE n.storno = :storno"),
    @NamedQuery(name = "Nalp001.findByBrFak", query = "SELECT n FROM Nalp001 n WHERE n.brFak = :brFak"),
    @NamedQuery(name = "Nalp001.findByDatFak", query = "SELECT n FROM Nalp001 n WHERE n.datFak = :datFak"),
    @NamedQuery(name = "Nalp001.findByOrg", query = "SELECT n FROM Nalp001 n WHERE n.org = :org"),
    @NamedQuery(name = "Nalp001.findByIzdat", query = "SELECT n FROM Nalp001 n WHERE n.izdat = :izdat"),
    @NamedQuery(name = "Nalp001.findByMBrs", query = "SELECT n FROM Nalp001 n WHERE n.mBrs = :mBrs"),
    @NamedQuery(name = "Nalp001.findById", query = "SELECT n FROM Nalp001 n WHERE n.id = :id"),
    @NamedQuery(name = "Nalp001.findByMag", query = "SELECT n FROM Nalp001 n WHERE n.mag = :mag"),
    @NamedQuery(name = "Nalp001.findByPosl", query = "SELECT n FROM Nalp001 n WHERE n.posl = :posl"),
    @NamedQuery(name = "Nalp001.findByKatbr", query = "SELECT n FROM Nalp001 n WHERE n.katbr = :katbr"),
    @NamedQuery(name = "Nalp001.findBySifrapor", query = "SELECT n FROM Nalp001 n WHERE n.sifrapor = :sifrapor"),
    @NamedQuery(name = "Nalp001.findByOsnova", query = "SELECT n FROM Nalp001 n WHERE n.osnova = :osnova"),
    @NamedQuery(name = "Nalp001.findByRabMat", query = "SELECT n FROM Nalp001 n WHERE n.rabMat = :rabMat"),
    @NamedQuery(name = "Nalp001.findByPorez", query = "SELECT n FROM Nalp001 n WHERE n.porez = :porez"),
    @NamedQuery(name = "Nalp001.findByOsnova1", query = "SELECT n FROM Nalp001 n WHERE n.osnova1 = :osnova1"),
    @NamedQuery(name = "Nalp001.findByPorez1", query = "SELECT n FROM Nalp001 n WHERE n.porez1 = :porez1"),
    @NamedQuery(name = "Nalp001.findByPotOz", query = "SELECT n FROM Nalp001 n WHERE n.potOz = :potOz"),
    @NamedQuery(name = "Nalp001.findByPotVj", query = "SELECT n FROM Nalp001 n WHERE n.potVj = :potVj"),
    @NamedQuery(name = "Nalp001.findByTipPor", query = "SELECT n FROM Nalp001 n WHERE n.tipPor = :tipPor"),
    @NamedQuery(name = "Nalp001.findByTaxa", query = "SELECT n FROM Nalp001 n WHERE n.taxa = :taxa"),
    @NamedQuery(name = "Nalp001.findBySavPor", query = "SELECT n FROM Nalp001 n WHERE n.savPor = :savPor"),
    @NamedQuery(name = "Nalp001.findByBrojac", query = "SELECT n FROM Nalp001 n WHERE n.brojac = :brojac")})
public class Nalp001 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "FNALOG")
    private String fnalog;
    @Column(name = "PROFCEN")
    private String profcen;
    @Column(name = "NALOG")
    private String nalog;
    @Column(name = "VRDOK")
    private String vrdok;
    @Column(name = "STORNO")
    private String storno;
    @Column(name = "BR_FAK")
    private String brFak;
    @Column(name = "DAT_FAK")
    private String datFak;
    @Column(name = "ORG")
    private String org;
    @Column(name = "IZDAT")
    private String izdat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "M_BRS")
    private Double mBrs;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MAG")
    private String mag;
    @Column(name = "POSL")
    private String posl;
    @Column(name = "KATBR")
    private String katbr;
    @Column(name = "SIFRAPOR")
    private String sifrapor;
    @Column(name = "OSNOVA")
    private Double osnova;
    @Column(name = "RAB_MAT")
    private Double rabMat;
    @Column(name = "POREZ")
    private Double porez;
    @Column(name = "OSNOVA1")
    private Double osnova1;
    @Column(name = "POREZ1")
    private Double porez1;
    @Column(name = "POT_OZ")
    private String potOz;
    @Column(name = "POT_VJ")
    private String potVj;
    @Column(name = "TIP_POR")
    private Double tipPor;
    @Column(name = "TAXA")
    private Double taxa;
    @Column(name = "SAV_POR")
    private Double savPor;
    @Column(name = "BROJAC")
    private Double brojac;

    public Nalp001() {
    }

    public Nalp001(Long id) {
        this.id = id;
    }

    public String getFnalog() {
        return fnalog;
    }

    public void setFnalog(String fnalog) {
        this.fnalog = fnalog;
    }

    public String getProfcen() {
        return profcen;
    }

    public void setProfcen(String profcen) {
        this.profcen = profcen;
    }

    public String getNalog() {
        return nalog;
    }

    public void setNalog(String nalog) {
        this.nalog = nalog;
    }

    public String getVrdok() {
        return vrdok;
    }

    public void setVrdok(String vrdok) {
        this.vrdok = vrdok;
    }

    public String getStorno() {
        return storno;
    }

    public void setStorno(String storno) {
        this.storno = storno;
    }

    public String getBrFak() {
        return brFak;
    }

    public void setBrFak(String brFak) {
        this.brFak = brFak;
    }

    public String getDatFak() {
        return datFak;
    }

    public void setDatFak(String datFak) {
        this.datFak = datFak;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getIzdat() {
        return izdat;
    }

    public void setIzdat(String izdat) {
        this.izdat = izdat;
    }

    public Double getMBrs() {
        return mBrs;
    }

    public void setMBrs(Double mBrs) {
        this.mBrs = mBrs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getKatbr() {
        return katbr;
    }

    public void setKatbr(String katbr) {
        this.katbr = katbr;
    }

    public String getSifrapor() {
        return sifrapor;
    }

    public void setSifrapor(String sifrapor) {
        this.sifrapor = sifrapor;
    }

    public Double getOsnova() {
        return osnova;
    }

    public void setOsnova(Double osnova) {
        this.osnova = osnova;
    }

    public Double getRabMat() {
        return rabMat;
    }

    public void setRabMat(Double rabMat) {
        this.rabMat = rabMat;
    }

    public Double getPorez() {
        return porez;
    }

    public void setPorez(Double porez) {
        this.porez = porez;
    }

    public Double getOsnova1() {
        return osnova1;
    }

    public void setOsnova1(Double osnova1) {
        this.osnova1 = osnova1;
    }

    public Double getPorez1() {
        return porez1;
    }

    public void setPorez1(Double porez1) {
        this.porez1 = porez1;
    }

    public String getPotOz() {
        return potOz;
    }

    public void setPotOz(String potOz) {
        this.potOz = potOz;
    }

    public String getPotVj() {
        return potVj;
    }

    public void setPotVj(String potVj) {
        this.potVj = potVj;
    }

    public Double getTipPor() {
        return tipPor;
    }

    public void setTipPor(Double tipPor) {
        this.tipPor = tipPor;
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

    public Double getBrojac() {
        return brojac;
    }

    public void setBrojac(Double brojac) {
        this.brojac = brojac;
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
        if (!(object instanceof Nalp001)) {
            return false;
        }
        Nalp001 other = (Nalp001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.Nalp001[ id=" + id + " ]";
    }
    
}
