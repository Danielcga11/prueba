public class Ejercicio1y2 {
    public static void main(String[] args) {
        // Declaracion de variables
        int a = -9, b = 21, c = -35, d = 51, e = 33, f, resultadoIntermedio, resultado;
        // Operaciones
        f = (a + b) * e;
        resultadoIntermedio = d % c;
        resultado = f / resultadoIntermedio;
        //Ejercicio 2
        boolean comparacion1 = a < b;
        boolean comparacion2 = c != d;
        // Imprimir resultados del primer ejercicio
        System.out.println("Resultados del Ejercicio 1");
        System.out.println(f);
        System.out.println(resultado);
        System.out.println("Resultados del Ejercicio 2");
        System.out.println(comparacion1);
        System.out.println(comparacion2);
    }
}
