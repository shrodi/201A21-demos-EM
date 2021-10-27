public class Cours17Tableau2D {
    public Cours17Tableau2D() {
        testerGetStringTabInt2D();
    }

    private void testerGetStringTabInt2D() {
        int[][] t2d1 = {{1, 2, 3}, {4, 5, 6}}; //tableau de 2 lignes par 3 colonnes
        int[][] t2d2 = {{1, 2, 3}}; //tableau de 1 lignes par 3 colonnes
        int[][] t2d3 = {{1}, {2}, {3}}; //tableau de 3 lignes par 1 colonnes

        afficherMatricesEtMatriceTransposee(t2d1);
        afficherMatricesEtMatriceTransposee(t2d2);
        afficherMatricesEtMatriceTransposee(t2d3);
    }

    private void afficherMatricesEtMatriceTransposee(int[][] t2d) {
        System.out.println("-------------------------------------------");
        System.out.println(getStringTabInt2D(t2d));
        System.out.println("Cette matrice transposée : ");
        System.out.println(getStringTabInt2D(transposerMatrice2D(t2d)));
    }

    private int[][] transposerMatrice2D(int[][] t2d) {
        int[][] matriceTranspose;

        matriceTranspose = new int[t2d[0].length][t2d.length];

        for (int ligne = 0; ligne < t2d.length; ligne++) {
            for (int colonne = 0; colonne < t2d[0].length; colonne++) {
                matriceTranspose[colonne][ligne] = t2d[ligne][colonne];
            }
        }

        return matriceTranspose;
    }

    private String getStringTabInt2D(int[][] t2d) {
        String str = "";
        for (int ligne = 0; ligne < t2d.length; ligne++) {
            for (int colonne = 0; colonne < t2d[ligne].length; colonne++) {
                str += (colonne == 0 ? "{" : ", ") + t2d[ligne][colonne];
            }
            str += "}" + (ligne == (t2d.length - 1) ? "" : "\n");
        }

        return str;
    }

    public static void main(String[] args) {
        new Cours17Tableau2D();
    }
}
