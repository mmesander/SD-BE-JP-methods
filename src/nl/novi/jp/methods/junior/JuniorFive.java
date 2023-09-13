package nl.novi.jp.methods.junior;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 *
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {
    public static void main(String[] args) {
        String lowerCaseString1 = "Hoi ik ben Mark";
        String lowerCaseString2 = "Hoi ik ben nog steeds Mark";


        convertToUpperCase(lowerCaseString1);
        convertToUpperCase(lowerCaseString2);
    }

    public static void convertToUpperCase(String lowerCaseString) {
        String upperCaseString = lowerCaseString.toUpperCase();
        System.out.println(upperCaseString);
    }
}
