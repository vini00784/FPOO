import java.util.Scanner;

class Exercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Informe um número inteiro: ");
        double n1 = sc.nextDouble();

        if (n1 > 10 || n1 < 10) {
            if (n1 > 10) {
                System.out.print("\n\t" + n1 + ": maior que dez");
            } else {
                System.out.print("\n\t" + n1 + ": menor que dez");
            }
        } else {
            System.out.print("\n\t" + n1 + ": igual a dez");
        }
    }
}