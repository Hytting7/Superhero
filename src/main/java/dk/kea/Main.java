package dk.kea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        System.out.println("Velkommen til SUPERHERO UNIVERSET");
        System.out.println("1. Opret en superhelt");
        System.out.println("9. Afslut");

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();


        switch (operation){
            case 1:
                System.out.println("Indtast navn: ");
                String navn = scanner.next();
                System.out.println("Indtast superheltenavn: ");
                String superhelteNavn = scanner.next();
                System.out.println("Indtast superkraft: ");
                String superkraft = scanner.next();
                System.out.println("Indtast oprindelsesår: ");
                int oprindelsesår = scanner.nextInt();
                System.out.println("Menneske j/n?: ");
                boolean erMenneske = scanner.nextBoolean();
                System.out.println("Styrke: 1");
                double styrke = scanner.nextDouble();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 9:
                break;

            default:
        }




        //Superhero[] superheroes = {navn,superhelteNavn,superkraft,oprindelsesår,erMenneske,styrke};


        //database.createSuperhero(navn,superhelteNavn,superkraft,oprindelsesår,erMenneske,styrke);

    }
}

