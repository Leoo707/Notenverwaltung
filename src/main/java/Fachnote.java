import java.util.ArrayList;
/**
 * Klasse, die eine Note für ein bestimmtes Fach darstellt.
 */
public class Fachnote extends Note{
    private Unterrichtsfach unterrichtsfach;
    /**
     * Konstruktor zum Erstellen einer Fachnote.
     */
    Fachnote(Unterrichtsfach unterrichtsfach, String name, Notensystem notensystem) {
        super(name, notensystem);
        this.unterrichtsfach = unterrichtsfach;
    }
    /**
     * Getter-Setter-Methode zum Abrufen des mit dieser Note verknüpften Themas.
     */
    public Unterrichtsfach getUnterrichtsfach() {
        return unterrichtsfach;
    }
    public void setUnterrichtsfach(Unterrichtsfach unterrichtsfach) {
        this.unterrichtsfach = unterrichtsfach;
    }
}
