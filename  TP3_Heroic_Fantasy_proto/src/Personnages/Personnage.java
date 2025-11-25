/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Armes.Arme;


/**
 *
 * @author arthu
 */
public abstract class Personnage {

    protected String nom;
    protected int niveauVie;
    
    protected static int nbPersonnages = 0;
    
    protected ArrayList<Arme> inventaire = new ArrayList<Arme>();

   
    protected Arme armeEnMain = null;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;
    }

    public int getNiveauVie() {
        return niveauVie;
    }
        
    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    public String getNom() {
        return nom;
    }

   
    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
            System.out.println(nom + " obtient l’arme " + a.getNom());
        } else {
            System.out.println(nom + " ne peut pas avoir plus de 5 armes !");
        }
    }

    
    public Arme getArmeEnMain() {
        return armeEnMain;
    }

  
    public void equiperArme(String nomArme) {
        Arme trouvee = null;

        for (Arme a : inventaire) {
            if (a.getNom().equals(nomArme)) {
                trouvee = a;
                break;
            }
        }

        if (trouvee != null) {
            armeEnMain = trouvee;
            System.out.println(nom + " s’équipe de " + nomArme);
        } else {
            System.out.println(nom + " ne possède pas l’arme " + nomArme);
        }
    }

    
    @Override
    public String toString() {
        String s = "Nom : " + nom + ", niveau de vie : " + niveauVie;
        if (armeEnMain != null) {
            s += " | Arme en main : " + armeEnMain.toString();
        } else {
            s += " | Aucune arme en main";
        }
        return s;
    }
public abstract int nbArmesDePredilection();

}



