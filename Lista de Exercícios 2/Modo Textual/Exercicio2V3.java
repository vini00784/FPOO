import java.util.Scanner;

class Exercicio2V3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme um número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("\n\tInforme outro número inteiro: ");
        int n2 = sc.nextInt();

        int mod = n1 % n2;

        System.out.print("\n\tMódulo = " + mod);
    }
}