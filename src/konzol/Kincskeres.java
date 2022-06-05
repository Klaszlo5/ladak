package konzol;

import java.util.Scanner;
import java.util.ArrayList;

public class Kincskeres {

    public static void main(String args[]) {
        Lada aranyLada = new Lada("Nálam van a kincs", "Arany", false);
        Lada ezustLada = new Lada("Nincs nálam a kincs", "Ezust", false);
        Lada bronzLada = new Lada("Az arany hazudik", "Bronz", true);

        ArrayList<Lada> arr = new ArrayList<Lada>();
        arr.add(aranyLada);
        arr.add(ezustLada);
        arr.add(bronzLada);
        for (Lada lada : arr){
            System.out.println(lada.getNev());
            System.out.println(lada.getFelirat());
        }
        System.out.println("Válassz a három láda közül és írd be!");

        Scanner in = new Scanner(System.in);
        String valasz = in.next();
        for (Lada lada : arr) {
            if (valasz.equals(lada.getNev())) {
                if (lada.isKincs()) {
                    System.out.println("Eltaláltad! Ez a láda rejtette a kincset");
                } else {
                    System.out.println("Nemtalált");
                }

            }
        }
        /*System.out.println("A billentyűzeteddel írd be a találatod ");
        if (valasz.equals(aranyLada.isKincs() && valasz.equals(aranyLada.getNev()))){
            System.out.println("Nem talált");
        }else if (valasz.equals(ezustLada.isKincs() && valasz.equals(ezustLada.getNev()))){
            System.out.println("Nem talált");
        }else if (valasz.equals(bronzLada.isKincs() && valasz.equals(bronzLada.getNev()))){
            System.out.println("Eltaláltad! Ez a láda rejtette a kulcsot");
        }else{
            System.out.println("Nem talált");
        }*/
    }
}
