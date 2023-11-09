import java.util.ArrayList;

public class Schueler {
    private String name;
    private ArrayList<Integer> noten = new ArrayList<>();
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setNoten(int noten) {
        this.noten.add(noten);
    }
    public ArrayList<Integer> getNoten() {
        return noten;
    }

    //noteEntfernen --> Unterrichtsfach
}
