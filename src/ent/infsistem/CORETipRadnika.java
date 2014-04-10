/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ent.infsistem;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author root
 */
@Entity
@Table(name = "CORE_TipRadnika")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CORETipRadnika.findAll", query = "SELECT c FROM CORETipRadnika c"),
    @NamedQuery(name = "CORETipRadnika.findByIDTip", query = "SELECT c FROM CORETipRadnika c WHERE c.iDTip = :iDTip"),
    @NamedQuery(name = "CORETipRadnika.findByNazivFunkcije", query = "SELECT c FROM CORETipRadnika c WHERE c.nazivFunkcije = :nazivFunkcije")})
public class CORETipRadnika implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTip")
    private Long iDTip;
    @Column(name = "NazivFunkcije")
    private String nazivFunkcije;
    @OneToMany(mappedBy = "fKIDTip")
    private List<COREAktivniRadnici> cOREAktivniRadniciList;

    public CORETipRadnika() {
    }

    public CORETipRadnika(Long iDTip) {
        this.iDTip = iDTip;
    }

    public Long getIDTip() {
        return iDTip;
    }

    public void setIDTip(Long iDTip) {
        this.iDTip = iDTip;
    }

    public String getNazivFunkcije() {
        return nazivFunkcije;
    }

    public void setNazivFunkcije(String nazivFunkcije) {
        this.nazivFunkcije = nazivFunkcije;
    }

    @XmlTransient
    public List<COREAktivniRadnici> getCOREAktivniRadniciList() {
        return cOREAktivniRadniciList;
    }

    public void setCOREAktivniRadniciList(List<COREAktivniRadnici> cOREAktivniRadniciList) {
        this.cOREAktivniRadniciList = cOREAktivniRadniciList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTip != null ? iDTip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CORETipRadnika)) {
            return false;
        }
        CORETipRadnika other = (CORETipRadnika) object;
        if ((this.iDTip == null && other.iDTip != null) || (this.iDTip != null && !this.iDTip.equals(other.iDTip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.CORETipRadnika[ iDTip=" + iDTip + " ]";
    }
    
}
