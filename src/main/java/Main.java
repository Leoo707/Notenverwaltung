import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static <choice> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> subjectGrades = new HashMap<String, Integer>();
        Notensystem notensystem = setGradesystem();

        if (notensystem != null) {
            System.out.println("Notensystem: " + notensystem.getClass().getSimpleName());
            System.out.println("Wie lautet der Name der Klasse?");
        } else {
            System.out.println("Ungültige Eingabe. Programm wird beendet.");
            System.exit(1);
        }

        Klasse klasse = new Klasse();

        String className = input.nextLine();

        klasse.setName(className);

        System.out.println("Geben sie die Anzahl der Fächer an: ");

        int subjectAmount = input.nextInt();

        System.out.println("Geben sie die Fächer der KLasse " + klasse.getName() + " ein: ");

        for (int i = 0; i <= subjectAmount; i++) {
            String subjectName = input.nextLine();
            klasse.setFaecher(subjectName);
        }

        //Test
        System.out.println(klasse.getFaecher());

        Schueler schueler = new Schueler();

        System.out.printf("Wie lautet die Anzahl der Schüler?");

        int amountStudents = input.nextInt();

        for (int i = 0; i <= amountStudents; i++) {
            String students = input.nextLine();
            klasse.setSchueler(students);
        }

        //Test schueler
        System.out.println(klasse.getSchueler());

        System.out.println("FÜr welches Fach sollen Noten für die Schüler der Klasse " + klasse.getName() + " eingegeben werden?");

        String subjectName = input.nextLine();

        if (klasse.getFaecher().contains(subjectName)) {
            System.out.println("Noten für das gewünschte Fach: ");
            int grade = input.nextInt();
            subjectGrades.put(subjectName, grade);
            System.out.println(subjectGrades);
        }
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
                System.out.println("Es ist Mumpitz passiert... ");
                yield null;
            }
        };
    }
}
