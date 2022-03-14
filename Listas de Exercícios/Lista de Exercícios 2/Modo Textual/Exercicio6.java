import java.util.Scanner;

class Exercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme a temperatura em graus Celsius: ");
        double graus_c = sc.nextDouble();

        double graus_f = (9 * graus_c + 160) / 5;

        System.out.print("\n\tEssa temperatura em Fahrenheit é igual a: " + graus_f);
    }
}