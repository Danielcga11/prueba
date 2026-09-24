import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {

        // Leer el input de teclado
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un año para saber si es bisiesto:");
        int año = Integer.parseInt(in.readLine());

        // Logica de los años bisiestos
        if ((año % 4 == 0) || año % 100 != 0 && año % 400 == 0) {
            System.out.println("Este año ES bisiesto");
        }
        else {
            System.out.println("Este año NO es bisiesto");
        }
    }
}
