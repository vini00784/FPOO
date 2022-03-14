import java.util.Scanner;

class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe  um número inteiro: ");
        int n1 = sc.nextInt();

        if (n1 > 0 || n1 < 0) {
            if (n1 > 0) {
                System.out.print("\n\t" + n1 + ": positivo");
            } else {
                System.out.print("\n\t" + n1 + ": negativo");
            }
        } else {
            System.out.print("\n\t" + n1 + ": zero");
        }
    }
}