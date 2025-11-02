/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_proto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP1_guessMyNumber_proto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random alea = new Random();

        System.out.println("=== Devine le nombre : choisissez la difficulté ===");
        System.out.println("1) Facile   (0-50, indices renforcés, essais illimités)");
        System.out.println("2) Normal   (0-100, essais illimités)");
        System.out.println("3) Difficile(0-100, 7 essais)");
        System.out.print("Votre choix : ");
        int diff = sc.nextInt();

        int max = 100;                    
        int maxEssais = Integer.MAX_VALUE;
        boolean indicesRenforces = false;

        if (diff == 1) {              
            max = 50;
            indicesRenforces = true;
        } else if (diff == 3) {       
            max = 100;
            maxEssais = 7;
        } 

        int secret = alea.nextInt(max + 1);
        int essais = 0;

        System.out.println("\nJ'ai choisi un nombre entre 0 et " + max + ". À vous de jouer !");
        if (maxEssais != Integer.MAX_VALUE) {
            System.out.println("(Vous avez " + maxEssais + " essais.)");
        }

        while (true) {
            System.out.print("Entrez votre proposition : ");
            int x = sc.nextInt();
            essais++;

            if (x == secret) {
                System.out.println("Bravo ! Trouvé en " + essais + " essai(s). Le nombre était " + secret + " 🎉");
                break;
            }

            
            boolean tropPetit = x < secret;
            String msg = tropPetit ? "Trop petit !" : "Trop grand !";

            if (indicesRenforces) {
                int ecart = Math.abs(x - secret);
                if (ecart >= max / 3) {
                    msg = "Vraiment " + (tropPetit ? "trop petit !" : "trop grand !");
                }
            }

            System.out.println(msg);

           
            if (essais >= maxEssais) {
                System.out.println("Dommage… Vous avez épuisé vos essais. Le nombre était " + secret + ".");
                break;
            } else if (maxEssais != Integer.MAX_VALUE) {
                System.out.println("Essais restants : " + (maxEssais - essais));
            }
        }
    }
}