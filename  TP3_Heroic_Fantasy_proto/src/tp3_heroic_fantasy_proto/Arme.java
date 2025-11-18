
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_proto;

/**
 *
 * @author arthu
 */
public abstract class Arme {

   
    private String nom;
    private int niveauAttaque; // <= 100

  
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

   
    public int getNiveauAttaque() {
        return this.niveauAttaque;
    }

    
    public String getNom() {
        return this.nom;
    }

  
    @Override
    public String toString() {
        return "Arme : " + nom + " | Attaque : " + niveauAttaque;
    }
}

    
            
    
