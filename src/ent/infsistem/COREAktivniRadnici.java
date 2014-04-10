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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "CORE_AktivniRadnici")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "COREAktivniRadnici.findAll", query = "SELECT c FROM COREAktivniRadnici c"),
    @NamedQuery(name = "COREAktivniRadnici.findByIdr", query = "SELECT c FROM COREAktivniRadnici c WHERE c.idr = :idr"),
    @NamedQuery(name = "COREAktivniRadnici.findByIDInfSistem", query = "SELECT c FROM COREAktivniRadnici c WHERE c.iDInfSistem = :iDInfSistem"),
    @NamedQuery(name = "COREAktivniRadnici.findByRadnik", query = "SELECT c FROM COREAktivniRadnici c WHERE c.radnik = :radnik"),
    @NamedQuery(name = "COREAktivniRadnici.findByAktivan", query = "SELECT c FROM COREAktivniRadnici c WHERE c.aktivan = :aktivan"),
    @NamedQuery(name = "COREAktivniRadnici.findByAktivanOD", query = "SELECT c FROM COREAktivniRadnici c WHERE c.aktivanOD = :aktivanOD"),
    @NamedQuery(name = "COREAktivniRadnici.findByAktivanDO", query = "SELECT c FROM COREAktivniRadnici c WHERE c.aktivanDO = :aktivanDO")})
public class COREAktivniRadnici implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDR")
    private Long idr;
    @Column(name = "IDInfSistem")
    private String iDInfSistem;
    @Column(name = "Radnik")
    private Boolean radnik;
    @Column(name = "Aktivan")
    private Boolean aktivan;
    @Column(name = "AktivanOD")
    private String aktivanOD;
    @Column(name = "AktivanDO")
    private String aktivanDO;
    @JoinColumn(name = "FK_IDTip", referencedColumnName = "IDTip")
    @ManyToOne
    private CORETipRadnika fKIDTip;

    public COREAktivniRadnici() {
    }

    public COREAktivniRadnici(Long idr) {
        this.idr = idr;
    }

    public Long getIdr() {
        return idr;
    }

    public void setIdr(Long idr) {
        this.idr = idr;
    }

    public String getIDInfSistem() {
        return iDInfSistem;
    }

    public void setIDInfSistem(String iDInfSistem) {
        this.iDInfSistem = iDInfSistem;
    }

    public Boolean getRadnik() {
        return radnik;
    }

    public void setRadnik(Boolean radnik) {
        this.radnik = radnik;
    }

    public Boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(Boolean aktivan) {
        this.aktivan = aktivan;
    }

    public String getAktivanOD() {
        return aktivanOD;
    }

    public void setAktivanOD(String aktivanOD) {
        this.aktivanOD = aktivanOD;
    }

    public String getAktivanDO() {
        return aktivanDO;
    }

    public void setAktivanDO(String aktivanDO) {
        this.aktivanDO = aktivanDO;
    }

    public CORETipRadnika getFKIDTip() {
        return fKIDTip;
    }

    public void setFKIDTip(CORETipRadnika fKIDTip) {
        this.fKIDTip = fKIDTip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idr != null ? idr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof COREAktivniRadnici)) {
            return false;
        }
        COREAktivniRadnici other = (COREAktivniRadnici) object;
        if ((this.idr == null && other.idr != null) || (this.idr != null && !this.idr.equals(other.idr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.COREAktivniRadnici[ idr=" + idr + " ]";
    }
    
}
