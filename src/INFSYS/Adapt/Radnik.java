/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFSYS.Adapt;

import INFSYS.Adapt.Functionalities.IRadnik;
import static INFSYS.Queries.INFSistemQuery.Radnik;
import ent.infsistem.Radn001;

/**
 *
 * @author dobri
 */
public class Radnik implements IRadnik {

    private final Radn001 radnikInfSistem;

    public Radnik(String ID) {
        this.radnikInfSistem = Radnik(ID);
    }

    public static IRadnik getRadnik(String ID) {
        return new Radnik(ID);
    }

    @Override
    public String getID() {
        return radnikInfSistem.getRadnik();
    }

    @Override
    public int getIntID() {
        try {
            return Integer.parseInt(getID());
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    @Override
    public String getIme() {
        return radnikInfSistem.getIme();
    }

    @Override
    public String getPrezime() {
        return radnikInfSistem.getPrezime();
    }

    @Override
    public String getImeIPrezime() {
        return getIme() + " " + getPrezime();
    }

    @Override
    public String toString() {
        return "ID[" + radnikInfSistem.getRadnik() + "] "
                + "[" + getIme() + "] "
                + "[" + getPrezime() + "]";
    }
}
