/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ent.infsistem;

import java.beans.*;

/**
 *
 * @author dobri
 */
public class Nald001BeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( ent.infsistem.Nald001.class , null ); // NOI18N
        beanDescriptor.setHidden ( true );//GEN-HEADEREND:BeanDescriptor

        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor
    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_adresa = 0;
    private static final int PROPERTY_akontacija = 1;
    private static final int PROPERTY_antifriz = 2;
    private static final int PROPERTY_brFakt = 3;
    private static final int PROPERTY_brProf = 4;
    private static final int PROPERTY_datDpo = 5;
    private static final int PROPERTY_datnal = 6;
    private static final int PROPERTY_datPren = 7;
    private static final int PROPERTY_datProf = 8;
    private static final int PROPERTY_datum = 9;
    private static final int PROPERTY_fakturisan = 10;
    private static final int PROPERTY_familija = 11;
    private static final int PROPERTY_fist = 12;
    private static final int PROPERTY_GProiz = 13;
    private static final int PROPERTY_id = 14;
    private static final int PROPERTY_ime = 15;
    private static final int PROPERTY_isporuka = 16;
    private static final int PROPERTY_istice = 17;
    private static final int PROPERTY_km = 18;
    private static final int PROPERTY_kupac = 19;
    private static final int PROPERTY_marka = 20;
    private static final int PROPERTY_matBroj = 21;
    private static final int PROPERTY_materijal = 22;
    private static final int PROPERTY_mesto = 23;
    private static final int PROPERTY_motor = 24;
    private static final int PROPERTY_nalog = 25;
    private static final int PROPERTY_nalogdavac = 26;
    private static final int PROPERTY_napkupac = 27;
    private static final int PROPERTY_opcija = 28;
    private static final int PROPERTY_oslobodjen = 29;
    private static final int PROPERTY_p2 = 30;
    private static final int PROPERTY_pcentar = 31;
    private static final int PROPERTY_pcentar1 = 32;
    private static final int PROPERTY_placa = 33;
    private static final int PROPERTY_porDeo = 34;
    private static final int PROPERTY_porezrad = 35;
    private static final int PROPERTY_prezime = 36;
    private static final int PROPERTY_primio = 37;
    private static final int PROPERTY_printed = 38;
    private static final int PROPERTY_rabMat = 39;
    private static final int PROPERTY_rabSat = 40;
    private static final int PROPERTY_rad = 41;
    private static final int PROPERTY_radnal = 42;
    private static final int PROPERTY_registrac = 43;
    private static final int PROPERTY_sasija = 44;
    private static final int PROPERTY_savPor = 45;
    private static final int PROPERTY_savPoru = 46;
    private static final int PROPERTY_sprovodni = 47;
    private static final int PROPERTY_storno = 48;
    private static final int PROPERTY_taxaDeo = 49;
    private static final int PROPERTY_taxaRad = 50;
    private static final int PROPERTY_telefon = 51;
    private static final int PROPERTY_timPren = 52;
    private static final int PROPERTY_tip = 53;
    private static final int PROPERTY_tipnal = 54;
    private static final int PROPERTY_tudjiOpis = 55;
    private static final int PROPERTY_tudjiPdv = 56;
    private static final int PROPERTY_tudjiRad = 57;
    private static final int PROPERTY_ugovor = 58;
    private static final int PROPERTY_ukupno = 59;
    private static final int PROPERTY_uradi = 60;
    private static final int PROPERTY_uradjeno = 61;
    private static final int PROPERTY_val = 62;
    private static final int PROPERTY_vrdok = 63;
    private static final int PROPERTY_vrRada = 64;
    private static final int PROPERTY_zatvoren = 65;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[66];
    
        try {
            properties[PROPERTY_adresa] = new PropertyDescriptor ( "adresa", ent.infsistem.Nald001.class, "getAdresa", null ); // NOI18N
            properties[PROPERTY_adresa].setPreferred ( true );
            properties[PROPERTY_adresa].setDisplayName ( "Adresa" );
            properties[PROPERTY_akontacija] = new PropertyDescriptor ( "akontacija", ent.infsistem.Nald001.class, "getAkontacija", null ); // NOI18N
            properties[PROPERTY_akontacija].setHidden ( true );
            properties[PROPERTY_antifriz] = new PropertyDescriptor ( "antifriz", ent.infsistem.Nald001.class, "getAntifriz", null ); // NOI18N
            properties[PROPERTY_antifriz].setHidden ( true );
            properties[PROPERTY_brFakt] = new PropertyDescriptor ( "brFakt", ent.infsistem.Nald001.class, "getBrFakt", null ); // NOI18N
            properties[PROPERTY_brFakt].setPreferred ( true );
            properties[PROPERTY_brFakt].setDisplayName ( "Broj Fakture" );
            properties[PROPERTY_brProf] = new PropertyDescriptor ( "brProf", ent.infsistem.Nald001.class, "getBrProf", null ); // NOI18N
            properties[PROPERTY_brProf].setDisplayName ( "Broj Profakture" );
            properties[PROPERTY_datDpo] = new PropertyDescriptor ( "datDpo", ent.infsistem.Nald001.class, "getDatDpo", null ); // NOI18N
            properties[PROPERTY_datDpo].setDisplayName ( "Datum Deponovanja" );
            properties[PROPERTY_datnal] = new PropertyDescriptor ( "datnal", ent.infsistem.Nald001.class, "getDatnal", null ); // NOI18N
            properties[PROPERTY_datnal].setHidden ( true );
            properties[PROPERTY_datPren] = new PropertyDescriptor ( "datPren", ent.infsistem.Nald001.class, "getDatPren", null ); // NOI18N
            properties[PROPERTY_datPren].setHidden ( true );
            properties[PROPERTY_datPren].setDisplayName ( "Datum Prenosa" );
            properties[PROPERTY_datProf] = new PropertyDescriptor ( "datProf", ent.infsistem.Nald001.class, "getDatProf", null ); // NOI18N
            properties[PROPERTY_datProf].setDisplayName ( "Datum Profakture" );
            properties[PROPERTY_datum] = new PropertyDescriptor ( "datum", ent.infsistem.Nald001.class, "getDatum", null ); // NOI18N
            properties[PROPERTY_datum].setDisplayName ( "Datum Naloga" );
            properties[PROPERTY_fakturisan] = new PropertyDescriptor ( "fakturisan", ent.infsistem.Nald001.class, "getFakturisan", null ); // NOI18N
            properties[PROPERTY_fakturisan].setDisplayName ( "Datum Fakturisanja" );
            properties[PROPERTY_familija] = new PropertyDescriptor ( "familija", ent.infsistem.Nald001.class, "getFamilija", null ); // NOI18N
            properties[PROPERTY_familija].setDisplayName ( "Familija" );
            properties[PROPERTY_fist] = new PropertyDescriptor ( "fist", ent.infsistem.Nald001.class, "getFist", null ); // NOI18N
            properties[PROPERTY_fist].setDisplayName ( "Fiskalini Račun" );
            properties[PROPERTY_GProiz] = new PropertyDescriptor ( "GProiz", ent.infsistem.Nald001.class, "getGProiz", null ); // NOI18N
            properties[PROPERTY_GProiz].setDisplayName ( "God. Proizvodnje" );
            properties[PROPERTY_id] = new PropertyDescriptor ( "id", ent.infsistem.Nald001.class, "getId", null ); // NOI18N
            properties[PROPERTY_id].setHidden ( true );
            properties[PROPERTY_ime] = new PropertyDescriptor ( "ime", ent.infsistem.Nald001.class, "getIme", null ); // NOI18N
            properties[PROPERTY_ime].setDisplayName ( "Ime" );
            properties[PROPERTY_isporuka] = new PropertyDescriptor ( "isporuka", ent.infsistem.Nald001.class, "getIsporuka", null ); // NOI18N
            properties[PROPERTY_isporuka].setHidden ( true );
            properties[PROPERTY_istice] = new PropertyDescriptor ( "istice", ent.infsistem.Nald001.class, "getIstice", null ); // NOI18N
            properties[PROPERTY_istice].setHidden ( true );
            properties[PROPERTY_km] = new PropertyDescriptor ( "km", ent.infsistem.Nald001.class, "getKm", null ); // NOI18N
            properties[PROPERTY_km].setDisplayName ( "KM." );
            properties[PROPERTY_kupac] = new PropertyDescriptor ( "kupac", ent.infsistem.Nald001.class, "getKupac", null ); // NOI18N
            properties[PROPERTY_kupac].setDisplayName ( "Šifra Kupca" );
            properties[PROPERTY_marka] = new PropertyDescriptor ( "marka", ent.infsistem.Nald001.class, "getMarka", null ); // NOI18N
            properties[PROPERTY_marka].setDisplayName ( "Marka" );
            properties[PROPERTY_matBroj] = new PropertyDescriptor ( "matBroj", ent.infsistem.Nald001.class, "getMatBroj", null ); // NOI18N
            properties[PROPERTY_materijal] = new PropertyDescriptor ( "materijal", ent.infsistem.Nald001.class, "getMaterijal", null ); // NOI18N
            properties[PROPERTY_materijal].setDisplayName ( "Materijal" );
            properties[PROPERTY_mesto] = new PropertyDescriptor ( "mesto", ent.infsistem.Nald001.class, "getMesto", null ); // NOI18N
            properties[PROPERTY_mesto].setDisplayName ( "Mesto" );
            properties[PROPERTY_motor] = new PropertyDescriptor ( "motor", ent.infsistem.Nald001.class, "getMotor", null ); // NOI18N
            properties[PROPERTY_motor].setDisplayName ( "Motor" );
            properties[PROPERTY_nalog] = new PropertyDescriptor ( "nalog", ent.infsistem.Nald001.class, "getNalog", null ); // NOI18N
            properties[PROPERTY_nalog].setHidden ( true );
            properties[PROPERTY_nalogdavac] = new PropertyDescriptor ( "nalogdavac", ent.infsistem.Nald001.class, "getNalogdavac", null ); // NOI18N
            properties[PROPERTY_nalogdavac].setHidden ( true );
            properties[PROPERTY_napkupac] = new PropertyDescriptor ( "napkupac", ent.infsistem.Nald001.class, "getNapkupac", null ); // NOI18N
            properties[PROPERTY_napkupac].setHidden ( true );
            properties[PROPERTY_opcija] = new PropertyDescriptor ( "opcija", ent.infsistem.Nald001.class, "getOpcija", null ); // NOI18N
            properties[PROPERTY_opcija].setHidden ( true );
            properties[PROPERTY_oslobodjen] = new PropertyDescriptor ( "oslobodjen", ent.infsistem.Nald001.class, "getOslobodjen", null ); // NOI18N
            properties[PROPERTY_oslobodjen].setHidden ( true );
            properties[PROPERTY_p2] = new PropertyDescriptor ( "p2", ent.infsistem.Nald001.class, "getP2", null ); // NOI18N
            properties[PROPERTY_p2].setHidden ( true );
            properties[PROPERTY_pcentar] = new PropertyDescriptor ( "pcentar", ent.infsistem.Nald001.class, "getPcentar", null ); // NOI18N
            properties[PROPERTY_pcentar].setDisplayName ( "Profitni Centar" );
            properties[PROPERTY_pcentar1] = new PropertyDescriptor ( "pcentar1", ent.infsistem.Nald001.class, "getPcentar1", null ); // NOI18N
            properties[PROPERTY_pcentar1].setDisplayName ( "Profitni Centar." );
            properties[PROPERTY_placa] = new PropertyDescriptor ( "placa", ent.infsistem.Nald001.class, "getPlaca", null ); // NOI18N
            properties[PROPERTY_placa].setHidden ( true );
            properties[PROPERTY_porDeo] = new PropertyDescriptor ( "porDeo", ent.infsistem.Nald001.class, "getPorDeo", null ); // NOI18N
            properties[PROPERTY_porDeo].setDisplayName ( "Porez Delovi" );
            properties[PROPERTY_porezrad] = new PropertyDescriptor ( "porezrad", ent.infsistem.Nald001.class, "getPorezrad", null ); // NOI18N
            properties[PROPERTY_porezrad].setDisplayName ( "Porez Radovi" );
            properties[PROPERTY_prezime] = new PropertyDescriptor ( "prezime", ent.infsistem.Nald001.class, "getPrezime", null ); // NOI18N
            properties[PROPERTY_prezime].setDisplayName ( "Prezime" );
            properties[PROPERTY_primio] = new PropertyDescriptor ( "primio", ent.infsistem.Nald001.class, "getPrimio", null ); // NOI18N
            properties[PROPERTY_primio].setDisplayName ( "ID Servisnog Savetnika" );
            properties[PROPERTY_printed] = new PropertyDescriptor ( "printed", ent.infsistem.Nald001.class, "getPrinted", null ); // NOI18N
            properties[PROPERTY_printed].setHidden ( true );
            properties[PROPERTY_rabMat] = new PropertyDescriptor ( "rabMat", ent.infsistem.Nald001.class, "getRabMat", null ); // NOI18N
            properties[PROPERTY_rabMat].setDisplayName ( "Popust Na Delove" );
            properties[PROPERTY_rabSat] = new PropertyDescriptor ( "rabSat", ent.infsistem.Nald001.class, "getRabSat", null ); // NOI18N
            properties[PROPERTY_rabSat].setDisplayName ( "Popust Na Radove" );
            properties[PROPERTY_rad] = new PropertyDescriptor ( "rad", ent.infsistem.Nald001.class, "getRad", null ); // NOI18N
            properties[PROPERTY_rad].setDisplayName ( "Cena Radova" );
            properties[PROPERTY_radnal] = new PropertyDescriptor ( "radnal", ent.infsistem.Nald001.class, "getRadnal", null ); // NOI18N
            properties[PROPERTY_radnal].setDisplayName ( "Radni Nalog" );
            properties[PROPERTY_registrac] = new PropertyDescriptor ( "registrac", ent.infsistem.Nald001.class, "getRegistrac", null ); // NOI18N
            properties[PROPERTY_registrac].setDisplayName ( "Registracija" );
            properties[PROPERTY_sasija] = new PropertyDescriptor ( "sasija", ent.infsistem.Nald001.class, "getSasija", null ); // NOI18N
            properties[PROPERTY_sasija].setDisplayName ( "Šasija" );
            properties[PROPERTY_savPor] = new PropertyDescriptor ( "savPor", ent.infsistem.Nald001.class, "getSavPor", null ); // NOI18N
            properties[PROPERTY_savPor].setHidden ( true );
            properties[PROPERTY_savPoru] = new PropertyDescriptor ( "savPoru", ent.infsistem.Nald001.class, "getSavPoru", null ); // NOI18N
            properties[PROPERTY_savPoru].setHidden ( true );
            properties[PROPERTY_sprovodni] = new PropertyDescriptor ( "sprovodni", ent.infsistem.Nald001.class, "getSprovodni", null ); // NOI18N
            properties[PROPERTY_sprovodni].setHidden ( true );
            properties[PROPERTY_storno] = new PropertyDescriptor ( "storno", ent.infsistem.Nald001.class, "getStorno", null ); // NOI18N
            properties[PROPERTY_storno].setHidden ( true );
            properties[PROPERTY_taxaDeo] = new PropertyDescriptor ( "taxaDeo", ent.infsistem.Nald001.class, "getTaxaDeo", null ); // NOI18N
            properties[PROPERTY_taxaDeo].setHidden ( true );
            properties[PROPERTY_taxaRad] = new PropertyDescriptor ( "taxaRad", ent.infsistem.Nald001.class, "getTaxaRad", null ); // NOI18N
            properties[PROPERTY_taxaRad].setHidden ( true );
            properties[PROPERTY_telefon] = new PropertyDescriptor ( "telefon", ent.infsistem.Nald001.class, "getTelefon", null ); // NOI18N
            properties[PROPERTY_telefon].setDisplayName ( "Telefon" );
            properties[PROPERTY_timPren] = new PropertyDescriptor ( "timPren", ent.infsistem.Nald001.class, "getTimPren", null ); // NOI18N
            properties[PROPERTY_timPren].setHidden ( true );
            properties[PROPERTY_tip] = new PropertyDescriptor ( "tip", ent.infsistem.Nald001.class, "getTip", null ); // NOI18N
            properties[PROPERTY_tip].setDisplayName ( "Tip" );
            properties[PROPERTY_tipnal] = new PropertyDescriptor ( "tipnal", ent.infsistem.Nald001.class, "getTipnal", null ); // NOI18N
            properties[PROPERTY_tipnal].setHidden ( true );
            properties[PROPERTY_tudjiOpis] = new PropertyDescriptor ( "tudjiOpis", ent.infsistem.Nald001.class, "getTudjiOpis", null ); // NOI18N
            properties[PROPERTY_tudjiOpis].setDisplayName ( "Opis Radova 3. Lica" );
            properties[PROPERTY_tudjiPdv] = new PropertyDescriptor ( "tudjiPdv", ent.infsistem.Nald001.class, "getTudjiPdv", null ); // NOI18N
            properties[PROPERTY_tudjiPdv].setHidden ( true );
            properties[PROPERTY_tudjiRad] = new PropertyDescriptor ( "tudjiRad", ent.infsistem.Nald001.class, "getTudjiRad", null ); // NOI18N
            properties[PROPERTY_tudjiRad].setDisplayName ( "Radovi 3. Lica" );
            properties[PROPERTY_ugovor] = new PropertyDescriptor ( "ugovor", ent.infsistem.Nald001.class, "getUgovor", null ); // NOI18N
            properties[PROPERTY_ugovor].setHidden ( true );
            properties[PROPERTY_ukupno] = new PropertyDescriptor ( "ukupno", ent.infsistem.Nald001.class, "getUkupno", null ); // NOI18N
            properties[PROPERTY_ukupno].setDisplayName ( "UKUPNO (sa PDV i Popustom)" );
            properties[PROPERTY_uradi] = new PropertyDescriptor ( "uradi", ent.infsistem.Nald001.class, "getUradi", null ); // NOI18N
            properties[PROPERTY_uradi].setDisplayName ( "OPIS" );
            properties[PROPERTY_uradjeno] = new PropertyDescriptor ( "uradjeno", ent.infsistem.Nald001.class, "getUradjeno", null ); // NOI18N
            properties[PROPERTY_uradjeno].setDisplayName ( "OPIS." );
            properties[PROPERTY_val] = new PropertyDescriptor ( "val", ent.infsistem.Nald001.class, "getVal", null ); // NOI18N
            properties[PROPERTY_val].setDisplayName ( "Valuta" );
            properties[PROPERTY_vrdok] = new PropertyDescriptor ( "vrdok", ent.infsistem.Nald001.class, "getVrdok", null ); // NOI18N
            properties[PROPERTY_vrdok].setDisplayName ( "Vrsta Dokumenta" );
            properties[PROPERTY_vrRada] = new PropertyDescriptor ( "vrRada", ent.infsistem.Nald001.class, "getVrRada", null ); // NOI18N
            properties[PROPERTY_vrRada].setDisplayName ( "Vrsta Radova" );
            properties[PROPERTY_zatvoren] = new PropertyDescriptor ( "zatvoren", ent.infsistem.Nald001.class, "getZatvoren", null ); // NOI18N
            properties[PROPERTY_zatvoren].setDisplayName ( "Datum Zatvaranja" );
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties
    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events

        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events
    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_equals0 = 0;
    private static final int METHOD_hashCode1 = 1;
    private static final int METHOD_toString2 = 2;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[3];
    
        try {
            methods[METHOD_equals0] = new MethodDescriptor(ent.infsistem.Nald001.class.getMethod("equals", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_equals0].setDisplayName ( "" );
            methods[METHOD_hashCode1] = new MethodDescriptor(ent.infsistem.Nald001.class.getMethod("hashCode", new Class[] {})); // NOI18N
            methods[METHOD_hashCode1].setDisplayName ( "" );
            methods[METHOD_toString2] = new MethodDescriptor(ent.infsistem.Nald001.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString2].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

        // Here you can add code for customizing the methods array.
        
        return methods;     }//GEN-LAST:Methods
    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons
    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.
//GEN-LAST:Superclass
    /**
     * Gets the bean's
     * <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's
     * <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's
     * <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's
     * <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
}
