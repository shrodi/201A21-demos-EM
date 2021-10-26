public class Vache {
    //Constante de classe
    public static final int MAX_LONGUEUR_NOM = 10;
    public static final int MIN_Y = 0;
    public static final int MAX_Y = 100;
    //static appartient à la classe et nom à chaque instance
    //final ne peut plus être modifié : donc une constante.
    //les nom de vairable constant sont toujours écrit en majuscule.

    @Override
    public String toString() {
        String str = "Vache{" +
                "x=" + x +
                ", y=" + y +
                ", nom='" + nom + '\'' +
                '}';
        return str;
    }

    //variable de classe : cette variable est commune à la classe. Ça implique que toutes les instances vont aller à la même vitesse.
    private static int vitesse = 1; //vitesse par défaut sera de 1

    //variables d'instance
    private int x;  //int est un type simple
    private int y;
    private String nom;

    //Constructeurs
    public Vache(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;

    }

    //accesseurs et les mutateurs
    private int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVitesse() {
        return vitesse;
    }

    public boolean estDansLesLimites() {
        boolean estDansLesLimitesY;

        estDansLesLimitesY = Vache.YestDanslesLimites(y);

        return estDansLesLimitesY;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    //avancer en y seulement
    public void avancer() {
        boolean yestDansLesLimites = YestDanslesLimites(y + vitesse);
        this.y += vitesse;
    }

    //Cette méthode est static parce qu'elle ne fait pas référence aux variables d'instance.
    //En fait on a pas besoin d'instance pour l'utliser.
    private static boolean YestDanslesLimites(int y) {
        boolean estDanslesLimites;
        estDanslesLimites = Vache.MIN_Y <= y && y <= Vache.MAX_Y;

        return estDanslesLimites;
    }

    public void setNom(String nom) {
        String strDebut = nom.substring(0, Vache.MAX_LONGUEUR_NOM);
        this.nom = strDebut;
    }
}
