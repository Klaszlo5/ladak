package konzol;

import java.util.Scanner;

public class Lada {
    private String felirat;
    private String nev;
    private boolean kincs;
    
    public Lada(String felirat, String nev, boolean kincs){
        this.felirat=felirat;
        this.nev=nev;
        this.kincs=kincs;
    }

    public boolean isKincs() {
        return kincs;
    }

    public String getFelirat() {
        return felirat;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Lada{" + "felirat=" + felirat + ", kincs=" + kincs + ", nev=" + nev + '}';
    }
}
