import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast navnet på din superhelt: ");
        String name = scanner.nextLine();
        System.out.println("Indtast din superhelts rigtige navn: ");
        String ægteNavn = scanner.nextLine();
        System.out.println("Indtast superkræften på din superhelt: ");
        String superKræft = scanner.nextLine();
        System.out.println("Indtast superheltens creation year: ");
        int oprettelsesÅr = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Er superhelten menneske? (j/n): ");
        char menneske = scanner.next().charAt(0);
        boolean erMenneske = false;
        if (menneske == 'j') {
            erMenneske = true;
        } if (menneske == 'n') {
            erMenneske = false;
        }

        System.out.println("Indtast superheltens styrke: ");
        String styrke = scanner.nextLine();


        System.out.println(name);
        System.out.println(superKræft);
        System.out.println(oprettelsesÅr);
        System.out.println(styrke);
        System.out.println(erMenneske);
    }
}
