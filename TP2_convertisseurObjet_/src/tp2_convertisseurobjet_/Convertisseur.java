/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_;

/**
 *
 * @author arthu
 */
public class Convertisseur {
    

    int nbConversions = 0;    

    public static double CelsiusVersKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double KelvinVersCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double FahrenheitVersCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusVersFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double FahrenheitVersKelvin(double fahrenheit) {
        return CelsiusVersKelvin(FahrenheitVersCelsius(fahrenheit));
    }
    
    public static double KelvinVersFahrenheit(double kelvin) {
        return CelsiusVersFahrenheit(KelvinVersCelsius(kelvin));
    }

    // Incrementation du compteur
    public double convertir(double valeur, String type) {
        double result = 0;
        switch (type) {
            case "CelsiusVersKelvin" -> result = CelsiusVersKelvin(valeur);
            case "KelvinVersCelsius" -> result = KelvinVersCelsius(valeur);
            case "FahrenheitVersCelsius" -> result = FahrenheitVersCelsius(valeur);
            case "CelsiusVersFahrenheit" -> result = CelsiusVersFahrenheit(valeur);
            case "FahrenheitVersKelvin" -> result = FahrenheitVersKelvin(valeur);
            case "KelvinVersFahrenheit" -> result = KelvinVersFahrenheit(valeur);
            default -> System.out.println("Type de conversion non dispo.");
        }
        nbConversions++;
        return result;
    }
    @Override
    public String toString() {
        return "Nombre de conversions: " + nbConversions;
    }
}
    

