import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotenEingabe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();


        while (true) {
            System.out.println("FÜr welches Fach sollen Noten für die Schüler der Klasse eingeben werden?");
            System.out.println("Klasse: ");
            String className = input.nextLine();
            Klasse klasse = new Klasse(); // Annahme: Es gibt eine Klasse-Klasse mit einem Konstruktor, der den Klassennamen akzeptiert.
            klasse.setFaecher("Mathe");
            klasse.setFaecher("Deustch");
            System.out.println("Fach (stop zum Beenden): ");
            String subjectName = input.nextLine();

            while (!subjectName.equals("stop")) {
                if (klasse.getFaecher().contains(subjectName)) {
                    while (true) {
                        System.out.println("Anzahl Noten für das gewünschte Fach: ");
                        int amountUnderGrades = input.nextInt();
                        input.nextLine(); // Leerzeichen konsumieren

                        int totalUnternote = 0;
                        for (int i = 0; i < amountUnderGrades; i++) {
                            System.out.println("Note " + (i + 1) + ": ");
                            int wert = input.nextInt();
                            totalUnternote += wert;
                        }

                        int averageUnternote = totalUnternote / amountUnderGrades;
                        map.put(subjectName, averageUnternote);

                        // Test map
                        System.out.println(map);

                        System.out.println("Möchten Sie mehr Noten für das gleiche Fach eingeben? (ja/nein): ");
                        String mehrNoten = input.nextLine();
                        if (!mehrNoten.equalsIgnoreCase("ja")) {
                            break; // Verlasse die innere Schleife
                        }
                    }
                } else {
                    System.out.println("Der eingegebene Name stimmt nicht mit den angegebenen Fachnamen überein!");
                }
                System.out.println("Fach (stop zum Beenden): ");
                subjectName = input.nextLine();
            }

            System.out.println("Möchten Sie Noten für ein anderes Fach eingeben? (ja/nein): ");
            String weiteresFach = input.nextLine();
            if (!weiteresFach.equalsIgnoreCase("ja")) {
                break; // Verlasse die äußere Schleife
            }
        }

        input.close();
    }
}

//*  System.out.println("FÜr welches Fach sollen Noten für die Schüler der Klasse " + klasse.getName() + " eingegeben werden? \n stop um Noteneingabe zu beenden.");
//            String subjectName = input.nextLine();
//            if (klasse.getFaecher().contains(subjectName)) {
//                System.out.println("Anzahl Noten für das gewünschte Fach: ");
//                int amountUnderGrades = input.nextInt();
//                for (int i = 0; i < amountUnderGrades; i++) {
//                    System.out.println("Noten Wert: ");
//                    int wert = input.nextInt();
//                    note.setUnternote(wert);
//                }
//                map.put(subjectName, note.getUnternote());
//                //test map
//                System.out.println(map);
//            } else if (subjectName.equals("stop")){
//                break;
//            } else {
//                System.out.println("Der eingegebene Name stimmt nicht mit den angegebenen Fachnamen überein!");
//                continue;
//            }


//  while (true) {
//            System.out.println("FÜr welches Fach sollen Noten für die Schüler der Klasse " + klasse.getName() + " eingegeben werden? \n stop um Noteneingabe zu beenden.");
//            String subjectName = input.nextLine();
//            while (!subjectName.equals("stop")) {
//                if (klasse.getFaecher().contains(subjectName)) {
//                    System.out.println("Anzahl Noten für das gewünschte Fach: ");
//                    int amountUnderGrades = input.nextInt();
//                    for (int i = 0; i < amountUnderGrades; i++) {
//                        System.out.println("Noten Wert: ");
//                        int wert = input.nextInt();
//                        note.setUnternote(wert);
//                    }
//                    map.put(subjectName, note.getUnternote());
//                    System.out.println(note.getUnternote());
//                    //test map
//                    System.out.println(map);
//                } else {
//                    System.out.println("Der eingegebene Name stimmt nicht mit den angegebenen Fachnamen überein!");
//                    break;
//                }
//                //subjectName = input.nextLine();
//            }
//            System.out.println("Möchten Sie Noten für ein anderes Fach eingeben? (ja/nein): ");
//            String weiteresFach = input.nextLine();
//            if (!weiteresFach.equalsIgnoreCase("ja")) {
//                break;
//            };
//        }
//
//        System.out.println(map);
//    }



//    public static ArrayList<Note> unternoten(Klasse klasse, Notensystem notensystem) {
//        Scanner input = new Scanner(System.in);
//        ArrayList<Note> unterNotenListe = new ArrayList<>();
//        int durchschnitt = 0;
//        for (int i = 0; i < klasse.getFaecher().size(); i++) {
//            System.out.println("Notenanzahl für das Fach: " + klasse.getFaecher().get(i));
//            int amountGrades = input.nextInt();
//            System.out.println("Beträgt: " + amountGrades);
//            for (int j = 0; j < klasse.getSchueler().size(); j++) {
//                System.out.println("Noten für den/die Schüler*in: " + klasse.getSchueler().get(j));
//                int k = 0;
//                while (k < amountGrades) {
//                    int grades = input.nextInt();
//                    if (grades <= notensystem.getSchlechtesteNote() && grades >= notensystem.getBesteNote()) {
//                        k++;
//                        Note unterNoten = new Note(klasse.getSchueler().get(j), notensystem, grades);
//                        unterNoten.setUnternote();
//                        unterNotenListe.add(unterNoten);
//                    } else {
//                        System.out.println("Als was arbeiten Sie?");
//                    }
//                    input.nextLine();
//                }
//                System.out.println("Die Note(n) für den/die Schüler*in " + klasse.getSchueler().get(j) + ":");
//                System.out.println("Im Fach: " + klasse.getFaecher().get(i));
//                for (Note unterNote : unterNotenListe) {
//                    System.out.println("Unternote: " + unterNote.getUnternote());
//                }
//
//            }
//        }
//        return unterNotenListe;
//    }