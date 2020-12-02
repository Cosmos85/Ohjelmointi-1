package l10;


import fi.jyu.mit.ohj2.*;

/**
 * Ohjelmalla tulostetaan suurin ja pienin kolmesta luvusta
 * @author Esa Kesti
 * @version 27.9.2020
 */
public class SuurinJaPienin2 {
//#STATICIMPORT

    /**
     * Palautetaan kolmen luvun pienin luku
     * @param taulukko tutkittavat luvut
     * @return pienin taulukon luvuista 
     */
    public static int pienin(int [] taulukko) {
        int min = taulukko[0];
        int i = 1;
        int koko = taulukko.length;
        while(i < 4) {
            if(taulukko[i] < min)
                min = taulukko[i];
            i++;
        }
        return min;
    }

    /**
     * Palautetaan kolmen luvun suurin luku
     * @param taulukko 
     * @return suurin luvuista a,b,c     
     */
    public static int suurin(int[] taulukko) {
        if (taulukko.length == 0) return 0;
        
        int max = taulukko[0];
        for (int i = 1; i < taulukko.length; i++)
            if (taulukko[i] > max)
                max = taulukko[i];
            
      
        return max;
    }

    
    
    
    
    /**
     * Paluttaa pienimm�n luvun annetuista parametreist�
     * @param a eka luku
     * @param b toka luku
     * @param c kolmas luku
     * @return pienin luku
     * 
     * @example
     * <pre name="test">
     * pieninLuku(1, 2, 3) === 1;
     * pieninLuku(1, 3, 2) === 1;
     * pieninLuku(2, 1, 3) === 1;
     * pieninLuku(2, 3, 1) === 1;
     * pieninLuku(3, 1, 2) === 1;
     * pieninLuku(3, 2, 1) === 1;
     * pieninLuku(1, 1, 2) === 1;
     * pieninLuku(3, 2, 2) === 2;
     * </pre>
     */
    public static int pieninLuku(int a, int b, int c) {
        int ehdokas = a;
        if ( b < ehdokas ) ehdokas = b;
        if ( c < ehdokas ) ehdokas = c;
        return ehdokas;
    }
    
    
    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = Syotto.kysy("Anna luku 1", 1);
        a[1] = Syotto.kysy("Anna luku 2", 2);
        a[2] = Syotto.kysy("Anna luku 3", 3);
        a[3] = Syotto.kysy("Anna luku 4", 3);
        int min = pienin(a);        
        System.out.println("Pienin luku:" + min);
        //System.out.printf("Lukujen %d,%d,%d suurin on %d ja pienin on %d.%n",a,b,c,max,min);
        
        
        //int[] a;   // ei ole taulukkoa -> nyt vain viite.

    }


}