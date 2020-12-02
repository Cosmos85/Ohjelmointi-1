package Demo3;
import fi.jyu.mit.graphics.Axis;
import fi.jyu.mit.graphics.Circle;
import fi.jyu.mit.graphics.DrawableCollection;
import fi.jyu.mit.graphics.EasyWindow;
import fi.jyu.mit.graphics.MouseFollower;
import fi.jyu.mit.graphics.Rotator;

/**
 * Piirret��n 3 itsekseen py�riv�� lumiukkoa
 * @author vesal
 * @version 20.9.2008
 */
public class Lumiukot4 {

    /**
     * Piirret��n yksi lumiukko, jonka ison pallon
     * keskipiste on lumiukon keskus.
     * @author vesal
     */
    public static class Lumiukko  extends DrawableCollection {
        /**
         * Alustetaan lumiukko paikkaan (x,y)
         * @param x lumiukon ison pallon x
         * @param y lumiukon ison pallon y
         * @param isonpallonSade alimman pallon s�de
         * @param keskipallonSade mahaa kuvaavan pallon s�de
         * @param paanSade kumipallon p��n s�de
         */
        public Lumiukko(double x, double y, double isonpallonSade,
                double keskipallonSade, double paanSade) {
            super();
            double keskipallonY    = -keskipallonSade-isonpallonSade;
            double paanY           = -2*keskipallonSade-isonpallonSade-paanSade;
            move(x,y,0);
            add(new Circle(0,0,isonpallonSade));
            add(new Circle(0,keskipallonY,keskipallonSade));
            add(new Circle(0,paanY,paanSade));
        }
        
        /**
         * Alustetaan lumiukko paikkaan (x,y)
         * @param x lumiukon ison pallon x
         * @param y lumiukon ison pallon y
         * @param isonpallonSade alimman pallon s�de
         * @param keskipallonSade mahaa kuvaavan pallon s�de
         */
        public Lumiukko(double x, double y, double isonpallonSade,
                double keskipallonSade) {
            this(x,y,isonpallonSade,keskipallonSade,10);
        }

        /**
         * Alustetaan lumiukko paikkaan (x,y)
         * @param x lumiukon ison pallon x
         * @param y lumiukon ison pallon y
         * @param isonpallonSade alimman pallon s�de
         */
        public Lumiukko(double x, double y, double isonpallonSade) {
            this(x,y,isonpallonSade,15,10);
        }

        /**
         * Alustetaan lumiukko paikkaan (x,y)
         * @param x lumiukon ison pallon x
         * @param y lumiukon ison pallon y
         */
        public Lumiukko(double x, double y) {
            this(x,y,20,15,10);
        }
    }    
    
    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();

        Lumiukko ukko1 = new Lumiukko(30,100,30);
        Lumiukko ukko2 = new Lumiukko(40,300,40,20);
        Lumiukko ukko3 = new Lumiukko(274,190,50,40,30);
        
        window.add(ukko1);
        window.add(ukko2);
        window.add(ukko3);

        new Rotator(ukko1,Axis.Z,3,200);
        new Rotator(ukko1,Axis.Y,2,200);
        new Rotator(ukko2,Axis.X,4,200);
        new Rotator(ukko3,Axis.Z,5,200);

        new MouseFollower(window.getPanel(),ukko2,0,0,0,true);

        window.setTitle("Lumiukot heiluu");
        window.showWindow();
    }

}
