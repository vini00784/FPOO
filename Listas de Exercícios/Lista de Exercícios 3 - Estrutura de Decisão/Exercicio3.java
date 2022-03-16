import java.util.Scanner;

class Exercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Informe outro número inteiro: ");
        int n2 = sc.nextInt();

        if (n1 > n2 || n2 > n1) {
            if (n1 > n2) {
                System.out.print("\n\t O primeiro é maior");
            } else {
                System.out.print("\n\t O segundo é maior");
            }
        } else {
            System.out.print("\n\tOs números são iguais");
        }
    }
}