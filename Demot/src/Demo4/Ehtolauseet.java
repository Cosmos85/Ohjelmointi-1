package Demo4;

import fi.jyu.mit.ohj2.*;

/**
 * @author Esa Kesti
 * @version 27 Jun 2020
 */
public class Ehtolauseet {
    
   /**
    * Testataan, mik� numeroista on pienin
 * @param a
 * @param b
 * @param c
 * @return palauttaa pienimm�n numeron
 */
public static double pienin(double a, double b, double c) {
       if (a < b && b < c)
           return a;
       if (b < a && a < c)
           return b;
       if (c < a && c < b)
           return c;
       return 0;
   }

/**
 * Testataan mik� numeroista on suurin
 * @param a
 * @param b
 * @param c
 * @return palauttaa suurimman numeron
 */
public static double suurin(double a, double b, double c) {
    if (a > b && b > c)
        return a;
    if (b > a && a > c)
        return b;
    if (c > a && c > b)
        return c;
    return 0;
    
}
    /**
     * @param args ei k�yt�ss�
     * Pyyt�� k�ytt�j�� sy�tt�m��n kolme kokonaislukua ja tulostaa pienimm�n ja suurimm�n kokonaisluvun
     */
    public static void main(String[] args) {
        double a = Syotto.kysyDouble("Sy�t� ensimm�inen kokoainaisluku: ");
        double b = Syotto.kysyDouble("Sy�t� toinen kokoainaisluku: ");
        double c = Syotto.kysyDouble("Sy�t� kolmas kokoainaisluku: ");
        
        double p = pienin(a, b, c);
        double s = suurin(a, b, c);
        
        System.out.println("Pienin kokonaisluku on: "  +p);
        System.out.println("Suurin kokonaisluku on: " +s);
    }
    

}
