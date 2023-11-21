import java.util.ArrayList;

public class Unternote {
    private String name;
    private ArrayList<Integer> unternoten = new ArrayList<>();
    private int wert;
    public int getWert() {
        return wert;
    }
    public ArrayList<Integer> getUnternoten() {
        return unternoten;
    }
    public void setWert(int wert) {
        this.wert = wert;
    }
    Unternote(String name) {
        this.name = name;
    }
    public void addUnternote(int unternote) {
        this.unternoten.add(unternote);
    }
}
