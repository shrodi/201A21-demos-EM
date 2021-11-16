import java.util.Arrays;

public class Avion {
    private Passager tabPassager[];
    private int nbPassager;

    public Avion(int nbMaxPassager) {
        nbPassager = 0;
        tabPassager = new Passager[nbMaxPassager];
    }

    public void ajouterPassager(Passager passager) {
        if (nbPassager >= tabPassager.length) {
            throw new ArrayIndexOutOfBoundsException("Il y a trop de passager dans l'avion");
        }
        //expliquer différence entre nbPassager++ et ++nbPassager
        tabPassager[nbPassager++] = passager;
    }

    public double getMoyenneAge() {
        double moyenne;
        int total;

        total = 0;
        for (int i = 0; i < nbPassager; i++) {
            total += tabPassager[i].getAge();
        }

        moyenne = total / nbPassager;
        return moyenne;
    }

    public int getPoidsPassager() {
        int total;

        total = 0;
        for (int i = 0; i < nbPassager; i++) {
            total += tabPassager[i].getPoids();
        }

        return total;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Avion{";
        str += " nombre de passager = " + nbPassager;
        str += ", moyenne d'âge = " + (nbPassager == 0 ? "Aucun passager" : getMoyenneAge());
        str += ", poids des passagers = " + getPoidsPassager();
        str += ", tabPassager = " + Arrays.toString(tabPassager);
        str += '}';
        return str;
    }
}
