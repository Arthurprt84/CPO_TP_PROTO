/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_proto;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.Vector;

/**
 *
 * @author arthu
 */
public class TP3_Heroic_Fantasy_proto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Magicien gandalf   = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        Guerrier conan     = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        Vector<Personnage> persos = new Vector<Personnage>();
        persos.add(gandalf);
        persos.add(garcimore);
        persos.add(conan);
        persos.add(lannister);

        for (int i = 0; i < persos.size(); i++) {
            System.out.println(persos.elementAt(i));
            
            
  System.out.println("Nombre total de personnages : " 
        + Personnage.getNbPersonnages());

System.out.println("Nombre de guerriers : " 
        + Guerrier.getNbGuerriers());

System.out.println("Nombre de magiciens : " 
        + Magicien.getNbMagiciens());

        }
    }}