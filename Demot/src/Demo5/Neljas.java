package Demo5;


/**
 * Lasketaan kertotauluja
 * @author Esa Kesti
 * @version 28 Jul 2020
 */
public class Neljas {

    /**
     * @param n saadaan tulostaKertotaulusta
     * for loop ajaa aliohjelman l�pi ja tulostaa oikean arvon
     */
    
    public static void tulostaKertotaulu(int n) {
        
        for(int i = 1; i <= 10; i++)
        
        System.out.println(n + " * " + i + " = " + (n*i));
    }
    

    
    /**
     * Kertotaulu while silmukkaa k�ytt�m�ll�
     * @param n tulee tulostaKertotaulu1:sen ensim�isest� arvosta
     * @param m tulee tulostaKertotaulu1:sen toisesta arvosta
     */
    public static void tulostaKertotaulu1(int n, int m) {
        
        int i = 1;
        while(i <= m)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        }
    }
    
    /**
     * Tulostaa kertotaulun k�ytt�m�ll� Do While silmukkaa
     * @param n tulee tulostaKertotaulu1:sen ensim�isest� arvosta
     * @param m tulee tulostaKertotaulu1:sen toisesta arvosta
     */
    public static void tulostaKertotauluDoWhile(int n, int m) {
        
        int i = 1;
        
        do {
            System.out.println(n + " * " + i + " = " + (n*i));
        i++;
        }
        while (i <= m);
        
    }
   
   
    /**
     * @param args ei k�yt�ss�
     * M��ritell��n arvot seuraaville silmukoille
     * tulostaKertotaulu(3);
     * tulostaKertotaulu1(3,8);
     * tulostaKertotauluDoWhile(5,5);
     */
    public static void main(String[] args) {
        
       tulostaKertotaulu(3);
       tulostaKertotaulu1(3,8);
       tulostaKertotauluDoWhile(5,5);
        
    }

}
