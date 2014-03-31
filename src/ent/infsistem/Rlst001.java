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
@Table(name = "RLST001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rlst001.findAll", query = "SELECT r FROM Rlst001 r"),
    @NamedQuery(name = "Rlst001.findById", query = "SELECT r FROM Rlst001 r WHERE r.id = :id"),
    @NamedQuery(name = "Rlst001.findByNalog", query = "SELECT r FROM Rlst001 r WHERE r.nalog = :nalog"),
    @NamedQuery(name = "Rlst001.findByOperacija", query = "SELECT r FROM Rlst001 r WHERE r.operacija = :operacija"),
    @NamedQuery(name = "Rlst001.findByRadnik", query = "SELECT r FROM Rlst001 r WHERE r.radnik = :radnik"),
    @NamedQuery(name = "Rlst001.findBySati", query = "SELECT r FROM Rlst001 r WHERE r.sati = :sati"),
    @NamedQuery(name = "Rlst001.findByDatum", query = "SELECT r FROM Rlst001 r WHERE r.datum = :datum"),
    @NamedQuery(name = "Rlst001.findByVrstarada", query = "SELECT r FROM Rlst001 r WHERE r.vrstarada = :vrstarada"),
    @NamedQuery(name = "Rlst001.findByVrdok", query = "SELECT r FROM Rlst001 r WHERE r.vrdok = :vrdok"),
    @NamedQuery(name = "Rlst001.findByStorno", query = "SELECT r FROM Rlst001 r WHERE r.storno = :storno"),
    @NamedQuery(name = "Rlst001.findByCenarada", query = "SELECT r FROM Rlst001 r WHERE r.cenarada = :cenarada"),
    @NamedQuery(name = "Rlst001.findByPopust", query = "SELECT r FROM Rlst001 r WHERE r.popust = :popust"),
    @NamedQuery(name = "Rlst001.findByManipula", query = "SELECT r FROM Rlst001 r WHERE r.manipula = :manipula"),
    @NamedQuery(name = "Rlst001.findByPotrosni", query = "SELECT r FROM Rlst001 r WHERE r.potrosni = :potrosni"),
    @NamedQuery(name = "Rlst001.findByOdsustvo", query = "SELECT r FROM Rlst001 r WHERE r.odsustvo = :odsustvo"),
    @NamedQuery(name = "Rlst001.findByBrojac", query = "SELECT r FROM Rlst001 r WHERE r.brojac = :brojac")})
public class Rlst001 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NALOG")
    private String nalog;
    @Column(name = "OPERACIJA")
    private String operacija;
    @Column(name = "RADNIK")
    private String radnik;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SATI")
    private Double sati;
    @Column(name = "DATUM")
    private String datum;
    @Column(name = "VRSTARADA")
    private String vrstarada;
    @Column(name = "VRDOK")
    private String vrdok;
    @Column(name = "STORNO")
    private String storno;
    @Column(name = "CENARADA")
    private Double cenarada;
    @Column(name = "POPUST")
    private Double popust;
    @Column(name = "MANIPULA")
    private Double manipula;
    @Column(name = "POTROSNI")
    private Double potrosni;
    @Column(name = "ODSUSTVO")
    private String odsustvo;
    @Column(name = "BROJAC")
    private Double brojac;

    public Rlst001() {
    }

    public Rlst001(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNalog() {
        return nalog;
    }

    public void setNalog(String nalog) {
        this.nalog = nalog;
    }

    public String getOperacija() {
        return operacija;
    }

    public void setOperacija(String operacija) {
        this.operacija = operacija;
    }

    public String getRadnik() {
        return radnik;
    }

    public void setRadnik(String radnik) {
        this.radnik = radnik;
    }

    public Double getSati() {
        return sati;
    }

    public void setSati(Double sati) {
        this.sati = sati;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVrstarada() {
        return vrstarada;
    }

    public void setVrstarada(String vrstarada) {
        this.vrstarada = vrstarada;
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

    public Double getCenarada() {
        return cenarada;
    }

    public void setCenarada(Double cenarada) {
        this.cenarada = cenarada;
    }

    public Double getPopust() {
        return popust;
    }

    public void setPopust(Double popust) {
        this.popust = popust;
    }

    public Double getManipula() {
        return manipula;
    }

    public void setManipula(Double manipula) {
        this.manipula = manipula;
    }

    public Double getPotrosni() {
        return potrosni;
    }

    public void setPotrosni(Double potrosni) {
        this.potrosni = potrosni;
    }

    public String getOdsustvo() {
        return odsustvo;
    }

    public void setOdsustvo(String odsustvo) {
        this.odsustvo = odsustvo;
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
        if (!(object instanceof Rlst001)) {
            return false;
        }
        Rlst001 other = (Rlst001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.Rlst001[ id=" + id + " ]";
    }
    
}
