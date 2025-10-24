/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint.arthur;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP1_manipNombresIntArthur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nb1;int nb2;int somme;double division; int produit; int quotient;int reste ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre 1 :");
        nb1=sc.nextInt();
        System.out.println("Entrer le nombre2 :");
        nb2=sc.nextInt();
        somme = nb1 + nb2;
        System.out.println("LA somme des deux nombres est "+somme);
        division = nb1/nb2;
        System.out.println("LA division du nb1 par nb2 est "+division);
        produit = nb1*nb2;
        System.out.println("Le produit des deux nombres est "+produit);
        quotient = nb1 / nb2 ;
        System.out.println("Le quotient des deux nombres est "+ quotient);
        reste = nb1%nb2;
        System.out.println("Le reste de la division des deux nombres est "+ reste);       

                
    
    }
    
}
