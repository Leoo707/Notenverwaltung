public class Notensystem0bis100 extends Notensystem {
    public void toString(int wert) {
        if (wert >= 90 && wert <= 100) {
            System.out.println("Sehr gut");
        } else if (wert >= 75 && wert <= 89.99) {
            System.out.printf("Gut");
        } else if (wert >= 60 && wert <= 74.99) {
            System.out.printf("Befriedigend");
        } else if (wert >= 50 && wert <= 59.99) {
            System.out.printf("Ausreichend");
        } else if (wert >= 0 && wert <= 49.99) {
            System.out.printf("Ungenügend");
        }
    }
}
