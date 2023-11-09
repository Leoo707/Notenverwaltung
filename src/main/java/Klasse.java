import java.util.ArrayList;


public class Klasse {
    private String name;
    private ArrayList<String> schueler = new ArrayList<String>();
    private Notensystem notensystem = new Notensystem();
    private ArrayList<String> faecher;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSchueler(ArrayList<String> schueler) {
        this.schueler = schueler;
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
    //public int ausgebenDurchschnitt

}
