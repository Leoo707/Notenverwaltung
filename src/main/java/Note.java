import java.net.Inet4Address;
import java.util.ArrayList;

public class Note {
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
    public int noteAusgeben(Unternote unternote) {
        ArrayList<Integer> unternoten = unternote.getUnternoten();
        int sum = 0;
        for (int i = 0; i < unternoten.size(); i++) {
            sum += unternoten.get(i);
            sum = sum / unternoten.size();
        }
        return sum;
    }
    //addUnternote
    //removeUnternote
    // Note(unterrichtsfach) {}
}
