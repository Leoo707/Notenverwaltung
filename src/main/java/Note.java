import java.util.ArrayList;

public class Note {
    private ArrayList<Fachnote> unternoten = new ArrayList<>();
    private Integer wert;
    public void setUnternote(ArrayList<Fachnote> unternoten) {
        this.unternoten = unternoten;
    }
    public ArrayList<Fachnote> getUnternote() {
        return unternoten;
    }
    public void setWert(int wert) {
        this.wert = wert;
    }
    public int getWert() {
        if (wert == null) {
            return durchschnitt();
        }
        return wert;
    }
    private int durchschnitt() {
        int sum = 0;
        for (int i = 0; i < unternoten.size(); i++) {
            sum += unternoten.get(i).getWert();
        }
        float durchschnitt = (float)sum / unternoten.size();
        return sum;
    }

    public void addUnternote(Fachnote fachnote) {
        this.unternoten.add(fachnote);
    }
    public void removeUnternote(Fachnote fachnote) {
        this.unternoten.remove(fachnote);
    }

    Note (Fachnote fachnote) {
        this.
    }
}
