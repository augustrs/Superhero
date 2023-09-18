import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        int menuValg;

        do {
            System.out.println("Velkommen til SUPERHERO UNIVERSET.\nTast 1 for at oprette en ny superhelt.\nTast 3 for at printe din superhelte-database\nTast 4 for at søge efter en oprettet superhelt\nTast 9 for at afslutte.");
            menuValg = scanner.nextInt();
            scanner.nextLine();


            if (menuValg == 1) {

                System.out.println("Indtast navnet på din superhelt: ");
                String navn = scanner.nextLine();
                System.out.println("Indtast din superhelts rigtige navn: ");
                String ægteNavn = scanner.nextLine();
                System.out.println("Indtast superkræften på din superhelt: ");
                String superKræft = scanner.nextLine();
                System.out.println("Indtast superheltens creation year: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Du skal indtaste et tal: ");
                    scanner.nextLine();
                }
                int oprettelsesÅr = scanner.nextInt();

                scanner.nextLine();
                System.out.println("Indtast superheltens styrke: ");
                String styrke = scanner.nextLine();
                System.out.println("Er superhelten menneske? (j/n): ");
                char menneske = scanner.next().charAt(0);
                boolean erMenneske = false;
                if (menneske == 'j') {
                    erMenneske = true;
                }
                if (menneske == 'n') {
                    erMenneske = false;
                }

                database.addSuperhero(navn, ægteNavn, superKræft, oprettelsesÅr, erMenneske, styrke);

            }
            else if (menuValg == 3) {
                database.printAlleSuperhero();
                System.out.println("Du har indtil videre oprettet så mange superhelte: ");
                database.printAntalSuperhelte();
            }
            else if (menuValg == 4) {
            System.out.println("Indtast navnet på superhelten, du vil søge efter: ");
            String superheroName = scanner.nextLine();
            Superhero foundSuperhero = database.search(superheroName);

            if (foundSuperhero != null) {
                System.out.println("Superhelt fundet:");
                System.out.println(foundSuperhero);
            } else {
                System.out.println("Superhelten med navnet '" + superheroName + "' blev ikke fundet.");
            }
        }

        } while (menuValg != 9);
        System.out.println("System exit.");
    }

}

