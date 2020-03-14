public class Tierheim {

    public static void main (String [] args){
        //System.out.println(wieWeitSpazieren(0.5,15,true) + " km");

        int [] kuschelFeld = new int [] {2,26,40};
        boolean k = kuschelBedarf(kuschelFeld);

        if (k) {
            System.out.println("yay wird gekuschelt!");
        } else {
            System.out.println("snuff snuff snief snief");
        }

    }

    /* public static double wieWeitSpazieren (double gewicht, double letztesMal, boolean vertraegtSich) {

        if (gewicht < 1 && !vertraegtSich ){ //kg
            return 2; //km
        }
        if (gewicht < 1 && vertraegtSich) {
            return 4;
        }
        if ((gewicht > 15 || letztesMal > 24) && vertraegtSich) {
            return 8;
        }
            return 5;
    }*/

    public static boolean kuschelBedarf (int [] kuschelZeit ){

        if ((kuschelZeit[0] + kuschelZeit [1] + kuschelZeit[2]) > 60) {
            return false;
        }
        if((kuschelZeit[0] < kuschelZeit[1] ) && (kuschelZeit[1] < kuschelZeit [2])){
            return true;
        }
        if (kuschelZeit[1] > 25) {
            return false;
        }
        return false;

    }
}
