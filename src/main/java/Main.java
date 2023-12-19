import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    //Erstellen eines Scanners und Aufrufen der setGradesystem Methode um das Bewertungssystem vom Nutzer zu erhalten
    public static void main(String[] args) {
        Klasse klasse = new Klasse();
        Notensystem notensystem = setGradesystem();
        Scanner input = new Scanner(System.in);
        //Check das ein gültiges Bewertungssytem ausgewählt wurde
        if (notensystem != null) {
            System.out.println(notensystem.getClass().getSimpleName());
            setGrades(notensystem);
            System.out.println("Wie lautet der Name der Klasse?");
        } else {
            //Programm wird mit Error Code 1 beendet und dies wird ausgegebenss
            System.out.println("Ungültige Eingabe. Programm wird beendet.");
            System.exit(1);
        }

        String className = input.nextLine();

        klasse.setName(className);

        System.out.println("Geben sie die Anzahl der Fächer an: ");

        int subjectAmount = input.nextInt();

        input.nextLine();

        System.out.println("Geben sie die Fächer der KLasse " + klasse.getName() + " ein: ");
        //Schleife, um die Namen der einzelnen Fächer zu lesen und sie der Array-Liste Fächer hinzuzufügen
        for (int i = 1; i <= subjectAmount; i++) {
            String subjectName = input.nextLine();
            klasse.setFaecher(subjectName);
        }

        //Test
        System.out.println(klasse.getFaecher());

        System.out.println("Wie lautet die Anzahl der Schüler?");

        int amountStudents = input.nextInt();

        input.nextLine();

        System.out.println("Namen: ");

        for (int i = 1; i <= amountStudents; i++) {
            String students = input.nextLine();
            klasse.setSchueler(students);
        }
        //Test schueler
        System.out.println(klasse.getSchueler());

        unternoten(klasse, notensystem);
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
    public static void setGrades(Notensystem notensystem) {
        switch (notensystem.getClass().getSimpleName()) {
            case "Notensystem1bis6":
                notensystem.setSchlechtesteNote(6);
                notensystem.setBesteNote(1);
                break;
            case "Notensystem0bis15":
                notensystem.setSchlechtesteNote(15);
                notensystem.setBesteNote(0);
                break;
            case "Notensystem0bis100":
                notensystem.setSchlechtesteNote(100);
                notensystem.setBesteNote(0);
                break;
            default:
                System.out.println("Dieses Notensystem existiert in diesem Rechner nicht, Sie Knecht!");
                break;
        }
    }
    public static void unternoten(Klasse klasse, Notensystem notensystem) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> classAverage = new ArrayList<>();
        for (int i = 0; i < klasse.getFaecher().size(); i++) {
            System.out.println("Notenanzahl für das Fach: " + klasse.getFaecher().get(i));
            int amountGrades = input.nextInt();
            System.out.println("Beträgt: " + amountGrades);
            ArrayList<Float> classSubjectAverage = new ArrayList<>();
            for (int j = 0; j < klasse.getSchueler().size(); j++) {
                System.out.println("Noten für den/die Schüler*in: " + klasse.getSchueler().get(j));
                int k = 0;
                int durchschnitt = 0;
                ArrayList<Note> unterNotenListe = new ArrayList<>();
                while (k < amountGrades) {
                    int grades = input.nextInt();
                    if (grades <= notensystem.getSchlechtesteNote() && grades >= notensystem.getBesteNote()) {
                        k++;
                        Note unterNoten = new Note(klasse.getSchueler().get(j), notensystem, grades);
                        unterNoten.setWert(grades);
                        unterNoten.setUnternote();
                        unterNotenListe.add(unterNoten);
                        durchschnitt += grades;
                    } else {
                        System.out.println("Als was arbeiten Sie?");
                    }
                    input.nextLine();
                }
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Die Note(n) für den/die Schüler*in " + klasse.getSchueler().get(j) + ":");
                System.out.println("Im Fach: " + klasse.getFaecher().get(i));
                for (Note unterNote : unterNotenListe) {
                    System.out.println("Unternote: " + unterNote.getUnternote());
                }
                for (Note unterNote : unterNotenListe) {
                    System.out.printf(unterNote.toString());
                }
                float durchschnittUnternote = (float) durchschnitt / amountGrades;
                System.out.println("Der Durschnitt für das Fach: " + klasse.getFaecher().get(i) + " beträgt:");
                System.out.println(durchschnittUnternote);
                System.out.println("-------------------------------------------------------------------------");
                classSubjectAverage.add(durchschnittUnternote);
            }
            float gesamtDurchschnitt = 0;
            for (float klassenDurchschnitt : classSubjectAverage) {
                gesamtDurchschnitt += klassenDurchschnitt;
            }
            gesamtDurchschnitt /= classSubjectAverage.size();
            classAverage.add(gesamtDurchschnitt);
        }
        System.out.println("Fachdurchschnitte der Klasse " + klasse.getName() + ":" +
                "");
        for (int i = 0; i < klasse.getFaecher().size(); i++) {
            System.out.println(klasse.getFaecher().get(i) + ": " + classAverage.get(i));
        }
    }
}
