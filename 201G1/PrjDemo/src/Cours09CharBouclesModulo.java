public class Cours09CharBouclesModulo {
    public Cours09CharBouclesModulo() {
        demoChar();
    }

    private void demoChar() {
        char lettre;
        String pays;

        lettre = 'a';

        pays = "Canad";

        pays += lettre;

        System.out.println("lettre vaut " + lettre);
        System.out.println("pays vaut " + pays);
    }

    public static void main(String[] args) {
        new Cours09CharBouclesModulo();
    }
}
