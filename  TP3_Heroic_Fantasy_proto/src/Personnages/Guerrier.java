/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author arthu
 */


public class Guerrier extends Personnage {

    private boolean aCheval;
    private static int nbGuerriers = 0;



    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        nbGuerriers++; 
        
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    // 👉 Q37 : armes de prédilection du guerrier = les épées
    @Override
    public int nbArmesDePredilection() {
        int c = 0;
        for (Arme a : inventaire) {   // inventaire = protected dans Personnage
            if (a instanceof Epee) {
                c++;
            }
        }
        return c;
       
    }
public static int getNbGuerriers() {
    return nbGuerriers;}

    @Override
    public String toString() {
        String statut = aCheval ? "à cheval" : "à pied";
        return "Guerrier - " + super.toString() + ", " + statut;
    
    }
}
