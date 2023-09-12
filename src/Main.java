import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
            System.out.println("Indtast navnet på din superhelt: ");
            String navn = scanner.nextLine();
            System.out.println("Indtast din superhelts rigtige navn: ");
            String ægteNavn = scanner.nextLine();
            System.out.println("Indtast superkræften på din superhelt: ");
            String superKræft = scanner.nextLine();
            System.out.println("Indtast superheltens creation year: ");
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
            Superhero superhero = new Superhero(navn, ægteNavn, superKræft, oprettelsesÅr, erMenneske, styrke);
            database.addSuperhero(navn, ægteNavn, superKræft, oprettelsesÅr, erMenneske, styrke);
        }

    }

