/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Scanner sc = new Scanner(System.in);
  System.out.println("Please enter the operator: \n 1) add  \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        
        System.out.print("Votre choix (1-5) : ");
        int operateur = sc.nextInt();

        System.out.print("Entrez l'operande1 (entier) : ");
        int operande1 = sc.nextInt();

        System.out.print("Entrez l'operande2 (entier) : ");
        int operande2 = sc.nextInt();

        System.out.println(); // ligne vide pour la lisibilité

        if (operateur == 1) {
            System.out.println(operande1 + " + " + operande2 + " = " + (operande1 + operande2));

        } else if (operateur == 2) {
            System.out.println(operande1 + " - " + operande2 + " = " + (operande1 - operande2));

        } else if (operateur == 3) {
            System.out.println(operande1 + " * " + operande2 + " = " + (operande1 * operande2));

        } else if (operateur == 4) {
            if (operande2 == 0) {
                System.out.println("Erreur : division par zéro impossible.");
            } else {
                double resultat = (double) operande1 / operande2;
                System.out.println(operande1 + " / " + operande2 + " = " + resultat);
            }

        } else if (operateur == 5) {
            if (operande2 == 0) {
                System.out.println("Erreur : modulo par zéro impossible.");
            } else {
                System.out.println(operande1 + " % " + operande2 + " = " + (operande1 % operande2));
            }

        } else {
            System.out.println("Choix invalide. Veuillez relancer et saisir un nombre entre 1 et 5.");
        }
    }
    
}
