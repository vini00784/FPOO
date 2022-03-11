import java.util.Scanner;

class Exercicio2V4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme um número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("\n\tInforme outro número inteiro: ");
        int n2 = sc.nextInt();

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        System.out.print("\n\tRaiz 1 = " + raiz1);
        System.out.print("\n\tRaiz 2 = " + raiz2);
    }
}