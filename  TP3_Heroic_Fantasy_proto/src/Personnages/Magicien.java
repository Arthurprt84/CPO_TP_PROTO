/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Baton;

public class Magicien extends Personnage {

    private boolean confirme;
    private static int nbMagiciens = 0;


    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagiciens++; 
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public static int getNbMagiciens() {
    return nbMagiciens;
}

    @Override
    public int nbArmesDePredilection() {
        int c = 0;
        for (Arme a : inventaire) {   
            if (a instanceof Baton) {
                c++;
            }
        }
        return c;
    }

    @Override
    public String toString() {
        String statut = confirme ? "confirmé" : "novice";
        return "Magicien - " + super.toString() + ", " + statut;
    }
}
