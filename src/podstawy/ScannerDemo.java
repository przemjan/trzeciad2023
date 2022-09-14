package podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        int numerButa = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj średnią: ");
        double average = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Podaj swoje imię: ");
        String name = keyboard.nextLine();

        System.out.println("Numer buta: " + numerButa +
                " Twoja średnia: "+ average + "Imię: " + name);
    }
}
