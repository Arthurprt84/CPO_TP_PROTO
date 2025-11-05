/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_proto;

/**
 *
 * @author arthu
 */
public class TP2_Bieres_Proto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        BouteilleBiere biere2 = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere biere1 = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
        
        BouteilleBiere biere3 = new BouteilleBiere("Heineken", 5.0, "Heineken International");
        BouteilleBiere biere4 = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont");

        // Décapsuler quelques-unes
        biere1.decapsuler();
        biere3.decapsuler();

        // Affichage à l’écran avec System.out.println()
        System.out.println("\n--- État des bières ---");
        System.out.println(biere1);
        System.out.println(biere2);
        System.out.println(biere3);
        System.out.println(biere4);
    }
}

    
    
