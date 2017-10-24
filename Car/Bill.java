/**
 * Created by Elev1 on 10/18/2017.
 */
public class Bill {
    private String tillverkare;
    private String modell;
    private int antalldor;

    Bill(String tillverkare, String modell, int antalldor){
        this.tillverkare = tillverkare;
        this.modell = modell;
        this.antalldor = antalldor;
    }
    public void setTillverkare(String tillverkare) {
        this.tillverkare = tillverkare;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setAntalldor(int antalldor) {
        this.antalldor = antalldor;
    }

    public String getTillverkare() {
        return tillverkare;
    }

    public String getModell() {
        return modell;
    }

    public int getAntalldor() {
        return antalldor;
    }

    public  String toString(){
        return tillverkare + " " + modell + " " + antalldor;
    }

}
