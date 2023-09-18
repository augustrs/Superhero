import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superhelteListe = new ArrayList<>();

    public void addSuperhero(String navn, String ægteNavn, String superKræft, int oprettelsesÅr, boolean erMenneske, String styrke) {
        superhelteListe.add(new Superhero(navn, ægteNavn, superKræft, oprettelsesÅr, erMenneske, styrke));
    }

    public void printAntalSuperhelte() {
        System.out.println(superhelteListe.size());
    }

    public void printAlleSuperhero() {
        for (Superhero superhelt : superhelteListe) {
            System.out.println(superhelt);
        }
    }
    public Superhero search(String superheroNavn) {
        for (Superhero superhero : superhelteListe) {
            if(superhero.getNavn().equals(superheroNavn)) {
                return superhero;
            }
        }
        return null;
    }


}

