import java.util.Scanner;

class Exercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme um número inteiro: ");
        int variavel1 = sc.nextInt();

        System.out.print("\n\tInforme outro número inteiro: ");
        int variavel2 = sc.nextInt();

        int v1 = variavel1;
        int v2 = variavel2;
        int aux = v1;

        System.out.print("\n\tVariável1: " + v1);
        System.out.print("\n\tVariável2: " + v2);

        v1 = v2;
        v2 = aux;

        System.out.print("\n\tVariável1: " + v1);
        System.out.print("\n\tVariável2: " + v2);
    }
}