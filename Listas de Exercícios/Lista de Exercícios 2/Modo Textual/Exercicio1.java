import java.util.Scanner;

class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme um número decimal: ");
        double dec1 = sc.nextDouble();

        System.out.print("\n\tInforme outro número decimal: ");
        double dec2 = sc.nextDouble();

        double ad = dec1 + dec2;
        double sub = dec1 - dec2;
        double mul = dec1 * dec2;
        double div = dec1 / dec2;

        System.out.print("\n Adição = " + ad);
        System.out.print("\n Subtração = " + sub);
        System.out.print("\n Multiplicação = " + mul);
        System.out.print("\n Divisão = " + div);
    }
}