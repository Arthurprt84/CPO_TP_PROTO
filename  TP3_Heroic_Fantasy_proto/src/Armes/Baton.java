/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author arthu
 */

   public class Baton extends Arme {

    private int age; // < 100

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); 
        this.age = age;            
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return super.toString() + " | Âge : " + age;
    }
}

