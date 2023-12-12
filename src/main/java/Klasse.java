import java.util.ArrayList;
/**
 * Erstellt eine Klasse für eine Schulklasse.
 */
public class Klasse {
    private String name;
    private ArrayList<String> schueler = new ArrayList<>();
    private Notensystem notensystem;
    public ArrayList<String> faecher = new ArrayList<>();
    public void setName(String name) {
        this.name = name;
    }
    /**
     * "Getter-Setter" für Name der Klasse , Liste der Schüler und Fächer
     */
    public String getName() {
        return name;
    }
    public void setSchueler(String schueler) {
        this.schueler.add(schueler);
    }
    public ArrayList<String> getSchueler() {
        return schueler;
    }
    public void setFaecher(String faecher) {
        this.faecher.add(faecher);
    }
    public ArrayList<String> getFaecher() {
        return faecher;
    }
    /**
     * Platzhaltermethode zur Berechnung der Durchschnittsnote für ein bestimmtes Fach
     */
    public int ausgebenDurchschnitt(Note note) {
        return  0;
    }
}
