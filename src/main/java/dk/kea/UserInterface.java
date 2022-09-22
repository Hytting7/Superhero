package dk.kea;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Database database = new Database();

        while (true) {
            System.out.println("Velkommen til SUPERHERO UNIVERSET");
            System.out.println("1. Opret en superhelt");
            System.out.println("2. Indlæs superhelte");
            System.out.println("3. Redigér superhelte");
            System.out.println("4. Slet superhelte");
            System.out.println("5. Søg i superhelte");
            System.out.println("9. Afslut program");

            Scanner scanner = new Scanner(System.in);
            //scanner.useLocale(Locale.english);


            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("Indtast navn: ");
                    String navn = scanner.nextLine();
                    System.out.println("Indtast superheltenavn: ");
                    String superhelteNavn = scanner.nextLine();
                    System.out.println("Indtast superkraft: ");
                    String superkraft = scanner.nextLine();
                    System.out.println("Indtast oprindelsesår: ");
                    int oprindelsesår = scanner.nextInt();
                    System.out.println("Menneske j/n?: ");
                    boolean erMenneske = scanner.nextBoolean();
                    System.out.println("Styrke: ");
                    double styrke = scanner.nextDouble();
                    Superhero mySuperhero = new Superhero(navn, superhelteNavn, superkraft, oprindelsesår, erMenneske, styrke);
                    database.createsuperhero(mySuperhero);
                    break;
                case 2:
                    System.out.println("Liste af superhelte ");
                    System.out.println(database.superheroes);

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    for (Superhero superhero : database.searchForSuperheroes(scanner.nextLine())) {
                        System.out.println(superhero);
                    }

                    break;
                case 9:
                    System.out.print("Programmet er afsluttet");
                    System.exit(0);

                    break;

                default:
            }
        }
    }
}
