import java.util.ArrayList;

public class Database {
    private Superhero[] superhelteListe;
    int count = 0;

    public Database(){
        this.superhelteListe = new Superhero[5];
    }

    ArrayList<Superhero> superhelteliste = new ArrayList<>();

    public void addSuperhero(String navn, String ægteNavn, String superKræft, int oprettelsesÅr,boolean erMenneske,String styrke) {
        superhelteListe[count++] = new Superhero(navn, ægteNavn, superKræft, oprettelsesÅr, erMenneske, styrke);
    }


}
