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
@Table(name = "SIFARNIK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sifarnik.findAll", query = "SELECT s FROM Sifarnik s"),
    @NamedQuery(name = "Sifarnik.findById", query = "SELECT s FROM Sifarnik s WHERE s.id = :id"),
    @NamedQuery(name = "Sifarnik.findByKupac", query = "SELECT s FROM Sifarnik s WHERE s.kupac = :kupac"),
    @NamedQuery(name = "Sifarnik.findByIme", query = "SELECT s FROM Sifarnik s WHERE s.ime = :ime"),
    @NamedQuery(name = "Sifarnik.DelimicanNaziv",
            query = "SELECT s FROM Sifarnik s WHERE s.ime LIKE :Naziv OR s.adresa LIKE :Naziv OR s.mesto LIKE :Naziv"),
    @NamedQuery(name = "Sifarnik.findByAdresa", query = "SELECT s FROM Sifarnik s WHERE s.adresa = :adresa"),
    @NamedQuery(name = "Sifarnik.findByMesto", query = "SELECT s FROM Sifarnik s WHERE s.mesto = :mesto"),
    @NamedQuery(name = "Sifarnik.findByFizickoLice", query = "SELECT s FROM Sifarnik s WHERE s.fizickoLice = :fizickoLice"),
    @NamedQuery(name = "Sifarnik.findByDatumUpisaSifre", query = "SELECT s FROM Sifarnik s WHERE s.datumUpisaSifre = :datumUpisaSifre"),
    @NamedQuery(name = "Sifarnik.findByPib", query = "SELECT s FROM Sifarnik s WHERE s.pib = :pib"),
    @NamedQuery(name = "Sifarnik.findByMatbr", query = "SELECT s FROM Sifarnik s WHERE s.matbr = :matbr"),
    @NamedQuery(name = "Sifarnik.findByPdv", query = "SELECT s FROM Sifarnik s WHERE s.pdv = :pdv"),
    @NamedQuery(name = "Sifarnik.findByZiroRacun", query = "SELECT s FROM Sifarnik s WHERE s.ziroRacun = :ziroRacun"),
    @NamedQuery(name = "Sifarnik.findByTelefon1sifarnik", query = "SELECT s FROM Sifarnik s WHERE s.telefon1sifarnik = :telefon1sifarnik"),
    @NamedQuery(name = "Sifarnik.findByTelefonzaplacanje", query = "SELECT s FROM Sifarnik s WHERE s.telefonzaplacanje = :telefonzaplacanje"),
    @NamedQuery(name = "Sifarnik.findByKontaktosobazaplacanje", query = "SELECT s FROM Sifarnik s WHERE s.kontaktosobazaplacanje = :kontaktosobazaplacanje"),
    @NamedQuery(name = "Sifarnik.findByTelefonzaservis", query = "SELECT s FROM Sifarnik s WHERE s.telefonzaservis = :telefonzaservis"),
    @NamedQuery(name = "Sifarnik.findByKontaktosobaservisa", query = "SELECT s FROM Sifarnik s WHERE s.kontaktosobaservisa = :kontaktosobaservisa"),
    @NamedQuery(name = "Sifarnik.findByUgovorenirokplacanja", query = "SELECT s FROM Sifarnik s WHERE s.ugovorenirokplacanja = :ugovorenirokplacanja"),
    @NamedQuery(name = "Sifarnik.findByPosebnenapomene", query = "SELECT s FROM Sifarnik s WHERE s.posebnenapomene = :posebnenapomene"),
    @NamedQuery(name = "Sifarnik.findByMail", query = "SELECT s FROM Sifarnik s WHERE s.mail = :mail"),
    @NamedQuery(name = "Sifarnik.findByWeb", query = "SELECT s FROM Sifarnik s WHERE s.web = :web")})
