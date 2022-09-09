public class StringiDemo {
    public static void main(String[] args) {

        String name = "Konrad";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println("Imię orig: " + name + ", Długość " + dlugosc +", " + male + ", " + duze);

    }
}
