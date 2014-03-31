/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFSYS.Adapt;

/**
 *
 * @author dobri
 *
 * Definisanje Kategorije ispisa na JavaFX izveštajima, odn. da li želimo da
 * bude ispis Imena, Prezime, celog imena, ili samo ID-ja iz Inf. systema pošto
 * u nekim prozorima ne može stati ispis celog imena.
 */
public class Kategorije {

    public enum ServisniSavetnik {

        IME, PREZIME, IME_I_PREZIME, IDINFSYSTEM;
    }
}
