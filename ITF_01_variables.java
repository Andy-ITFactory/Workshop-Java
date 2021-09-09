public class ITF_01_variables {
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

        // declaram si initializam variabile
        String marca = "Golf";
        String model = "IV";
        int an_fabricatie = 2011;
        double pret = 790.50;
        boolean inmatriculata = true;

        // suprascriem variabila pret (mai lasam din pret)
        pret = 690.90;

        // printam in consola mesaje, folosindu-ne de datele salvate in variabile
        System.out.println("Vand " + marca + " " + model + ", fabricat in " + an_fabricatie + ".");
        System.out.println("Nu bate nu troncane. Pentru pretentiosi. Pret: " + pret + " euro.");

        /* exercitiu:
        declara o variabila in care sa pastrezi viteza actuala a masinii (ex: 50)
        printeaza un mesaj "Viteza actuala este de 50 km/h", folosind variabila de mai sus
         */
    }
}
