/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_proto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP1_stats_proto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        Random alea = new Random();

        int[] faces = new int[6];

        System.out.print("Combien de lancers ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int tirage = alea.nextInt(6);
            faces[tirage]++;
        }

        System.out.println("Résultats :");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois");
        }

        System.out.println("En pourcentage :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) faces[i] / m * 100;
            System.out.println("Face " + (i + 1) + " : " + pourcentage + " %");
        }
    }}
        
