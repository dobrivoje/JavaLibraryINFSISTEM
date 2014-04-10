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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "VerzijaPodataka")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VerzijaPodataka.findAll", query = "SELECT v FROM VerzijaPodataka v"),
    @NamedQuery(name = "VerzijaPodataka.findBySifVP", query = "SELECT v FROM VerzijaPodataka v WHERE v.sifVP = :sifVP"),
    @NamedQuery(name = "VerzijaPodataka.findByFaktura", query = "SELECT v FROM VerzijaPodataka v WHERE v.faktura = :faktura"),
    @NamedQuery(name = "VerzijaPodataka.findByDatumFakture", query = "SELECT v FROM VerzijaPodataka v WHERE v.datumFakture = :datumFakture"),
    @NamedQuery(name = "VerzijaPodataka.findByDatum", query = "SELECT v FROM VerzijaPodataka v WHERE v.datum = :datum"),
    @NamedQuery(name = "VerzijaPodataka.findByVreme", query = "SELECT v FROM VerzijaPodataka v WHERE v.vreme = :vreme"),
    @NamedQuery(name = "VerzijaPodataka.findByGreska", query = "SELECT v FROM VerzijaPodataka v WHERE v.greska = :greska")})
public class VerzijaPodataka implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifVP")
    private Integer sifVP;
    @Column(name = "Faktura")
    private String faktura;
    @Column(name = "DatumFakture")
    private String datumFakture;
    @Column(name = "Datum")
    private String datum;
    @Column(name = "Vreme")
    private String vreme;
    @Column(name = "Greska")
    private Boolean greska;
    @Lob
    @Column(name = "OpisGreske")
    private String opisGreske;

    public VerzijaPodataka() {
    }

    public VerzijaPodataka(Integer sifVP) {
        this.sifVP = sifVP;
    }

    public Integer getSifVP() {
        return sifVP;
    }

    public void setSifVP(Integer sifVP) {
        this.sifVP = sifVP;
    }

    public String getFaktura() {
        return faktura;
    }

    public void setFaktura(String faktura) {
        this.faktura = faktura;
    }

    public String getDatumFakture() {
        return datumFakture;
    }

    public void setDatumFakture(String datumFakture) {
        this.datumFakture = datumFakture;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public Boolean getGreska() {
        return greska;
    }

    public void setGreska(Boolean greska) {
        this.greska = greska;
    }

    public String getOpisGreske() {
        return opisGreske;
    }

    public void setOpisGreske(String opisGreske) {
        this.opisGreske = opisGreske;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifVP != null ? sifVP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VerzijaPodataka)) {
            return false;
        }
        VerzijaPodataka other = (VerzijaPodataka) object;
        if ((this.sifVP == null && other.sifVP != null) || (this.sifVP != null && !this.sifVP.equals(other.sifVP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.VerzijaPodataka[ sifVP=" + sifVP + " ]";
    }
    
}
