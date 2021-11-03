public class Passager {
    public static final int AGE_DEFAUT = 50;
    public static final int POIDS_DEFAUT = 300;
    public static final int AGE_MIN = 0;
    public static final int POIDS_MIN = 0;

    //variable d'instance ou attribut
    private int age;
    private int poids;

    //constructeur par défaut
    public Passager() {
        this(AGE_DEFAUT,POIDS_DEFAUT);
//        this.age = AGE_DEFAUT;
//        this.poids = POIDS_DEFAUT;
    }

    public Passager(int age, int poids) {
        this.age = age;
        this.poids = poids;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!ageEstValide(age))
            throw new IllegalArgumentException("Age invalide : " + age);
        this.age = age;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        //A terminer!!!!
        this.poids = poids;
    }

    public static boolean ageEstValide(int age) {
        boolean estValide;

        estValide = age >= AGE_MIN;

        return  estValide;
    }

    public static boolean poidsEstValide(int poids) {
        boolean estValide;

        estValide = poids >= POIDS_MIN;

        return  estValide;
    }
}
