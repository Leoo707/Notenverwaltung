/**
 * Diese Klasse erstellt ein Notensystem mit den Noten 1 bis 6.
 */
public class Notensystem1bis6 extends Notensystem {

    /**
     * Wandelt den Wert in den Notentext um
     * @param wert der Note
     */
    @Override
    public void toString(int wert) {
        switch (wert) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
        }
    }
}
