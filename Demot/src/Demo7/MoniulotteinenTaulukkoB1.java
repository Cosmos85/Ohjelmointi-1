package Demo7;

/**
 * B1 teht�v�
 * @author Esa Kesti
 * @version 29 Nov 2020
 */
public class MoniulotteinenTaulukkoB1 {
    /**
     * K�y l�pi taulukossa merkkijonoTaulukko olevat merkkijonot ja tulostaa ne matriisiin
     * @param merkkijonoTaulukko 
     */
    public static void tulosta(String [][] merkkijonoTaulukko) { 
        for (int i = 0; i < merkkijonoTaulukko.length; i++) { 
            for (int j = 0; j < merkkijonoTaulukko.length; j++) 
                System.out.print(merkkijonoTaulukko[i][j] + " "); 

            System.out.println(); 
        } 
}
    
    /**
     * K�y l�pi kolmiulotteisen taulukon ja tulostaa sen sis�ll�n
     * @param kolmiulotteinenTaulukko 
     * 
     */
    public static void tulostaKolmiulotteinen(int[][][] kolmiulotteinenTaulukko) { 
        for (int x = 0; x < kolmiulotteinenTaulukko.length; x++) { 
            for (int y = 0; y < kolmiulotteinenTaulukko[x].length; y++) {
                for ( int z = 0; z < kolmiulotteinenTaulukko[x][y].length; z++) {
                    
                }
            }
        }

              for (int x = 0; x < kolmiulotteinenTaulukko.length; x++) { 
                for (int y = 0; y < kolmiulotteinenTaulukko[x].length; y++) {
                    for ( int z = 0; z < kolmiulotteinenTaulukko[x][y].length; z++) {
                    System.out.println(kolmiulotteinenTaulukko[x][y][z]+ " ");  //Jostain syyst� ei tulosta matriisiin
                }
                    System.out.println();
            }
        }
    }
      

    /**
     * Alustetaan ja esitet��n kaksi eri taulukkoa, kaksiulotteinen merkkijono taulukko ja kolmiulotteinen reaaliluku taulukko
     * @param args Ei k�yt�ss�
     */
    public static void main(String[] args) {
        String merkkijonoTaulukko[][] = {{"esa","tekee","demoja"},{"esa", "koodaa", "n�m�"},{"n�m�", "menee", "hyvin"}}; 
                
        int kolmiulotteinenTaulukko[][][] = {
                {{3, 4, 2, 3}, {11, 3, 9, 11}, {23, 12, 23, 2}},
                {{13, 4, 56, 3}, {5, 9, 3, 5}, {3, 1, 4, 9}}};
        tulosta(merkkijonoTaulukko);
        System.out.println();
        tulostaKolmiulotteinen(kolmiulotteinenTaulukko);     

    }

}

