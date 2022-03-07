import java.util.Scanner;

class Exercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme o valor em dólar: ");
        double dol = sc.nextDouble();

        System.out.print("\n\tInforme a taxa de câmbio: ");
        double taxa = sc.nextDouble();

        double real = dol * taxa;

        System.out.print("\n\tEsse valor em real é " + real);
    }
}