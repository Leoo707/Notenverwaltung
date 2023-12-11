/**
 * Klasse, die ein Fach repräsentiert.
 */
public class Unterrichtsfach {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Unterrichtsfach(String name) {
        this.name = name;
    }
}
