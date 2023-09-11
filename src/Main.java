import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast navnet på din superhelt: ");
        String name = scanner.nextLine();
        System.out.println("Indtast superkræften på din superhelt: ");
        String superPower = scanner.nextLine();
        System.out.println("Indtast superheltens creation year: ");
        int oprettelsesÅr = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Indtast superheltens styrke: ");
        String styrke = scanner.nextLine();


        System.out.println(name);
        System.out.println(superPower);
        System.out.println(oprettelsesÅr);
        System.out.println(styrke);
    }
}
