/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Armes.Arme;
import tp3_heroic_fantasy_proto.etreVivant;


/**
 *
 * @author arthu
 */


public abstract class Personnage implements etreVivant {

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

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public static int getNbPersonnages() {
        return nbPersonnages;
    }

    // ajouter une arme (max 5)
    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes.");
        }
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    // équiper une arme par son nom
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

    // interface etreVivant
    @Override
    public void seFatiguer() {
        niveauVie -= 10;
        if (niveauVie < 0) niveauVie = 0;
    }

    @Override
    public boolean estVivant() {
        return niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        niveauVie -= points;
        if (niveauVie < 0) niveauVie = 0;
    }

    // à implémenter dans Magicien / Guerrier
    public abstract int nbArmesDePredilection();
    public abstract void attaquer(Personnage cible);

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
}
