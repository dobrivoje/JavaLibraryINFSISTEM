/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package INFSYS.Queries;

import INFSYS.Adapt.Kategorije;
import INFSYS.Adapt.Kategorije.ServisniSavetnik;
import ent.infsistem.Nald001;
import ent.infsistem.Radn001;
import ent.infsistem.Sifarnik;
import INFSYS.BusinessBeans.DnevnoFA_UK;
import INFSYS.BusinessBeans.SSavetnikPerformanse;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLTimeoutException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author dobri
 */
public class INFSistemQuery {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaLibraryINFSISTEM_PU");
    private static final EntityManager em = emf.createEntityManager();

    /**
     *
     * static synchronized EntityManager getEm() throws NullPointerException,
     * Exception kontrolisanje postojanja konekcije sa Persistent blokom !
     *
     * @return
     * @throws java.lang.Exception
     */
    public static synchronized EntityManager getEm() throws NullPointerException, Exception {
        return em;
    }

    //<editor-fold defaultstate="collapsed" desc="Radni Nalozi i Fakture">
    public static synchronized List<Nald001> pretragaPoFakturi(String faktura) {
        try {
            return getEm().createNamedQuery("Nald001.findByBrFakt")
                    .setParameter("brFakt", faktura)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> pretragaPoRadnomNalogu(String radniNalog) {
        try {
            return getEm().createNamedQuery("Nald001.findByRadnal")
                    .setParameter("radnal", radniNalog)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> RNPoDelimicnomOpisu(String delimicanOpis) {
        Nald001 nalog;
        List<Nald001> lista = new ArrayList<>();

        try {
            if (!getEm().getTransaction().isActive()) {
                getEm().getTransaction().begin();
            }

            Connection c = getEm().unwrap(java.sql.Connection.class);
            CallableStatement cs = c.prepareCall("{call [dbo].[RNPoDelimicnomOpisu](?)}");
            ResultSet rs = cs.executeQuery();

            cs.setQueryTimeout(1);

            cs.setString(1, delimicanOpis);

            while (rs.next()) {
                nalog = new Nald001();

                nalog.setRadnal(rs.getString(6));
                nalog.setDatum(rs.getString(9));

                lista.add(nalog);
                nalog = null;
            }

            cs.execute();
            em.getTransaction().commit();

            return lista;

        } catch (SQLTimeoutException e1) {
            em.getTransaction().rollback();
            return null;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return null;
        } finally {
            try {
                getEm().flush();
                getEm().close();
            } catch (Exception ex) {
            }
        }
    }

    public static synchronized List<Nald001> RNPoDelimicnomOpisu2(String delimicanOpis) {
        try {
            return getEm().createNamedQuery("Nald001.DelimicanOpisRadova")
                    .setParameter("DelimicanOpisRadova", "%" + delimicanOpis + "%")
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNalozi_U_Periodu(String DatumOD, String DatumDO) {
        try {
            return getEm().createNamedQuery("Nald001.RN_ZA_PERIOD")
                    .setParameter("datumOD", DatumOD)
                    .setParameter("datumDO", DatumDO)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> pretraga_RN_Faktura(String rn_fakt, boolean radniNalog) {
        return (radniNalog
                ? pretragaPoRadnomNalogu(rn_fakt)
                : pretragaPoFakturi(rn_fakt));
    }

    public static synchronized List<Nald001> pretraga_Storno_Faktura(String rn_fakt) {
        return pretraga_RN_Faktura(rn_fakt, false);
    }

    public static synchronized List<Nald001> storno_Fakture_ZaPeriod(String DatumOD, String DatumDO) {
        try {
            return getEm().createNamedQuery("Nald001.STORNA_U_PERIODU")
                    .setParameter("datumOD", DatumOD)
                    .setParameter("datumDO", DatumDO)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> storno_Fakture_ZaPeriod(int Godina, int Mesec) {
        try {
            return getEm().createNamedQuery("Nald001.STORNO_FAKTURE_GODINA_MESEC")
                    .setParameter("Godina", Godina)
                    .setParameter("Mesec", Mesec)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> fakture_ZaPeriod(String DatumOD, String DatumDO) {
        try {
            return getEm().createNamedQuery("Nald001.FAKTURE_ZA_PERIOD")
                    .setParameter("datumOD", DatumOD)
                    .setParameter("datumDO", DatumDO)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> fakture_ZaPeriod(int Godina, int Mesec) {
        try {
            return getEm().createNamedQuery("Nald001.FAKTURE_GODINA_MESEC")
                    .setParameter("Godina", Godina)
                    .setParameter("Mesec", Mesec)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized Nald001 radniNalogDetalji(String radniNalog) {
        try {
            return (Nald001) getEm().createNamedQuery("Nald001.findByRadnal")
                    .setParameter("radnal", radniNalog)
                    .getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNaloziZaSasiju(String sasija) {
        try {
            return getEm().createNamedQuery("Nald001.findBySasija")
                    .setParameter("sasija", sasija)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNaloziDelimicnaSasija(String sasija) {
        try {
            return getEm().createNamedQuery("Nald001.DelimicnaSasija")
                    .setParameter("delimicnaSasija", "%" + sasija + "%")
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNaloziZaSifruKupca(String kupac) {
        try {
            return getEm().createNamedQuery("Nald001.findByKupac")
                    .setParameter("kupac", kupac)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNaloziZaRegistraciju(String registracija) {
        try {
            return getEm().createNamedQuery("Nald001.findByRegistracija")
                    .setParameter("registrac", registracija)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNaloziDelimicnaRegistracija(String registracija) {
        try {
            return getEm().createNamedQuery("Nald001.RegistracijaDelimicna")
                    .setParameter("delimicnaRegistracija", "%" + registracija + "%")
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> radniNaloziZaDatum(String datum) {
        try {
            return getEm().createNamedQuery("Nald001.findByDatum")
                    .setParameter("datum", datum)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> faktureZaDatum(String datum) {
        try {
            return getEm().createNamedQuery("Nald001.faktureZaDatum")
                    .setParameter("datum", datum)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Broj Radnih Naloga za zadati datum
     *
     * @param datum
     * @return int
     */
    public static synchronized int BR_RN_ZaDatum(String datum) {
        try {
            return ((Number) getEm().createNamedQuery("Nald001.BrojRN_ZaDatum")
                    .setParameter("Datum", datum)
                    .getSingleResult()).intValue();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     * Broj Faktura za zadati datum
     *
     * @param datum
     * @return int
     */
    public static int BR_FA_ZaDatum(String datum) {
        try {
            return ((Number) getEm().createNamedQuery("Nald001.BrojFA_ZaDatum")
                    .setParameter("Datum", datum)
                    .getSingleResult()).intValue();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     * Broj Storno Faktura za zadati datum
     *
     * @param datum
     * @return int
     */
    public static int BR_STFA_ZaDatum(String datum) {
        try {
            return ((Number) getEm().createNamedQuery("Nald001.BrojSTFA_ZaDatum")
                    .setParameter("Datum", datum)
                    .getSingleResult()).intValue();
        } catch (Exception ex) {
            return 0;
        }
    }

    /**
     *
     * @param Datum
     * @param TipRN: 1-RN, 2-FA, 3-ST.FA
     * @return
     * @throws ParseException
     */
    public static Map<Integer, Integer> Br_RNFA_Mesec_LineChartData(String Datum, int TipRN) throws ParseException {
        // TreeMap koristimo zbog sortiranja !
        Map<Integer, Integer> tmp = new TreeMap<>();
        Integer brRNFA = 0;

        Calendar calendarOD = Calendar.getInstance();
        Calendar calendarDO = Calendar.getInstance();

        calendarOD.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(Datum));

        int god = calendarOD.get(Calendar.YEAR);
        int mesec = calendarOD.get(Calendar.MONTH);

        final int pocetniDanUMesecu = 1;
        // poslednji dan u mescu !!!
        int poslednjiDanUMesecu = calendarOD.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendarOD.set(god, mesec, pocetniDanUMesecu);
        // calendarDO.set(god, mesec, poslednjiDanUMesecu);

        Date trenutniDatum;
        String datumStrD;

        for (int dan = pocetniDanUMesecu; dan <= poslednjiDanUMesecu; dan++) {
            calendarDO.set(god, mesec, dan);
            trenutniDatum = new Date(calendarDO.getTime().getTime());
            datumStrD = new SimpleDateFormat("yyyy-MM-dd").format(trenutniDatum);

            switch (TipRN) {
                case 2:
                    brRNFA = BR_FA_ZaDatum(datumStrD);
                    break;
                case 3:
                    brRNFA = BR_STFA_ZaDatum(datumStrD);
                    break;
                case 1:
                default:
                    brRNFA = BR_RN_ZaDatum(datumStrD);
                    break;
            }

            tmp.put(dan, brRNFA);
        }

        return tmp;
    }

    /**
     *
     * @param Godina
     * @param Mesec
     * @param TipRN
     * @return
     * @throws ParseException
     */
    public static Map<Integer, Integer> Br_RNFA_Mesec_LineChartData(int Godina, int Mesec, int TipRN) throws ParseException {
        // TreeMap koristimo zbog sortiranja !
        Map<Integer, Integer> tmp = new TreeMap<>();
        Integer brRNFA = 0;

        Calendar calendarOD = Calendar.getInstance();
        Calendar calendarDO = Calendar.getInstance();

        final int pocetniDanUMesecu = 1;
        // poslednji dan u mescu !!!
        int poslednjiDanUMesecu = calendarOD.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendarOD.set(Godina, Mesec, pocetniDanUMesecu);
        // calendarDO.set(god, mesec, poslednjiDanUMesecu);

        Date trenutniDatum;
        String datumStrD;

        for (int dan = pocetniDanUMesecu; dan <= poslednjiDanUMesecu; dan++) {
            calendarDO.set(Godina, Mesec, dan);
            trenutniDatum = new Date(calendarDO.getTime().getTime());
            datumStrD = new SimpleDateFormat("yyyy-MM-dd").format(trenutniDatum);

            switch (TipRN) {
                case 2:
                    brRNFA = BR_FA_ZaDatum(datumStrD);
                    break;
                case 3:
                    brRNFA = BR_STFA_ZaDatum(datumStrD);
                    break;
                case 1:
                default:
                    brRNFA = BR_RN_ZaDatum(datumStrD);
                    break;
            }

            tmp.put(dan, brRNFA);
        }

        return tmp;
    }

    /**
     * Godišnji izveštaj o mesečnom prometu u vrednosti radova i materijala.
     *
     * @param Godina
     * @return
     */
    public static List<Map<Integer, Integer>> finansijskiAspekt_GodisnjiPregled_RadMat(int Godina) {
        Map<Integer, Integer> finMesecSati = new TreeMap<>();
        Map<Integer, Integer> finMesecMaterijal = new TreeMap<>();
        List<Map<Integer, Integer>> serija = new ArrayList<>(2);

        finMesecSati.putAll(fin_Radovi_ZaPeriod(Godina));
        finMesecMaterijal.putAll(fin_Materijal_ZaPeriod(Godina));

        serija.add(finMesecSati);
        serija.add(finMesecMaterijal);

        return serija;
    }

    /**
     * Godišnji izveštaj o mesečnom storniranju u vrednosti radova i materijala.
     *
     * @param Godina
     * @return
     */
    public static List<Map<Integer, Integer>> finansijskiAspekt_GodisnjiPregled_Storno(int Godina) {
        Map<Integer, Integer> finMesecSati = new TreeMap<>();
        Map<Integer, Integer> finMesecMaterijal = new TreeMap<>();
        List<Map<Integer, Integer>> serija = new ArrayList<>(2);

        finMesecSati.putAll(fin_Storno_Radovi_ZaPeriod(Godina));
        finMesecMaterijal.putAll(fin_Storno_Materijal_ZaPeriod(Godina));

        serija.add(finMesecSati);
        serija.add(finMesecMaterijal);

        return serija;
    }

    /**
     * fin_Radovi_ZaPeriod(int Godina) VEOMA BRZO IZRAČUNAVAJU ODGOVOR ZA
     * RAZLIKU OD finansijskiAspekt_GodisnjiPregled
     *
     * @param Godina
     * @return
     */
    public static synchronized Map<Integer, Integer> fin_Radovi_ZaPeriod(int Godina) {
        Map<Integer, Integer> fs = new TreeMap<>();
        List<Double> radovi;

        try {
            radovi = new ArrayList<>(
                    getEm().createNamedQuery("Nald001.RAD_ZA_PERIOD")
                    .setParameter("Godina", Godina)
                    .getResultList()
            );

            int mesec = 1;
            for (Double ukRad : radovi) {
                fs.put(mesec++, ukRad.intValue());
            }

            return fs;

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * fin_Materijal_ZaPeriod(int Godina) VEOMA BRZO IZRAČUNAVAJU ODGOVOR ZA
     * RAZLIKU OD finansijskiAspekt_GodisnjiPregled
     *
     * @param Godina
     * @return
     */
    public static synchronized Map<Integer, Integer> fin_Materijal_ZaPeriod(int Godina) {
        Map<Integer, Integer> fm = new TreeMap<>();
        List<Double> mat;

        try {
            mat = new ArrayList<>(
                    getEm().createNamedQuery("Nald001.MATERIJAL_ZA_PERIOD")
                    .setParameter("Godina", Godina)
                    .getResultList()
            );

            int mesec = 1;
            for (Double ukMaterijal : mat) {
                fm.put(mesec++, ukMaterijal.intValue());
            }

            return fm;

        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized Map<Integer, Integer> fin_Storno_Radovi_ZaPeriod(int Godina) {
        Map<Integer, Integer> fs = new TreeMap<>();
        List<Double> radovi;

        try {
            radovi = new ArrayList<>(
                    getEm().createNamedQuery("Nald001.STORNO_RAD_ZA_PERIOD")
                    .setParameter("Godina", Godina)
                    .getResultList()
            );

            int mesec = 1;
            for (Double ukRad : radovi) {
                fs.put(mesec++, -1 * ukRad.intValue());
            }

            return fs;

        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized Map<Integer, Integer> fin_Storno_Materijal_ZaPeriod(int Godina) {
        Map<Integer, Integer> fm = new TreeMap<>();
        List<Double> mat;

        try {
            mat = new ArrayList<>(
                    getEm().createNamedQuery("Nald001.STORNO_MATERIJAL_ZA_PERIOD")
                    .setParameter("Godina", Godina)
                    .getResultList()
            );

            int mesec = 1;
            for (Double ukMaterijal : mat) {
                fm.put(mesec++, -1 * ukMaterijal.intValue());
            }

            return fm;
        } catch (Exception ex) {
            return null;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="ŠIFARNIK">
    public static List<Sifarnik> SveSifre() {
        try {
            return getEm().createNamedQuery("Sifarnik.findAll")
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized Sifarnik KupacPoSifri(int sifra) throws NullPointerException, NoResultException {
        try {
            return (Sifarnik) getEm().createNamedQuery("Sifarnik.findByKupac")
                    .setParameter("kupac", sifra)
                    .getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Sifarnik> KupacPoPIB(String pib) {
        try {
            return getEm().createNamedQuery("Sifarnik.findByPib")
                    .setParameter("pib", pib)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized Sifarnik KupacPoMatBr(String matbr)
            throws NullPointerException, NoResultException, Exception {
        return (Sifarnik) getEm().createNamedQuery("Sifarnik.findByMatbr")
                .setParameter("matbr", matbr)
                .getSingleResult();
    }

    public static synchronized List<Sifarnik> KupciPoNazivu(String Naziv) {
        try {
            return getEm().createNamedQuery("Sifarnik.DelimicanNaziv")
                    .setParameter("Naziv", "%" + Naziv + "%")
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Vozila i Servisi Klijenta">
    public static synchronized List<String> VozilaKlijenta(String sifra) {
        try {
            return getEm().createNamedQuery("Nald001.VozilaKlijenta")
                    .setParameter("kupac", sifra)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<Nald001> VozilaKlijenta2(String sifraKupca) {
        try {
            return getEm().createNamedQuery("Nald001.SasijaNalogKlijenta")
                    .setParameter("Kupac", sifraKupca)
                    .getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    public static synchronized List<String> VozilaKlijenta(int sifra) {
        int duzinaSifreINFSISTEM = 6;
        String novaSifra = "000000";

        novaSifra += Integer.toString(sifra);
        novaSifra = novaSifra.substring(novaSifra.length() - duzinaSifreINFSISTEM);

        return VozilaKlijenta(novaSifra);
    }

    public static synchronized List<Nald001> VozilaKlijentaPoDatumu(String sifra, String DatumOD, String DatumDO) throws Exception {
        if (DatumOD.isEmpty() || DatumDO.isEmpty()) {
            throw new Exception("Moraju Se Uneti Datumi.");
        } else {
            return getEm().createNamedQuery("Nald001.NaloziKlijentaPoDatumu")
                    .setParameter("kupac", sifra)
                    .setParameter("pocDatum", DatumOD)
                    .setParameter("krajnjiDatum", DatumDO)
                    .getResultList();
        }
    }

    public static synchronized List<Nald001> VozilaKlijentaPoDatumu(int sifra, String DatumOD, String DatumDO) throws Exception {
        if (DatumOD.isEmpty() || DatumDO.isEmpty()) {
            throw new Exception("Moraju Se Uneti Datumi.");
        } else {
            int duzinaSifreINFSISTEM = 6;
            String novaSifra = "000000";

            novaSifra += Integer.toString(sifra);
            novaSifra = novaSifra.substring(novaSifra.length() - duzinaSifreINFSISTEM);

            return VozilaKlijentaPoDatumu(novaSifra, DatumOD, DatumDO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Radnik">
    public static Radn001 Radnik(String Sifra) {
        try {
            return (Radn001) getEm().createNamedQuery("Radn001.findByRadnik")
                    .setParameter("radnik", Sifra)
                    .getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static List<SSavetnikPerformanse> SSavetnikPerformanse(int Godina, int Mesec) {
        try {
            return getEm().createNamedQuery("INFSIS.SSavetnikPerformanse")
                    .setParameter("Godina", Godina)
                    .setParameter("Mesec", Mesec)
                    .getResultList();

        } catch (Exception e) {
            return null;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="JavaFX Queries">
    // FINANSIJSKI DEO
    public static Map<Integer, DnevnoFA_UK> Mesec_DnevnoFA_UK(int Godina, int Mesec) {
        Map<Integer, DnevnoFA_UK> finalnaMapa = new TreeMap<>(DnevnoFA_UK.getDaniMesecInitMap(Godina, Mesec));
        List<DnevnoFA_UK> dnevnaLista;

        try {
            dnevnaLista = getEm()
                    .createNamedQuery("INFSIS.MesecPoDanimaRadMaterijal")
                    .setParameter("Godina", Godina)
                    .setParameter("Mesec", Mesec)
                    .getResultList();

            for (DnevnoFA_UK d : dnevnaLista) {
                finalnaMapa.put((Integer) d.getDay(), d);
            }

            return finalnaMapa;

        } catch (Exception e) {
            return null;
        }
    }

    public static List<Map<Integer, Integer>> Mesec_DnevnoFA_UK_Serije(int Godina, int Mesec) {
        List<Map<Integer, Integer>> serija = new ArrayList<>(2);
        Map<Integer, Integer> s[] = new TreeMap[2];

        for (int i = 0; i < s.length; i++) {
            s[i] = new TreeMap<>();

            for (Map.Entry<Integer, DnevnoFA_UK> e : Mesec_DnevnoFA_UK(Godina, Mesec).entrySet()) {
                // e.getKey() -> Dan ! (int) e.getValue() -> Rad i Materijal RESPEKTIVNO !!
                s[i].put(e.getKey(), (i == 0 ? e.getValue().getRad() : e.getValue().getMaterijal()));
            }

            serija.add(s[i]);
        }

        return serija;
    }

    /**
     * OSNOVA ZA DALJE FX metode ISPOD !!!
     *
     * @param Godina
     * @param Mesec
     *
     * @return Map<Object, Integer> -> 1. Serija - Radovi, 2. Serija - Materijal
     */
    public static List<Map<Object, Integer>> Mesec_Svi_SSavetnici_Performanse_Serije_Base(int Godina, int Mesec) {
        List<Map<Object, Integer>> listaSerija = new ArrayList<>(2);
        Map<Object, Integer> serija[] = new TreeMap[2];

        for (int i = 0; i < serija.length; i++) {
            serija[i] = new TreeMap<>();

            for (SSavetnikPerformanse e : SSavetnikPerformanse(Godina, Mesec)) {
                // e.getKey() -> Dan ! (int) e.getValue() -> ID SSavetnika i Materijal RESPEKTIVNO !!
                serija[i].put(e.getImeIPrezime(), (i == 0 ? e.getRad() : e.getDelovi()));
            }

            listaSerija.add(serija[i]);
        }

        return listaSerija;
    }

    /**
     * FINANSIJSKI DEO - ZA SERVISNE SAVETNIKE !
     *
     * @param Godina
     * @param Mesec
     *
     * @return Map<Integer, Integer> -> ID Savetnika, Ukupno
     */
    public static Map<Integer, Integer> Mesec_Svi_SSavetnici_Performanse_Ukupno(int Godina, int Mesec) {
        Map<Integer, Integer> m = new TreeMap<>();

        for (SSavetnikPerformanse ssavetnik : SSavetnikPerformanse(Godina, Mesec)) {
            m.put(ssavetnik.getIntID(), ssavetnik.getUkupno());
        }

        return m;
    }

    /**
     *
     * @param Godina
     * @param Mesec
     *
     * @return Map<Integer, Integer> -> ID Savetnika, 1. Serija - Radovi, 2.
     * Serija - Materijal
     */
    public static List<Map<Integer, Integer>> Mesec_Svi_SSavetnici_Performanse_Serije(int Godina, int Mesec) {
        List<Map<Integer, Integer>> listaSerija = new ArrayList<>(2);
        Map<Integer, Integer> serija[] = new TreeMap[2];

        for (int i = 0; i < serija.length; i++) {
            serija[i] = new TreeMap<>();

            int ID = 0;
            for (SSavetnikPerformanse e : SSavetnikPerformanse(Godina, Mesec)) {
                // e.getKey() -> Dan ! (int) e.getValue() -> ID SSavetnika i Materijal RESPEKTIVNO !!
                // serija[i].put(e.getIntID(), (i == 0 ? e.getRad() : e.getDelovi()));
                serija[i].put(++ID, (i == 0 ? e.getRad() : e.getDelovi()));
            }

            listaSerija.add(serija[i]);
            ID = 0;
        }

        return listaSerija;
    }

    /**
     *
     * @param Godina
     * @param Mesec
     * @param SSTip
     *
     * @return Map<String, Integer> -> Radnik, 1. Serija - Rad, 2. Serija -
     * Materijal ! Serija - Materijal
     */
    public static List<Map<String, Integer>> Mesec_Svi_SSavetnici_Performanse_Serije_Cat(int Godina, int Mesec, ServisniSavetnik SSTip) {
        List<Map<String, Integer>> listaSerija = new ArrayList<>(2);
        Map<String, Integer> serija[] = new TreeMap[2];

        for (int i = 0; i < serija.length; i++) {
            serija[i] = new TreeMap<>();

            for (SSavetnikPerformanse e : SSavetnikPerformanse(Godina, Mesec)) {
                // e.getKey() -> Dan ! (int) e.getValue() -> ID SSavetnika i Materijal RESPEKTIVNO !!
                serija[i].put(SSTip == Kategorije.ServisniSavetnik.IDINFSYSTEM ? e.getID() : e.getImeIPrezime(), (i == 0 ? e.getRad() : e.getDelovi()));
            }

            listaSerija.add(serija[i]);
        }

        return listaSerija;
    }

    //</editor-fold>
}
