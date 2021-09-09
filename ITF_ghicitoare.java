import java.util.Scanner;

public class ITF_ghicitoare {

    public static void main(String[] args) {

        // joculet ghicitoare numar secret
        // ghiceste un numar intre 1-30, afiseaza hint-uri < sau mai >
        int numar = 5;
        int numar_ghicit = 0;
        while (numar_ghicit != numar){ // atat timp cat inca nu s-a ghicit nr, continua jocul
            System.out.println("Ghiceste un numar intre 1-30");
            Scanner scanner = new Scanner(System.in); // avem nevoie de scanner ca sa preluam date de la tastatura
            numar_ghicit = scanner.nextInt(); // luam urmatorul numar de la tastatura
            if ( numar_ghicit == numar){ // daca numarul este acelasi
                System.out.println("Felicitari"); // jucatorul castiga
            } else if (numar_ghicit < numar){ // altfel, daca nr_ghicit < nr, dam un indiciu jucatorului
                System.out.println("Alege un nr mai mare");
            } else { // daca nu e egal, nici mai mic, automat e mai mare, nu avem nevoie de conditie explicita
                System.out.println("Alege un nr mai mic");
            }
        }
    }
}
