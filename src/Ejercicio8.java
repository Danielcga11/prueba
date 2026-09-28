public class Ejercicio8 {
    public static void main(String[] args) {
        double radio = Double.parseDouble(IO.readln("Radio: "));
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);

    }
}
