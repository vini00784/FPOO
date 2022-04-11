import java.util.Scanner;

class Exercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qntd de valores para Fibonacci: ");
        int qtde = sc.nextInt();
        if (qtde < 2) {
            System.out.print("1");
            System.exit(0);
        }
        int n1 = 1;
        int n2 = 1;
        System.out.print("\n1, 1");

        for (int i = 0 ; i < qtde-2 ; i++) {
            int n3 = n1 + n2;
            System.out.print(", " + n3);
            System.out.print(" ** " + (double)n2/n1 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.print("\n");
    }
}