public class Sifarnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "KUPAC")
    private Integer kupac;
    @Column(name = "IME")
    private String ime;
    @Column(name = "ADRESA")
    private String adresa;
    @Column(name = "MESTO")
    private String mesto;
    @Column(name = "FizickoLice")
    private Boolean fizickoLice;
    @Column(name = "DatumUpisaSifre")
    private String datumUpisaSifre;
    @Column(name = "PIB")
    private String pib;
    @Column(name = "MATBR")
    private String matbr;
    @Column(name = "PDV")
    private String pdv;
    @Column(name = "ZIRO_RACUN")
    private String ziroRacun;
    @Column(name = "Telefon1_sifarnik")
    private String telefon1sifarnik;
    @Column(name = "Telefon_za_placanje")
    private String telefonzaplacanje;
    @Column(name = "Kontakt_osoba_za_placanje")
    private String kontaktosobazaplacanje;
    @Column(name = "Telefon_za_servis")
    private String telefonzaservis;
    @Column(name = "Kontakt_osoba_servisa")
    private String kontaktosobaservisa;
    @Column(name = "Ugovoreni_rok_placanja")
    private Integer ugovorenirokplacanja;
    @Column(name = "Posebne_napomene")
    private String posebnenapomene;
    @Column(name = "Mail")
    private String mail;
    @Column(name = "Web")
    private String web;

    public Sifarnik() {
    }

    public Sifarnik(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getKupac() {
        return kupac;
    }

    public void setKupac(Integer kupac) {
        this.kupac = kupac;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public Boolean getFizickoLice() {
        return fizickoLice;
    }

    public void setFizickoLice(Boolean fizickoLice) {
        this.fizickoLice = fizickoLice;
    }

    public String getDatumUpisaSifre() {
        return datumUpisaSifre;
    }

    public void setDatumUpisaSifre(String datumUpisaSifre) {
        this.datumUpisaSifre = datumUpisaSifre;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getMatbr() {
        return matbr;
    }

    public void setMatbr(String matbr) {
        this.matbr = matbr;
    }

    public String getPdv() {
        return pdv;
    }

    public void setPdv(String pdv) {
        this.pdv = pdv;
    }

    public String getZiroRacun() {
        return ziroRacun;
    }

    public void setZiroRacun(String ziroRacun) {
        this.ziroRacun = ziroRacun;
    }

    public String getTelefon1sifarnik() {
        return telefon1sifarnik;
    }

    public void setTelefon1sifarnik(String telefon1sifarnik) {
        this.telefon1sifarnik = telefon1sifarnik;
    }

    public String getTelefonzaplacanje() {
        return telefonzaplacanje;
    }

    public void setTelefonzaplacanje(String telefonzaplacanje) {
        this.telefonzaplacanje = telefonzaplacanje;
    }

    public String getKontaktosobazaplacanje() {
        return kontaktosobazaplacanje;
    }

    public void setKontaktosobazaplacanje(String kontaktosobazaplacanje) {
        this.kontaktosobazaplacanje = kontaktosobazaplacanje;
    }

    public String getTelefonzaservis() {
        return telefonzaservis;
    }

    public void setTelefonzaservis(String telefonzaservis) {
        this.telefonzaservis = telefonzaservis;
    }

    public String getKontaktosobaservisa() {
        return kontaktosobaservisa;
    }

    public void setKontaktosobaservisa(String kontaktosobaservisa) {
        this.kontaktosobaservisa = kontaktosobaservisa;
    }

    public Integer getUgovorenirokplacanja() {
        return ugovorenirokplacanja;
    }

    public void setUgovorenirokplacanja(Integer ugovorenirokplacanja) {
        this.ugovorenirokplacanja = ugovorenirokplacanja;
    }

    public String getPosebnenapomene() {
        return posebnenapomene;
    }

    public void setPosebnenapomene(String posebnenapomene) {
        this.posebnenapomene = posebnenapomene;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
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
        if (!(object instanceof Sifarnik)) {
            return false;
        }
        Sifarnik other = (Sifarnik) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public synchronized String toString() {
        return getIme() + ", ID-" + getKupac() + ", " + getAdresa();
    }
}
