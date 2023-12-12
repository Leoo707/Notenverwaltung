import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    //Erstellen eines Scanners und Aufrufen der setGradesystem Methode um das Bewertungssystem vom Nutzer zu erhalten
    public static <choice> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Notensystem notensystem = setGradesystem();
        //Check das ein gültiges Bewertungssytem ausgewählt wurde
        if (notensystem != null) {
            System.out.println("Notensystem: " + notensystem.getClass().getSimpleName());
            System.out.println("Wie lautet der Name der Klasse?");
        } else {
            //Programm wird mit Error Code 1 beendet und dies wird ausgegeben
            System.out.println("Ungültige Eingabe. Programm wird beendet.");
            System.exit(1);
        }
        Klasse klasse = new Klasse();

        String className = input.nextLine();

        klasse.setName(className);

        System.out.printf("Geben sie die Anzahl der Fächer an: ");

        int subjectAmount = input.nextInt();

        System.out.println("Geben sie die Fächer der KLasse " + klasse.getName() + " ein: ");
        //Schleife, um die Namen der einzelnen Fächer zu lesen und sie der Array-Liste Fächer hinzuzufügen
        for (int i = 0; i <= subjectAmount; i++) {
            String subjectName = input.nextLine();
            klasse.setFaecher(subjectName);
        }

        //Test
        System.out.println(klasse.getFaecher());

        //ich mach dann noch was oder morgen halt
    }
    public static Notensystem setGradesystem() {
        Scanner input = new Scanner(System.in);

        System.out.println("Wilkommen zum Notenberechnungs-Programm!");
        System.out.println("Welches Notensystem wünschen Sie?");
        System.out.println("1: 1 bis 6, 2: 0 bis 15, 3: 0 bis 100");

        String choice = input.nextLine();

        return switch (choice) {
            case "1" -> new Notensystem1bis6();
            case "2" -> new Notensystem0bis15();
            case "3" -> new Notensystem0bis100();
            default -> {
                System.out.printf("Ungültige Eingabe!");
                yield null;
            }
        };
    }
}
