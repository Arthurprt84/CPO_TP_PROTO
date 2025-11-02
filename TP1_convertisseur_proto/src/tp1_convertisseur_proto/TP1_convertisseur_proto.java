/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_proto;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP1_convertisseur_proto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Convertisseur de températures ===");
        System.out.println("1 - Celcius vers Kelvin");
        System.out.println("2 - Celcius vers Farenheit");
        System.out.println("3 - Kelvin vers Celcius");
        System.out.println("4 - Farenheit vers Celcius");
        System.out.println("5 - Kelvin vers Farenheit");
        System.out.println("6 - Farenheit vers Kelvin");
        System.out.print("Choisissez une option (1 à 6) : ");
        int choix = sc.nextInt();

        System.out.print("Entrez la valeur à convertir : ");
        double valeur = sc.nextDouble();

        double resultat;

        if (choix == 1) {
            resultat = CelciusVersKelvin(valeur);
            System.out.println(valeur + " °C = " + resultat + " K");
        }

        else if (choix == 2) {
            resultat = CelciusVersFarenheit(valeur);
            System.out.println(valeur + " °C = " + resultat + " °F");
        }

        else if (choix == 3) {
            resultat = KelvinVersCelcius(valeur);
            System.out.println(valeur + " K = " + resultat + " °C");
        }

        else if (choix == 4) {
            resultat = FarenheitVersCelcius(valeur);
            System.out.println(valeur + " °F = " + resultat + " °C");
        }

        else if (choix == 5) {
            resultat = KelvinVersFarenheit(valeur);
            System.out.println(valeur + " K = " + resultat + " °F");
        }

        else if (choix == 6) {
            resultat = FarenheitVersKelvin(valeur);
            System.out.println(valeur + " °F = " + resultat + " K");
        }

        else {
            System.out.println("Choix invalide !");
        }

        sc.close();
    }

   

    static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}
   
    
