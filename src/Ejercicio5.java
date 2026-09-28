public class Ejercicio5 {
    public static void main(String[] args) {

        int variable1 = 1;
        int variable2 = 2;
        boolean verdadero = variable1 != variable2;
        boolean falso = variable1 == variable2;

        System.out.println("\t \t and  |  or  |  xor");
        System.out.println("--------------------------------------");
        System.out.print(verdadero + "   ");
        System.out.print(verdadero + "   ");
        System.out.print(" | " + verdadero + " | ");
        System.out.print(verdadero + " | ");
        System.out.println(falso);

        System.out.println("--------------------------------------");
        System.out.print(verdadero + "   ");
        System.out.print(falso + "  ");
        System.out.print(" | " + falso + "| ");
        System.out.print(verdadero + " | ");
        System.out.println(verdadero);

        System.out.println("--------------------------------------");
        System.out.print(falso + "   ");
        System.out.print(verdadero + "  ");
        System.out.print(" | " + falso + "| ");
        System.out.print(verdadero + " | ");
        System.out.println(verdadero);

        System.out.println("--------------------------------------");
        System.out.print(falso + "  ");
        System.out.print(falso + "  ");
        System.out.print("| " + falso + " |");
        System.out.print(falso + " | ");
        System.out.println(falso);

    }
}
