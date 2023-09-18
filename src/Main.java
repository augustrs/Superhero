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

