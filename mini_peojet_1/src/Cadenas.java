/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */



import java.util.Random;
import java.util.Scanner;

      // src/cadenas/Cadenas.java


public class Cadenas {
    private int[] codeSecret;
    private final int maxTentatives = 5;
    private int tentativeActuelle = 0;

    public Cadenas() {
        genererCodeSecret();
    }

    private void genererCodeSecret() {
        codeSecret = new int[4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            codeSecret[i] = rand.nextInt(10);
        }
    }

    public int[] testerCombinaison(int[] proposition) {
        int exact = 0, tropHaut = 0, tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (proposition[i] == codeSecret[i]) {
                exact++;
            } else if (proposition[i] > codeSecret[i]) {
                tropHaut++;
            } else {
                tropBas++;
            }
        }

        tentativeActuelle++;
        return new int[]{exact, tropHaut, tropBas};
    }

    public boolean aGagne(int[] proposition) {
        for (int i = 0; i < 4; i++) {
            if (proposition[i] != codeSecret[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean estTermine() {
        return tentativeActuelle >= maxTentatives;
    }

    public void reinitialiser() {
        tentativeActuelle = 0;
        genererCodeSecret();
    }

    public int getTentativeActuelle() {
        return tentativeActuelle;
    }

    public int getMaxTentatives() {
        return maxTentatives;
    }

    public int[] getCodeSecret() {
        return codeSecret;
    }

    // Pour tests uniquement
    public void afficherCodeSecret() {
        System.out.print("Code secret : ");
        for (int c : codeSecret) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Cadenas jeu = new Cadenas();
        Scanner scanner = new Scanner(System.in);
        jeu.afficherCodeSecret(); // à désactiver en version finale

        while (!jeu.estTermine()) {
            System.out.print("Entrez 4 chiffres (ex: 1234) : ");
            String input = scanner.nextLine();

            if (input.length() != 4 || !input.matches("\\d{4}")) {
                System.out.println("Entrée invalide. Réessayez.");
                continue;
            }

            int[] proposition = new int[4];
            for (int i = 0; i < 4; i++) {
                proposition[i] = Character.getNumericValue(input.charAt(i));
            }

            int[] resultats = jeu.testerCombinaison(proposition);
            System.out.println("Exact: " + resultats[0] +
                               ", Trop haut: " + resultats[1] +
                               ", Trop bas: " + resultats[2]);

            if (jeu.aGagne(proposition)) {
                System.out.println("Bravo, vous avez trouvé le code !");
                break;
            }
        }

        if (!jeu.aGagne(jeu.getCodeSecret())) {
            System.out.print("Perdu. Le code était : ");
            for (int c : jeu.getCodeSecret()) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
