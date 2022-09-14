package podstawy;

public class Zmienne {
    public static void main(String[] args) {

        int liczba;
        liczba = 1234;

        double liczba2 = 12345.7;

        System.out.println("Moja liczba wynosi " + liczba+ ", " + liczba2);

        int workHours;

        int dayHours = 8;
        int days = 5;
        int weeks = 52;

        workHours = dayHours % (days * weeks);

        System.out.println("Ilośc godzin pracujących w roku to: " + workHours);

        char litera = '#';

        String napis = "Jakiś \n krótki \n \"tekst\"";

        System.out.println("Moj \"znak\" " + litera + " Mój napis " + napis);
        System.out.print("Moj \t znak \n " + litera + " Mój napis " + napis);
        System.out.print("Moj\n znak " + litera + " Mój napis " + napis);

        boolean twierdzenie = true; //false

       // https://github.com/przemjan/trzeciad2023
    }
}
