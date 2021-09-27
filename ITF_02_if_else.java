public class Main {

    public static void main(String[] args) {
        // verifica conditii de sus in jos, rand pe rand
        // cand gaseste prima conditie adevarata, executa DOAR acea ramura de cod

        // implementam un calculator de impozit
        int cc = 2400;
        int impozit = 0;

        if (cc < 0) {
            System.out.println("Valoare invalida");
        } else if (cc < 50) {
            impozit = 30;
        } else if (cc < 1000) {
            impozit = 70;
        } else if (cc < 2000) {
            impozit = 160;
        } else {
            impozit = 700;
        }

        System.out.println("Impozitul datorat este " + impozit);

        /* exercitiu:
        declara o variabile in care sa pastrezi viteza actuala a masinii
        declara o variabile in care sa pastrezi viteza maxima admisa in localitate
        implementeaza un computer de bord care verifica viteza masinii
        daca este in legalitate, afiseaza un mesaj "Viteza legala"
        daca a depasit viteza legala afiseaza "Ai depasit viteza legala!"
         */
    }
}
