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
@Table(name = "NALD001")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Nald001.findAll", query = "SELECT n FROM Nald001 n"),
    @NamedQuery(name = "Nald001.findByDatnal", query = "SELECT n FROM Nald001 n WHERE n.datnal = :datnal"),
    @NamedQuery(name = "Nald001.findByRadnal", query = "SELECT n FROM Nald001 n WHERE n.radnal = :radnal"),

    @NamedQuery(name = "INFSIS.MesecPoDanimaRadMaterijal",
            query = "SELECT NEW INFSYS.BusinessBeans.DnevnoFA_UK("
            + "FUNCTION('YEAR',n.fakturisan), FUNCTION('MONTH',n.fakturisan), FUNCTION('DAY',n.fakturisan), "
            + "SUM(n.rad*(1-n.rabSat/100)), SUM(n.materijal*(1-n.rabMat/100))"
            + ") "
            + " FROM Nald001 n "
            + " WHERE FUNCTION('YEAR', n.fakturisan) = :Godina AND FUNCTION('MONTH', n.fakturisan) = :Mesec"
            // + " GROUP BY FUNCTION('YEAR',n.fakturisan), FUNCTION('MONTH',n.fakturisan), FUNCTION('DAY',n.fakturisan)"
            + " GROUP BY n.fakturisan"
    ),

    @NamedQuery(name = "INFSIS.MesecDnevnoRadMaterijal",
            query = "SELECT NEW INFSYS.BusinessBeans.DnevnoFA_UK("
            + "FUNCTION('YEAR',n.fakturisan), FUNCTION('MONTH',n.fakturisan), FUNCTION('DAY',n.fakturisan), "
            + "SUM(n.rad*(1-n.rabSat/100)), SUM(n.materijal*(1-n.rabMat/100))"
            + ") "
            + " FROM Nald001 n "
            + " WHERE FUNCTION('YEAR', n.fakturisan) = :Godina AND FUNCTION('MONTH', n.fakturisan) = :Mesec AND FUNCTION('DAY', n.fakturisan) = :Dan "
            + " GROUP BY FUNCTION('YEAR',n.fakturisan), FUNCTION('MONTH',n.fakturisan), FUNCTION('DAY',n.fakturisan)"
    ),
    
    @NamedQuery(name = "INFSIS.SSavetnikPerformanse",
            query = "SELECT NEW INFSYS.BusinessBeans.SSavetnikPerformanse("
            + "n.primio, FUNCTION('YEAR',n.fakturisan), FUNCTION('MONTH',n.fakturisan), "
            + "SUM(n.rad*(1-n.rabSat/100)), SUM(n.materijal*(1-n.rabMat/100)) "
            + ") "
            + " FROM Nald001 n "
            + " WHERE FUNCTION('YEAR', n.fakturisan) = :Godina AND FUNCTION('MONTH', n.fakturisan) = :Mesec "
            + " GROUP BY n.primio, FUNCTION('YEAR',n.fakturisan), FUNCTION('MONTH',n.fakturisan)"
    ),

    @NamedQuery(name = "Nald001.FAKTURE_GODINA_MESEC",
            query = "SELECT n FROM Nald001 n WHERE n.ukupno>0 AND FUNCTION('YEAR', n.fakturisan) = :Godina AND FUNCTION('MONTH', n.fakturisan) = :Mesec"),

    @NamedQuery(name = "Nald001.STORNO_FAKTURE_GODINA_MESEC",
            query = "SELECT n FROM Nald001 n WHERE n.ukupno<0 AND FUNCTION('YEAR', n.fakturisan) = :Godina AND FUNCTION('MONTH', n.fakturisan) = :Mesec"),

    @NamedQuery(name = "Nald001.DelimicanOpisRadova",
            query = "SELECT n FROM Nald001 n WHERE n.uradi LIKE :DelimicanOpisRadova"),

    @NamedQuery(name = "Nald001.BrojRN_Po_Danima_ZaPeriod",
            query = "SELECT COUNT(n) FROM Nald001 n "
            + "WHERE n.datnal BETWEEN :DatumOD "
            + "AND :DatumDO GROUP BY n.datnal "
            + "ORDER BY n.datnal ASC"),

    @NamedQuery(name = "Nald001.Dani_ZaBrojRN_PoDanimaZaPeriod",
            query = "SELECT DISTINCT (n.datnal) FROM Nald001 n "
            + "WHERE n.datnal BETWEEN :DatumOD AND :DatumDO "
            + "ORDER BY n.datnal ASC"),

    @NamedQuery(name = "Nald001.BrojRN_ZaDatum",
            query = "SELECT COUNT(n) FROM Nald001 n WHERE n.datum = :Datum"),

    @NamedQuery(name = "Nald001.BrojFA_ZaDatum",
            query = "SELECT COUNT(n) FROM Nald001 n WHERE n.fakturisan = :Datum AND n.ukupno > 0"),

    @NamedQuery(name = "Nald001.BrojSTFA_ZaDatum",
            query = "SELECT COUNT(n) FROM Nald001 n WHERE n.fakturisan = :Datum AND n.ukupno < 0"),

    @NamedQuery(name = "Nald001.Test",
            query = "SELECT COUNT(n) FROM Nald001 n WHERE n.kupac = :Kupac and n.ukupno < 0"),

    @NamedQuery(name = "Nald001.RN_FAKT_STORNO",
            query = "SELECT n FROM Nald001 n WHERE n.brFakt = :radnal"),
    @NamedQuery(name = "Nald001.RN_ZA_PERIOD",
            query = "SELECT n FROM Nald001 n WHERE n.datum BETWEEN :datumOD AND :datumDO ORDER BY n.datum ASC"),

    @NamedQuery(name = "Nald001.FAKTURE_ZA_PERIOD",
            query = "SELECT n FROM Nald001 n WHERE n.ukupno>0 AND n.fakturisan BETWEEN :datumOD AND :datumDO ORDER BY n.fakturisan ASC"),

    @NamedQuery(name = "Nald001.STORNA_U_PERIODU",
            query = "SELECT n FROM Nald001 n WHERE n.ukupno<0 AND n.fakturisan BETWEEN :datumOD AND :datumDO ORDER BY n.fakturisan ASC"),

    @NamedQuery(name = "Nald001.RAD_ZA_PERIOD",
            query = "SELECT SUM(n.rad*(1-n.rabSat/100)) FROM Nald001 n "
            + "WHERE n.ukupno>0 "
            + "AND FUNCTION('YEAR', n.fakturisan) = :Godina "
            + "GROUP BY FUNCTION('MONTH', n.fakturisan) ORDER BY FUNCTION('MONTH', n.fakturisan)"),

    @NamedQuery(name = "Nald001.MATERIJAL_ZA_PERIOD",
            query = "SELECT SUM(n.materijal*(1-n.rabMat/100)) FROM Nald001 n "
            + "WHERE n.ukupno>0 "
            + "AND FUNCTION('YEAR', n.fakturisan) = :Godina "
            + "GROUP BY FUNCTION('MONTH', n.fakturisan) ORDER BY FUNCTION('MONTH', n.fakturisan)"),

    @NamedQuery(name = "Nald001.STORNO_RAD_ZA_PERIOD",
            query = "SELECT SUM(n.rad*(1-n.rabSat/100)) FROM Nald001 n "
            + "WHERE n.ukupno < 0 "
            + "AND FUNCTION('YEAR', n.fakturisan) = :Godina "
            + "GROUP BY FUNCTION('MONTH', n.fakturisan) ORDER BY FUNCTION('MONTH', n.fakturisan)"),

    @NamedQuery(name = "Nald001.STORNO_MATERIJAL_ZA_PERIOD",
            query = "SELECT SUM(n.materijal*(1-n.rabMat/100)) FROM Nald001 n "
            + "WHERE n.ukupno < 0 "
            + "AND FUNCTION('YEAR', n.fakturisan) = :Godina "
            + "GROUP BY FUNCTION('MONTH', n.fakturisan) ORDER BY FUNCTION('MONTH', n.fakturisan)"),

    @NamedQuery(name = "Nald001.findByVrdok", query = "SELECT n FROM Nald001 n WHERE n.vrdok = :vrdok"),
    @NamedQuery(name = "Nald001.findByDatum", query = "SELECT n FROM Nald001 n WHERE n.datum = :datum ORDER BY n.datum ASC"),
    @NamedQuery(name = "Nald001.faktureZaDatum", query = "SELECT N FROM Nald001 n WHERE n.datum = :datum AND n.ukupno > 0 ORDER BY n.datum ASC"),
    @NamedQuery(name = "Nald001.findByPcentar", query = "SELECT n FROM Nald001 n WHERE n.pcentar = :pcentar"),
    @NamedQuery(name = "Nald001.findByPcentar1", query = "SELECT n FROM Nald001 n WHERE n.pcentar1 = :pcentar1"),
    @NamedQuery(name = "Nald001.findByIme", query = "SELECT n FROM Nald001 n WHERE n.ime = :ime"),
    @NamedQuery(name = "Nald001.findByPrezime", query = "SELECT n FROM Nald001 n WHERE n.prezime = :prezime"),
    @NamedQuery(name = "Nald001.findByMatBroj", query = "SELECT n FROM Nald001 n WHERE n.matBroj = :matBroj"),
    @NamedQuery(name = "Nald001.findByMesto", query = "SELECT n FROM Nald001 n WHERE n.mesto = :mesto"),
    @NamedQuery(name = "Nald001.findByAdresa", query = "SELECT n FROM Nald001 n WHERE n.adresa = :adresa"),
    @NamedQuery(name = "Nald001.findByTelefon", query = "SELECT n FROM Nald001 n WHERE n.telefon = :telefon"),
    @NamedQuery(name = "Nald001.findByMarka", query = "SELECT n FROM Nald001 n WHERE n.marka = :marka"),
    @NamedQuery(name = "Nald001.findByTip", query = "SELECT n FROM Nald001 n WHERE n.tip = :tip"),
    @NamedQuery(name = "Nald001.findByFamilija", query = "SELECT n FROM Nald001 n WHERE n.familija = :familija"),

    @NamedQuery(name = "Nald001.findByRegistracija",
            query = "SELECT n FROM Nald001 n WHERE n.registrac = :registrac ORDER BY n.datum ASC"),
    @NamedQuery(name = "Nald001.RegistracijaDelimicna",
            query = "SELECT n FROM Nald001 n WHERE n.registrac LIKE :delimicnaRegistracija ORDER BY n.datum ASC"),
    @NamedQuery(name = "Nald001.findByIstice", query = "SELECT n FROM Nald001 n WHERE n.istice = :istice"),
    @NamedQuery(name = "Nald001.findByMotor", query = "SELECT n FROM Nald001 n WHERE n.motor = :motor"),
    @NamedQuery(name = "Nald001.findBySasija",
            query = "SELECT n FROM Nald001 n WHERE n.sasija = :sasija AND n.sasija is not null ORDER BY n.datum ASC"),
    @NamedQuery(name = "Nald001.DelimicnaSasija",
            query = "SELECT n FROM Nald001 n WHERE n.sasija LIKE :delimicnaSasija ORDER BY n.datum ASC"),
    //
    // Jedinstveni brojevi šasija za Kupca !
    @NamedQuery(name = "Nald001.VozilaKlijenta",
            query = "SELECT DISTINCT n.sasija FROM Nald001 n WHERE n.kupac = :kupac AND n.sasija is not null ORDER BY n.datum ASC"),
    //
    //
    @NamedQuery(name = "Nald001.NaloziKlijentaPoDatumu",
            query = "SELECT n FROM Nald001 n WHERE n.kupac = :kupac AND n.sasija is not null AND n.datum BETWEEN :pocDatum AND :krajnjiDatum ORDER BY n.datum ASC"),
    @NamedQuery(name = "Nald001.findByKm", query = "SELECT n FROM Nald001 n WHERE n.km = :km"),
    @NamedQuery(name = "Nald001.findByGProiz", query = "SELECT n FROM Nald001 n WHERE n.gProiz = :gProiz"),
    @NamedQuery(name = "Nald001.findByPrimio", query = "SELECT n FROM Nald001 n WHERE n.primio = :primio"),
    @NamedQuery(name = "Nald001.findByNalogdavac", query = "SELECT n FROM Nald001 n WHERE n.nalogdavac = :nalogdavac"),
    @NamedQuery(name = "Nald001.findByVrRada", query = "SELECT n FROM Nald001 n WHERE n.vrRada = :vrRada"),

    @NamedQuery(name = "Nald001.findByKupac",
            query = "SELECT n FROM Nald001 n WHERE n.kupac = :kupac"),

    @NamedQuery(name = "Nald001.findByZatvoren", query = "SELECT n FROM Nald001 n WHERE n.zatvoren = :zatvoren"),
    @NamedQuery(name = "Nald001.findByBrProf", query = "SELECT n FROM Nald001 n WHERE n.brProf = :brProf"),
    @NamedQuery(name = "Nald001.findByDatProf", query = "SELECT n FROM Nald001 n WHERE n.datProf = :datProf"),
    @NamedQuery(name = "Nald001.findByOpcija", query = "SELECT n FROM Nald001 n WHERE n.opcija = :opcija"),
    @NamedQuery(name = "Nald001.findByBrFakt", query = "SELECT n FROM Nald001 n WHERE n.brFakt = :brFakt"),
    @NamedQuery(name = "Nald001.PoFakt_i_eventualno_Storno",
            query = "SELECT n FROM Nald001 n WHERE n.brFakt = :brFakt"),
    @NamedQuery(name = "Nald001.findByFakturisan", query = "SELECT n FROM Nald001 n WHERE n.fakturisan = :fakturisan"),
    @NamedQuery(name = "Nald001.findByDatDpo", query = "SELECT n FROM Nald001 n WHERE n.datDpo = :datDpo"),
    @NamedQuery(name = "Nald001.findByVal", query = "SELECT n FROM Nald001 n WHERE n.val = :val"),
    @NamedQuery(name = "Nald001.findByRad", query = "SELECT n FROM Nald001 n WHERE n.rad = :rad"),
    @NamedQuery(name = "Nald001.findByRabSat", query = "SELECT n FROM Nald001 n WHERE n.rabSat = :rabSat"),
    @NamedQuery(name = "Nald001.findByMaterijal", query = "SELECT n FROM Nald001 n WHERE n.materijal = :materijal"),
    @NamedQuery(name = "Nald001.findByRabMat", query = "SELECT n FROM Nald001 n WHERE n.rabMat = :rabMat"),
    @NamedQuery(name = "Nald001.findByTudjiRad", query = "SELECT n FROM Nald001 n WHERE n.tudjiRad = :tudjiRad"),
    @NamedQuery(name = "Nald001.findByTudjiOpis", query = "SELECT n FROM Nald001 n WHERE n.tudjiOpis = :tudjiOpis"),
    @NamedQuery(name = "Nald001.findByUkupno", query = "SELECT n FROM Nald001 n WHERE n.ukupno = :ukupno"),
    @NamedQuery(name = "Nald001.findByStorno", query = "SELECT n FROM Nald001 n WHERE n.storno = :storno"),
    @NamedQuery(name = "Nald001.findByNapkupac", query = "SELECT n FROM Nald001 n WHERE n.napkupac = :napkupac"),
    @NamedQuery(name = "Nald001.findByFist", query = "SELECT n FROM Nald001 n WHERE n.fist = :fist")
})
public class Nald001 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NALOG")
    private String nalog;
    @Column(name = "DATNAL")
    private String datnal;
    @Column(name = "DAT_PREN")
    private String datPren;
    @Column(name = "TIM_PREN")
    private String timPren;
    @Column(name = "RADNAL")
    private String radnal;
    @Column(name = "VRDOK")
    private String vrdok;
    @Column(name = "SPROVODNI")
    private String sprovodni;
    @Column(name = "DATUM")
    private String datum;
    @Column(name = "PCENTAR")
    private String pcentar;
    @Column(name = "PCENTAR1")
    private String pcentar1;
    @Column(name = "IME")
    private String ime;
    @Column(name = "PREZIME")
    private String prezime;
    @Column(name = "MAT_BROJ")
    private String matBroj;
    @Column(name = "MESTO")
    private String mesto;
    @Column(name = "ADRESA")
    private String adresa;
    @Column(name = "TELEFON")
    private String telefon;
    @Column(name = "MARKA")
    private String marka;
    @Column(name = "TIP")
    private String tip;
    @Column(name = "FAMILIJA")
    private String familija;
    @Column(name = "REGISTRAC")
    private String registrac;
    @Column(name = "ISTICE")
    private String istice;
    @Column(name = "MOTOR")
    private String motor;
    @Column(name = "SASIJA")
    private String sasija;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "KM")
    private Double km;
    @Column(name = "G_PROIZ")
    private String gProiz;
    @Column(name = "ANTIFRIZ")
    private String antifriz;
    @Column(name = "PRIMIO")
    private String primio;
    @Column(name = "NALOGDAVAC")
    private String nalogdavac;
    @Column(name = "VR_RADA")
    private String vrRada;
    @Column(name = "KUPAC")
    private String kupac;
    @Column(name = "ZATVOREN")
    private String zatvoren;
    @Column(name = "BR_PROF")
    private String brProf;
    @Column(name = "DAT_PROF")
    private String datProf;
    @Column(name = "OPCIJA")
    private Double opcija;
    @Column(name = "BR_FAKT")
    private String brFakt;
    @Column(name = "FAKTURISAN")
    private String fakturisan;
    @Column(name = "DAT_DPO")
    private String datDpo;
    @Column(name = "VAL")
    private Double val;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "UGOVOR")
    private String ugovor;
    @Column(name = "AKONTACIJA")
    private Double akontacija;
    @Column(name = "RAD")
    private Double rad;
    @Column(name = "RAB_SAT")
    private Double rabSat;
    @Column(name = "MATERIJAL")
    private Double materijal;
    @Column(name = "RAB_MAT")
    private Double rabMat;
    @Column(name = "TUDJI_RAD")
    private Double tudjiRad;
    @Column(name = "TUDJI_OPIS")
    private String tudjiOpis;
    @Column(name = "OSLOBODJEN")
    private String oslobodjen;
    @Column(name = "POREZRAD")
    private Double porezrad;
    @Column(name = "POR_DEO")
    private Double porDeo;
    @Column(name = "P2")
    private Double p2;
    @Column(name = "TAXA_RAD")
    private Double taxaRad;
    @Column(name = "TAXA_DEO")
    private Double taxaDeo;
    @Column(name = "SAV_POR")
    private Double savPor;
    @Column(name = "SAV_PORU")
    private Double savPoru;
    @Column(name = "UKUPNO")
    private Double ukupno;
    @Lob
    @Column(name = "URADI")
    private String uradi;
    @Lob
    @Column(name = "URADJENO")
    private String uradjeno;
    @Column(name = "STORNO")
    private String storno;
    @Column(name = "NAPKUPAC")
    private String napkupac;
    @Column(name = "PRINTED")
    private Boolean printed;
    @Column(name = "TIPNAL")
    private String tipnal;
    @Column(name = "FIST")
    private String fist;
    @Column(name = "ISPORUKA")
    private String isporuka;
    @Column(name = "TUDJI_PDV")
    private Double tudjiPdv;

    public Nald001() {
    }

    public Nald001(Long id) {
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

    public String getDatnal() {
        return datnal;
    }

    public void setDatnal(String datnal) {
        this.datnal = datnal;
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

    public String getRadnal() {
        return radnal;
    }

    public void setRadnal(String radnal) {
        this.radnal = radnal;
    }

    public String getVrdok() {
        return vrdok;
    }

    public void setVrdok(String vrdok) {
        this.vrdok = vrdok;
    }

    public String getSprovodni() {
        return sprovodni;
    }

    public void setSprovodni(String sprovodni) {
        this.sprovodni = sprovodni;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getPcentar() {
        return pcentar;
    }

    public void setPcentar(String pcentar) {
        this.pcentar = pcentar;
    }

    public String getPcentar1() {
        return pcentar1;
    }

    public void setPcentar1(String pcentar1) {
        this.pcentar1 = pcentar1;
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

    public String getMatBroj() {
        return matBroj;
    }

    public void setMatBroj(String matBroj) {
        this.matBroj = matBroj;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getFamilija() {
        return familija;
    }

    public void setFamilija(String familija) {
        this.familija = familija;
    }

    public String getRegistrac() {
        return registrac;
    }

    public void setRegistrac(String registrac) {
        this.registrac = registrac;
    }

    public String getIstice() {
        return istice;
    }

    public void setIstice(String istice) {
        this.istice = istice;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getSasija() {
        return sasija;
    }

    public void setSasija(String sasija) {
        this.sasija = sasija;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public String getGProiz() {
        return gProiz;
    }

    public void setGProiz(String gProiz) {
        this.gProiz = gProiz;
    }

    public String getAntifriz() {
        return antifriz;
    }

    public void setAntifriz(String antifriz) {
        this.antifriz = antifriz;
    }

    public String getPrimio() {
        return primio;
    }

    public void setPrimio(String primio) {
        this.primio = primio;
    }

    public String getNalogdavac() {
        return nalogdavac;
    }

    public void setNalogdavac(String nalogdavac) {
        this.nalogdavac = nalogdavac;
    }

    public String getVrRada() {
        return vrRada;
    }

    public void setVrRada(String vrRada) {
        this.vrRada = vrRada;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public String getZatvoren() {
        return zatvoren;
    }

    public void setZatvoren(String zatvoren) {
        this.zatvoren = zatvoren;
    }

    public String getBrProf() {
        return brProf;
    }

    public void setBrProf(String brProf) {
        this.brProf = brProf;
    }

    public String getDatProf() {
        return datProf;
    }

    public void setDatProf(String datProf) {
        this.datProf = datProf;
    }

    public Double getOpcija() {
        return opcija;
    }

    public void setOpcija(Double opcija) {
        this.opcija = opcija;
    }

    public String getBrFakt() {
        return brFakt;
    }

    public void setBrFakt(String brFakt) {
        this.brFakt = brFakt;
    }

    public String getFakturisan() {
        return fakturisan;
    }

    public void setFakturisan(String fakturisan) {
        this.fakturisan = fakturisan;
    }

    public String getDatDpo() {
        return datDpo;
    }

    public void setDatDpo(String datDpo) {
        this.datDpo = datDpo;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUgovor() {
        return ugovor;
    }

    public void setUgovor(String ugovor) {
        this.ugovor = ugovor;
    }

    public Double getAkontacija() {
        return akontacija;
    }

    public void setAkontacija(Double akontacija) {
        this.akontacija = akontacija;
    }

    public Double getRad() {
        return rad;
    }

    public void setRad(Double rad) {
        this.rad = rad;
    }

    public Double getRabSat() {
        return rabSat;
    }

    public void setRabSat(Double rabSat) {
        this.rabSat = rabSat;
    }

    public Double getMaterijal() {
        return materijal;
    }

    public void setMaterijal(Double materijal) {
        this.materijal = materijal;
    }

    public Double getRabMat() {
        return rabMat;
    }

    public void setRabMat(Double rabMat) {
        this.rabMat = rabMat;
    }

    public Double getTudjiRad() {
        return tudjiRad;
    }

    public void setTudjiRad(Double tudjiRad) {
        this.tudjiRad = tudjiRad;
    }

    public String getTudjiOpis() {
        return tudjiOpis;
    }

    public void setTudjiOpis(String tudjiOpis) {
        this.tudjiOpis = tudjiOpis;
    }

    public String getOslobodjen() {
        return oslobodjen;
    }

    public void setOslobodjen(String oslobodjen) {
        this.oslobodjen = oslobodjen;
    }

    public Double getPorezrad() {
        return porezrad;
    }

    public void setPorezrad(Double porezrad) {
        this.porezrad = porezrad;
    }

    public Double getPorDeo() {
        return porDeo;
    }

    public void setPorDeo(Double porDeo) {
        this.porDeo = porDeo;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public Double getTaxaRad() {
        return taxaRad;
    }

    public void setTaxaRad(Double taxaRad) {
        this.taxaRad = taxaRad;
    }

    public Double getTaxaDeo() {
        return taxaDeo;
    }

    public void setTaxaDeo(Double taxaDeo) {
        this.taxaDeo = taxaDeo;
    }

    public Double getSavPor() {
        return savPor;
    }

    public void setSavPor(Double savPor) {
        this.savPor = savPor;
    }

    public Double getSavPoru() {
        return savPoru;
    }

    public void setSavPoru(Double savPoru) {
        this.savPoru = savPoru;
    }

    public Double getUkupno() {
        return ukupno;
    }

    public void setUkupno(Double ukupno) {
        this.ukupno = ukupno;
    }

    public String getUradi() {
        return uradi;
    }

    public void setUradi(String uradi) {
        this.uradi = uradi;
    }

    public String getUradjeno() {
        return uradjeno;
    }

    public void setUradjeno(String uradjeno) {
        this.uradjeno = uradjeno;
    }

    public String getStorno() {
        return storno;
    }

    public void setStorno(String storno) {
        this.storno = storno;
    }

    public String getNapkupac() {
        return napkupac;
    }

    public void setNapkupac(String napkupac) {
        this.napkupac = napkupac;
    }

    public Boolean getPrinted() {
        return printed;
    }

    public void setPrinted(Boolean printed) {
        this.printed = printed;
    }

    public String getTipnal() {
        return tipnal;
    }

    public void setTipnal(String tipnal) {
        this.tipnal = tipnal;
    }

    public String getFist() {
        return fist;
    }

    public void setFist(String fist) {
        this.fist = fist;
    }

    public String getIsporuka() {
        return isporuka;
    }

    public void setIsporuka(String isporuka) {
        this.isporuka = isporuka;
    }

    public Double getTudjiPdv() {
        return tudjiPdv;
    }

    public void setTudjiPdv(Double tudjiPdv) {
        this.tudjiPdv = tudjiPdv;
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
        if (!(object instanceof Nald001)) {
            return false;
        }
        Nald001 other = (Nald001) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public synchronized String toString() {
        return "\n"
                + getRadnal() + "/" + getBrFakt()
                + "\n  stranka: " + getKupac()
                + "\n  naziv: " + getIme() + ", " + getPrezime()
                + "\n  vozilo: " + getFamilija()
                + "\n  marka: " + getMarka()
                + "\n  šasija: " + getSasija()
                + "\n  reg. broj : " + getRegistrac()
                + "\n_______________________________________________________________________________________________"
                + "\n      opis radova: " + getUradi()
                + "\n_______________________________________________________________________________________________"
                + "\n     datum naloga: " + getDatnal()
                + "\n     ,zatvoren: " + getZatvoren()
                + "\n     ,fakturisan: " + getFakturisan()
                + "\n     ,radovi : " + getRad() + ",popust " + getRabSat()
                + "\n     ,materijal : " + getMaterijal() + ",popust " + getRabMat()
                + "\n     ,ukupno : " + Double.toString(getRad() + getMaterijal() - getRabMat() - getRabSat())
                + "\n";
    }
}
