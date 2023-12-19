import java.util.ArrayList;
/**
 * Klasse, die eine Note darstellt.
 */
public class Note {
    private String name;
    private ArrayList<Integer> unternoten = new ArrayList<>();
    private int wert;
    Notensystem notensystem;
    /**
     * Konstruktor zum Erstellen einer Note.
     */
    Note (String name, Notensystem notensystem, int wert) {
        this.name = name;
        this.notensystem = notensystem;
        this.wert = wert;
    }

    public Note (String name, Notensystem notensystem) {
        this.name = name;
        this.notensystem = notensystem;
    }

    public Note (Notensystem notensystem) {
        this.notensystem = notensystem;
    }
    public Note(ArrayList<Integer> unternoten) {
        this.unternoten = unternoten;
    }

    public void setUnternote() {
        unternoten.add(wert);
    }
    public ArrayList<Integer> getUnternote() {
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
        return durchschnitt();
    }
    /**
     * Methode zum Hinzufügen einer Unternote zur Liste.
     */
    public void addUnternote() {
        this.unternoten.add(wert);
    }
    /**
     * Methode zum Entfernen einer Unternote aus der Liste
     */
    public void removeUnternote(Fachnote fachnote) {
        this.unternoten.remove(fachnote);
    }
    private int durchschnitt() {
        int sum = 0;
        for (int i = 0; i < unternoten.size(); i++) {
            sum += unternoten.get(i);
        }
        float durchschnitt = (float)sum / unternoten.size();
        return sum;
    }
    /**
     * Private Methode zur Berechnung des Durchschnitts der Unternote
     */
    @Override
    public String toString() {
        notensystem.toString(getWert());
        return "";
    }
}
