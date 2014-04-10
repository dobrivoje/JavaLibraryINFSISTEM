/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package INFSYS.BusinessBeans;

import INFSYS.Adapt.Radnik;

/**
*
* @author dobri
*/
public class SSavetnikPerformanse extends Base4BusinessBeans {

    private final String ID;
    private final Radnik radnik;
    private final int mesec;
    private final int godina;
    private final double radovi;
    private final double delovi;

    //<editor-fold defaultstate="collapsed" desc="konstruktori, getters">
    public SSavetnikPerformanse(String ID, int Godina, int Mesec, double Rad, double Delovi) {
        super(Godina, Mesec);

        this.ID = ID;
        this.radnik = new Radnik(ID);
        this.mesec = Mesec;
        this.godina = Godina;
        this.radovi = Rad;
        this.delovi = Delovi;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public String getImeIPrezime() {
        return radnik.getImeIPrezime();
    }

    public String getID() {
        return ID;
    }

    public int getIntID() {
        try {
            return Integer.parseInt(Radnik.getRadnik(ID).getID());
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public int getRad() {
        return Math.round((float) radovi);
    }

    public int getDelovi() {
        return Math.round((float) delovi);
    }

    public int getUkupno() {
        return getRad() + getDelovi();
    }
    //</editor-fold>

    @Override
    public String toString() {
        return radnik.toString()
                + godina + "] ["
                + mesec + "] "
                + " Rad[" + decimalFormat.format(radovi) + "] "
                + " Delovi[" + decimalFormat.format(delovi) + "] ";
    }
}