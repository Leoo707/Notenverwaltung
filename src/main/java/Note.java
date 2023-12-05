import java.util.ArrayList;

public class Note {
    private String name;
    private ArrayList<Fachnote> unternoten = new ArrayList<>();
    private Integer wert;
    Notensystem notensystem;

    Note (String name, Notensystem notensystem) {
        this.name = name;
        this.notensystem = notensystem;
    }

    public void setUnternote(ArrayList<Fachnote> unternoten) {
        this.unternoten = unternoten;
    }
    public ArrayList<Fachnote> getUnternote() {
        return unternoten;
    }
    public void setWert(Integer wert) {
        this.wert = wert;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWert() {
        if (wert == null) {
            return durchschnitt();
        }
        return wert;
    }
    public void addUnternote(Fachnote fachnote) {
        this.unternoten.add(fachnote);
    }
    public void removeUnternote(Fachnote fachnote) {
        this.unternoten.remove(fachnote);
    }
    private int durchschnitt() {
        int sum = 0;
        for (int i = 0; i < unternoten.size(); i++) {
            sum += unternoten.get(i).getWert();
        }
        float durchschnitt = (float)sum / unternoten.size();
        return sum;
    }

    @Override
    public String toString() {
        notensystem.toString(getWert());
        return "";
    }
}
