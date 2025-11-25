/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author arthu
 */

public class Epee extends Arme {

    private int indice; // < 100

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // paramètres hérités
        this.indice = finesse;    // paramètre propre à l'épée
    }

    public int getFinesse() {
        return this.indice;
    }

    @Override
    public String toString() {
        return super.toString() + " | Finesse : " + indice;
    }
}

  

