import java.util.Scanner;

class Exercicio2V1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme um número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("\n\tInforme outro número inteiro: ");
        int n2 = sc.nextInt();

        double pot_n1 = Math.pow (n1, 5);
        double pot_n2 = Math.pow (n2, 5);

        System.out.print("\n\tPrimeira potência = " + pot_n1);
        System.out.print("\n\tSegunda potência = " + pot_n2);
    }
}