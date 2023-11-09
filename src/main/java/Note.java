import java.net.Inet4Address;
import java.util.ArrayList;

public class Note {
    //private unterrichtsfach Unterrichtsfach = new Unterrichtsfach();

    //private unternote Unternote = new Unternote();
    private ArrayList<Integer> unternoten = new ArrayList<>();
    private int wert;

    public void setUnternote(ArrayList<Integer> unternoten) {
        this.unternoten = unternoten;
    }
    public ArrayList<Integer> getUnternote() {
        return unternoten;
    }
    public void setWert(int wert) {
        this.wert = wert;
    }
    public int getWert() {
        return wert;
    }
    //noteAusgeben
    //addUnternote
    //removeUnternote
    // Note(unterrichtsfach) {}


}
