public abstract class Notensystem {
    private int besteNote;
    private int schlechtesteNote;
    private int inkrement;
    private String name;
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
