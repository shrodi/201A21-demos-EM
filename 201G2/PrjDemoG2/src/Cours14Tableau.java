public class Cours14Tableau {
    public Cours14Tableau() {
        testerTableau();
    }

    // 1 - saisir un certain nombre de notes entre 0 et 100
    // 2 - afficher la moyenne de ceux-ci
    // 3 - afficher toutes les notes parmi celles-ci qui sont au-dessus de la moyenne.
    public void saisirEtAfficherNotesAuDessusMoyenne() {
        int tabNotes[];
        int nbNotesASaisir;

        nbNotesASaisir = lireEntierValide("Combien de notes à saisir?", 0, 25);
    }


    private void testerTableau() {
        int tab[]; // création de la variable qui fewra une référence au tableau.

        tab = new int[6]; //création d'un tableau de 6 éléments indicé de 0 à 5. Longueur fixe

        tab[0] = 4;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * 2;
        }

        for (int i = 0; i < tab.length;i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }

    public static void main(String[] args) {
        new Cours14Tableau();
    }
}
