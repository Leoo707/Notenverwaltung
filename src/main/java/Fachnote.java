import java.util.ArrayList;

public class Fachnote extends Note{
    private Unterrichtsfach unterrichtsfach;
    Fachnote(Unterrichtsfach unterrichtsfach, String name, Notensystem notensystem) {
        super(name, notensystem);
        this.unterrichtsfach = unterrichtsfach;
    }
    public Unterrichtsfach getUnterrichtsfach() {
        return unterrichtsfach;
    }
    public void setUnterrichtsfach(Unterrichtsfach unterrichtsfach) {
        this.unterrichtsfach = unterrichtsfach;
    }


}
