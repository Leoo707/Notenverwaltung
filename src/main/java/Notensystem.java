/**
 * Diese Klasse bestimmt die jeweils besten und schlechtesten Noten aus den jeweiligen angehörigen Notensystemen.
 *
 */
public abstract class Notensystem {
    /**
     * Felder zum Speichern von Informationen über das Bewertungssystem.
     */

    private int besteNote;
    private int schlechtesteNote;
    private int inkrement;
    private String name;
    /**
     * Wir benutzen "getter" und "setter" um "beste Note" , "schlechteste Note" und "Inkrement" zu bestimmen.
     */
    public void setBesteNote(int besteNote) {
       this.besteNote = besteNote;
    }
    public int getBesteNote() {
        return besteNote;
    }
    public void setSchlechtesteNote(int schlechtesteNote) {
        this.schlechtesteNote = schlechtesteNote;
    }
    public int getSchlechtesteNote() {
        return schlechtesteNote;
    }
    public int getInkrement() {
        return inkrement;
    }

    /**
     * Wandelt die Noten in die Textform um.
     * @param wert
     */
    public abstract void toString(int wert);
}
