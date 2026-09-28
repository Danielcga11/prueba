public class Ejercicio7 {
    public static void main(String[] args) {


        double tiempo = Double.parseDouble(IO.readln("Tiempo: "));
        double espacioRecorrido = (5 * tiempo) + ((2 * tiempo * tiempo) / 2);
        System.out.println("El espacio recorrido en " + tiempo + " es de " + espacioRecorrido + " metros");
    }
}
