import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superhelteListe = new ArrayList<>();



    public void addSuperhero(String navn, String ægteNavn, String superKræft, int oprettelsesÅr,boolean erMenneske,String styrke) {
        superhelteListe.add(new Superhero(navn, ægteNavn, superKræft, oprettelsesÅr, erMenneske, styrke));
    }


}
