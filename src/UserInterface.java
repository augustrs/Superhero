import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();
    int menuValg;


    public void addSuperhero() {
        database.addSuperhero("August", "Aughul", "Roidmonster", 2002, false, "bænk");
        database.addSuperhero("Joakim", "Kimbo", "Javamesteren", 2001, false, "beast");
        database.addSuperhero("Thomas", "Tog", "Snusdræberen", 2002, true, "flække en pakke på rekort tid");
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

    public void StartProgram() {
        System.out.println("Velkommen til SUPERHERO UNIVERSET.\nTast 1 for at oprette en ny superhelt.\nTast 3 for at printe din superhelte-database\nTast 4 for at søge efter en oprettet superhelt\nTast 9 for at afslutte.");
        
    }
    public void printAlleSuperhero () {
        database.printAlleSuperhero();
        System.out.println("Du har indtil videre oprettet så mange superhelte: ");
        database.printAntalSuperhelte();
    }


}
