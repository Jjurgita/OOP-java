package bit.obj.p16.streams.demo7;

import java.io.*;

public class Main {
    public static void main(String... args) {

        long startTime = System.nanoTime();

        try (
                // paprastai reikia nurodyti kaip užkoduotas failas!!!
                Reader in = new InputStreamReader(new FileInputStream("src/bit/obj/p16/streams/info-iso-8859-13.txt"),"ISO-8859-13");
                Writer out = new FileWriter("src/bit/obj/p16/streams/output.txt");
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Laikas: " + (estimatedTime / 1e6) + "ms");
    }
}
