public class Main {

    public static void main(String[] args) {

        // while = atat timp cat conditia inca e adevarata, execut codul dintre acolade

        int benzina_ramasa = 7;

        // cat timp mai avem benzina, putem accelera, masina merge
        while (benzina_ramasa>0) {
            System.out.println("Vruuum! Vruuum!");
            // in timp ce masina accelereaza, se consuma 1L de benzina
            benzina_ramasa = benzina_ramasa - 1;
        }

        // nu mai avem benzina
        System.out.println("STOP!");

        /* exercitiu:
        Super mario are 3 vieti
        De fiecare data cand moare ii scadem o viata
        Dupa ce nu mai are vieti afisam "Game Over!"
         */
    }
}
