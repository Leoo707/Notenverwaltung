/**
 * Diese Klasse erstellt ein Notensystem mit den Noten 0 - 15.
 */
public class Notensystem0bis15 extends Notensystem {
    /**
     * Wandelt die Notenpunkte in die Textform um.
     * @param wert der Note
     */
    @Override public void toString (int wert) {
        switch (wert) {
            case 0:
                System.out.println("Ungenügend");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Mangelhaft");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Ausreichend");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Befriedigend");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Gut");
                break;
            case 13:
            case 14:
            case 15:
                System.out.println("Sehr gut");
                break;
        }
    }

}
