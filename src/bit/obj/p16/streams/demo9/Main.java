package bit.obj.p16.streams.demo9;

import java.io.*;

public class Main {
    public static void main(String... args) {

        long startTime = System.nanoTime();

        try (
                InputStream in = new BufferedInputStream(new FileInputStream("src/bit/obj/p16/streams/info-iso-8859-13.txt"));
                OutputStream out = new BufferedOutputStream(new FileOutputStream("src/bit/obj/p16/streams/output.txt"));
        ){
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
