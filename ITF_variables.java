public class ITF_variables {
    public static void main(String[] args) {
        /*
        variabile = zone din memorie care tin date (incep cu litera mica, nu contin spatii)
        ex: int viteza_maxima = 50;

        cateva tipuri de date importante:
        String - sir de caractere, delimitate de ghilimele duble (ex: "IT Factory")
        int - nr intreg (ex: 3)
        double - nr zecimal (ex: 3.14)
        boolean - adevarat sau fals (ex: true/false)
        */

        String marca = "Golf";
        String model = "IV";
        int an_fabricatie = 2011;
        double consum = 8.7;
        boolean inmatriculata = true;

        System.out.println("Vand " + marca + " " + model + ", fabricat in " + an_fabricatie);
        System.out.println("Nu bate nu troncane. Pentru pretentiosi. Pret negociabil");
    }
}
