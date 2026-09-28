import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe tu nombre: ");
        long t0 = System.currentTimeMillis();
        String nombre = in.readLine();
        long t1 = System.currentTimeMillis();
        double t = (t1 - t0) / 1000d;
        System.out.printf("Hola %s. Has tardado en escribir tu nombre %.2f segundos", nombre, t);




    }
}
