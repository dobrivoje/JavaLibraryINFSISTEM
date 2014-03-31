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
@Table(name = "NALN001")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naln001.findAll", query = "SELECT n FROM Naln001 n"),
    @NamedQuery(name = "Naln001.findById", query = "SELECT n FROM Naln001 n WHERE n.id = :id"),
    @NamedQuery(name = "Naln001.findByRnalog", query = "SELECT n FROM Naln001 n WHERE n.rnalog = :rnalog"),
    @NamedQuery(name = "Naln001.findByOperacija", query = "SELECT n FROM Naln001 n WHERE n.operacija = :operacija"),
    @NamedQuery(name = "Naln001.findByPotvrda", query = "SELECT n FROM Naln001 n WHERE n.potvrda = :potvrda"),
    @NamedQuery(name = "Naln001.findByPoenter", query = "SELECT n FROM Naln001 n WHERE n.poenter = :poenter"),
    @NamedQuery(name = "Naln001.findByNnormSat", query = "SELECT n FROM Naln001 n WHERE n.nnormSat = :nnormSat"),
    @NamedQuery(name = "Naln001.findByText99", query = "SELECT n FROM Naln001 n WHERE n.text99 = :text99")})
public class Naln001 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RNALOG")
    private String rnalog;
    @Column(name = "OPERACIJA")
    private String operacija;
    @Basic(optional = false)
    @Column(name = "POTVRDA")
    private boolean potvrda;
    @Column(name = "POENTER")
    private String poenter;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NNORM_SAT")
    private Double nnormSat;
    @Column(name = "TEXT99")
    private String text99;

    public Naln001() {
    }

    public Naln001(Long id) {
        this.id = id;
    }

    public Naln001(Long id, boolean potvrda) {
        this.id = id;
        this.potvrda = potvrda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRnalog() {
        return rnalog;
    }

    public void setRnalog(String rnalog) {
        this.rnalog = rnalog;
    }

    public String getOperacija() {
        return operacija;
    }

    public void setOperacija(String operacija) {
        this.operacija = operacija;
    }

    public boolean getPotvrda() {
        return potvrda;
    }

    public void setPotvrda(boolean potvrda) {
        this.potvrda = potvrda;
    }

    public String getPoenter() {
        return poenter;
    }

    public void setPoenter(String poenter) {
        this.poenter = poenter;
    }

    public Double getNnormSat() {
        return nnormSat;
    }

    public void setNnormSat(Double nnormSat) {
        this.nnormSat = nnormSat;
    }

    public String getText99() {
        return text99;
    }

    public void setText99(String text99) {
        this.text99 = text99;
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
        if (!(object instanceof Naln001)) {
            return false;
        }
        Naln001 other = (Naln001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.infsistem2.Naln001[ id=" + id + " ]";
    }
    
}
