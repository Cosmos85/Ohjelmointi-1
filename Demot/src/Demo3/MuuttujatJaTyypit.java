package Demo3;

/**
 * Esitell��n muuttujia.
 * @author vesal
 * @version 20.9.2008
 */
public class MuuttujatJaTyypit {

    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        double tyomatkanPituusPolkupyorallaKm = 9.7; 
        int  suoritettujenOpintopisteidenMaara = 3; 
        int  kokoTutkinnonLaajuusOp = 300;
        double tehtyjaDemoja = 7.5; 
        char kirjanEnsimmainenKirjain = 'A';
        double juoksu100mVoittoAika = 9.69;

        System.out.printf("Ty�matka: %3.1f km%n",tyomatkanPituusPolkupyorallaKm);
        System.out.printf("Opintopisteit�: %d op%n",suoritettujenOpintopisteidenMaara);
        System.out.printf("Tutkinto: %d op%n",kokoTutkinnonLaajuusOp);
        System.out.printf("Demoja: %3.1f%n",tehtyjaDemoja);
        System.out.printf("Kirja alkaa kirjaimella %c%n",kirjanEnsimmainenKirjain);
        System.out.printf("Usain Bolt: %4.2f s%n",juoksu100mVoittoAika);
    }

}
