/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ent.infsistem;

import java.beans.*;

/**
 *
 * @author dobri
 */
public class SifarnikBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( ent.infsistem.Sifarnik.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_adresa = 0;
    private static final int PROPERTY_datumUpisaSifre = 1;
    private static final int PROPERTY_fizickoLice = 2;
    private static final int PROPERTY_id = 3;
    private static final int PROPERTY_ime = 4;
    private static final int PROPERTY_kontaktosobaservisa = 5;
    private static final int PROPERTY_kontaktosobazaplacanje = 6;
    private static final int PROPERTY_kupac = 7;
    private static final int PROPERTY_mail = 8;
    private static final int PROPERTY_matbr = 9;
    private static final int PROPERTY_mesto = 10;
    private static final int PROPERTY_pdv = 11;
    private static final int PROPERTY_pib = 12;
    private static final int PROPERTY_posebnenapomene = 13;
    private static final int PROPERTY_telefon1sifarnik = 14;
    private static final int PROPERTY_telefonzaplacanje = 15;
    private static final int PROPERTY_telefonzaservis = 16;
    private static final int PROPERTY_ugovorenirokplacanja = 17;
    private static final int PROPERTY_web = 18;
    private static final int PROPERTY_ziroRacun = 19;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[20];
    
        try {
            properties[PROPERTY_adresa] = new PropertyDescriptor ( "adresa", ent.infsistem.Sifarnik.class, "getAdresa", null ); // NOI18N
            properties[PROPERTY_adresa].setDisplayName ( "Adresa" );
            properties[PROPERTY_datumUpisaSifre] = new PropertyDescriptor ( "datumUpisaSifre", ent.infsistem.Sifarnik.class, "getDatumUpisaSifre", null ); // NOI18N
            properties[PROPERTY_datumUpisaSifre].setHidden ( true );
            properties[PROPERTY_fizickoLice] = new PropertyDescriptor ( "fizickoLice", ent.infsistem.Sifarnik.class, "getFizickoLice", null ); // NOI18N
            properties[PROPERTY_fizickoLice].setDisplayName ( "Fizičko Lice ?" );
            properties[PROPERTY_id] = new PropertyDescriptor ( "id", ent.infsistem.Sifarnik.class, "getId", null ); // NOI18N
            properties[PROPERTY_id].setDisplayName ( "ID" );
            properties[PROPERTY_ime] = new PropertyDescriptor ( "ime", ent.infsistem.Sifarnik.class, "getIme", null ); // NOI18N
            properties[PROPERTY_ime].setDisplayName ( "Naziv" );
            properties[PROPERTY_kontaktosobaservisa] = new PropertyDescriptor ( "kontaktosobaservisa", ent.infsistem.Sifarnik.class, "getKontaktosobaservisa", null ); // NOI18N
            properties[PROPERTY_kontaktosobaservisa].setHidden ( true );
            properties[PROPERTY_kontaktosobazaplacanje] = new PropertyDescriptor ( "kontaktosobazaplacanje", ent.infsistem.Sifarnik.class, "getKontaktosobazaplacanje", null ); // NOI18N
            properties[PROPERTY_kontaktosobazaplacanje].setHidden ( true );
            properties[PROPERTY_kupac] = new PropertyDescriptor ( "kupac", ent.infsistem.Sifarnik.class, "getKupac", null ); // NOI18N
            properties[PROPERTY_kupac].setDisplayName ( "Šifra Kupca" );
            properties[PROPERTY_mail] = new PropertyDescriptor ( "mail", ent.infsistem.Sifarnik.class, "getMail", null ); // NOI18N
            properties[PROPERTY_matbr] = new PropertyDescriptor ( "matbr", ent.infsistem.Sifarnik.class, "getMatbr", null ); // NOI18N
            properties[PROPERTY_matbr].setDisplayName ( "Matični Broj" );
            properties[PROPERTY_mesto] = new PropertyDescriptor ( "mesto", ent.infsistem.Sifarnik.class, "getMesto", null ); // NOI18N
            properties[PROPERTY_mesto].setDisplayName ( "Mesto" );
            properties[PROPERTY_pdv] = new PropertyDescriptor ( "pdv", ent.infsistem.Sifarnik.class, "getPdv", null ); // NOI18N
            properties[PROPERTY_pib] = new PropertyDescriptor ( "pib", ent.infsistem.Sifarnik.class, "getPib", null ); // NOI18N
            properties[PROPERTY_posebnenapomene] = new PropertyDescriptor ( "posebnenapomene", ent.infsistem.Sifarnik.class, "getPosebnenapomene", null ); // NOI18N
            properties[PROPERTY_posebnenapomene].setDisplayName ( "Posebne Napomene" );
            properties[PROPERTY_telefon1sifarnik] = new PropertyDescriptor ( "telefon1sifarnik", ent.infsistem.Sifarnik.class, "getTelefon1sifarnik", null ); // NOI18N
            properties[PROPERTY_telefon1sifarnik].setDisplayName ( "Telefon" );
            properties[PROPERTY_telefonzaplacanje] = new PropertyDescriptor ( "telefonzaplacanje", ent.infsistem.Sifarnik.class, "getTelefonzaplacanje", null ); // NOI18N
            properties[PROPERTY_telefonzaplacanje].setDisplayName ( "Telefon Za Plaćanje" );
            properties[PROPERTY_telefonzaservis] = new PropertyDescriptor ( "telefonzaservis", ent.infsistem.Sifarnik.class, "getTelefonzaservis", null ); // NOI18N
            properties[PROPERTY_telefonzaservis].setDisplayName ( "Telefon Servisa" );
            properties[PROPERTY_ugovorenirokplacanja] = new PropertyDescriptor ( "ugovorenirokplacanja", ent.infsistem.Sifarnik.class, "getUgovorenirokplacanja", null ); // NOI18N
            properties[PROPERTY_ugovorenirokplacanja].setDisplayName ( "Ugovoreni Rok Plaćanja" );
            properties[PROPERTY_web] = new PropertyDescriptor ( "web", ent.infsistem.Sifarnik.class, "getWeb", null ); // NOI18N
            properties[PROPERTY_ziroRacun] = new PropertyDescriptor ( "ziroRacun", ent.infsistem.Sifarnik.class, "getZiroRacun", null ); // NOI18N
            properties[PROPERTY_ziroRacun].setDisplayName ( "Račun" );
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
            methods[METHOD_equals0] = new MethodDescriptor(ent.infsistem.Sifarnik.class.getMethod("equals", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_equals0].setDisplayName ( "" );
            methods[METHOD_hashCode1] = new MethodDescriptor(ent.infsistem.Sifarnik.class.getMethod("hashCode", new Class[] {})); // NOI18N
            methods[METHOD_hashCode1].setDisplayName ( "" );
            methods[METHOD_toString2] = new MethodDescriptor(ent.infsistem.Sifarnik.class.getMethod("toString", new Class[] {})); // NOI18N
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
     * Gets the bean's <code>BeanDescriptor</code>s.
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
     * Gets the bean's <code>PropertyDescriptor</code>s.
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
     * Gets the bean's <code>EventSetDescriptor</code>s.
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
     * Gets the bean's <code>MethodDescriptor</code>s.
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
     * <P>
     * Returns -1 if there is no default property.
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
     * <P>
     * Returns -1 if there is no default event.
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
