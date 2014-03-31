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
@Table(name = "RADN001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Radn001.findAll", query = "SELECT r FROM Radn001 r"),
    @NamedQuery(name = "Radn001.findById", query = "SELECT r FROM Radn001 r WHERE r.id = :id"),
    @NamedQuery(name = "Radn001.findByOrgjed", query = "SELECT r FROM Radn001 r WHERE r.orgjed = :orgjed"),
    @NamedQuery(name = "Radn001.findByRadnik", query = "SELECT r FROM Radn001 r WHERE r.radnik = :radnik"),
    @NamedQuery(name = "Radn001.findByIme", query = "SELECT r FROM Radn001 r WHERE r.ime = :ime"),
    @NamedQuery(name = "Radn001.findByPrezime", query = "SELECT r FROM Radn001 r WHERE r.prezime = :prezime"),
    @NamedQuery(name = "Radn001.findByAdresa", query = "SELECT r FROM Radn001 r WHERE r.adresa = :adresa"),
    @NamedQuery(name = "Radn001.findByTelefon", query = "SELECT r FROM Radn001 r WHERE r.telefon = :telefon"),
    @NamedQuery(name = "Radn001.findByIdradnik", query = "SELECT r FROM Radn001 r WHERE r.idradnik = :idradnik")})
public class Radn001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ORGJED")
    private String orgjed;
    @Column(name = "RADNIK")
    private String radnik;
    @Column(name = "IME")
    private String ime;
    @Column(name = "PREZIME")
    private String prezime;
    @Column(name = "ADRESA")
    private String adresa;
    @Column(name = "TELEFON")
    private String telefon;
    @Column(name = "IDRADNIK")
    private String idradnik;

    //<editor-fold defaultstate="collapsed" desc="konstruktor, getters/setters">
    public Radn001() {
    }

    public Radn001(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgjed() {
        return orgjed;
    }

    public void setOrgjed(String orgjed) {
        this.orgjed = orgjed;
    }

    public String getRadnik() {
        return radnik;
    }

    public void setRadnik(String radnik) {
        this.radnik = radnik;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIdradnik() {
        return idradnik;
    }

    public void setIdradnik(String idradnik) {
        this.idradnik = idradnik;
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
        if (!(object instanceof Radn001)) {
            return false;
        }
        Radn001 other = (Radn001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    //</editor-fold>

    @Override
    public synchronized String toString() {
        return "ID - " + radnik
                + ", Org. Jed - " + orgjed
                + ", Ime - " + ime
                + ", Prezime - " + prezime;
    }
}
