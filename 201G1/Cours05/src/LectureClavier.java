import java.util.Scanner; //Importer la libraire du Scanner

public class LectureClavier {
    public LectureClavier() {
        lireEtAfficherNom();
    }


    public void lireEtAfficherNom() {
        Scanner sc; //Instance de l'utilitaire de lecture
        String nom;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture

        System.out.println("Entrez votre nom : ");

//Appel d’une méthode qui récupère une chaine de caractères saisis au clavier.
        nom = sc.nextLine();

        System.out.println("Votre nom est : " + nom);
    }


    public static void main(String[] args) {
        new LectureClavier();
    }
}
