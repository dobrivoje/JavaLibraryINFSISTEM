/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFSYS.BusinessBeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author root
 */
public class DnevnoFA_UK extends Base4BusinessBeans {
    
    private double Rad;
    private double Materijal;

    //<editor-fold defaultstate="collapsed" desc="konstruktor, getters/setters">
    public DnevnoFA_UK(int Godina, int Mesec, int Dan, double Rad, double Materijal) {
        super(Godina, Mesec, Dan);
        
        this.Rad = Rad;
        this.Materijal = Materijal;
    }
    
    public int getRad() {
        return Math.round((float) Rad);
    }
    
    public int getMaterijal() {
        return Math.round((float) Materijal);
    }
    
    public void setRad(double Rad) {
        this.Rad = Rad;
    }
    
    public void setMaterijal(double Materijal) {
        this.Materijal = Materijal;
    }
    //</editor-fold>

    public static List<DnevnoFA_UK> getDaniMesecInit(int Godina, int Mesec) {
        lastDayOfMonth = getLastDayOfMonth(Godina, Mesec);
        
        List<DnevnoFA_UK> L = new ArrayList(lastDayOfMonth);
        
        for (int i = 0; i < lastDayOfMonth; i++) {
            L.add(i, new DnevnoFA_UK(Godina, Mesec, /* indeks=0, dan=index+1*/ i + 1, 0d, 0d));
        }
        
        return L;
    }
    
    public static Map<Integer, DnevnoFA_UK> getDaniMesecInitMap(int Godina, int Mesec) {
        Map<Integer, DnevnoFA_UK> M = new TreeMap();
        
        for (DnevnoFA_UK d : getDaniMesecInit(Godina, Mesec)) {
            M.put(d.getDay(), new DnevnoFA_UK(Godina, Mesec, d.getDay(), 0d, 0d));
        }
        
        return M;
    }
    
    @Override
    public String toString() {
        return year + ". " + month + ". " + day + " [" + decimalFormat.format(Rad) + " | " + decimalFormat.format(Materijal) + "]";
    }
}
