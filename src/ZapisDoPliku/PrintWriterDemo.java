package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Mateusz lubi tańczyć :)");

        //zapisanie kolejnej linii
        pw.println("Konrad lubi grać");

        pw.close();
    }
}
