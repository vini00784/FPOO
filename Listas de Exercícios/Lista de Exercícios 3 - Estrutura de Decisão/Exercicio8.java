import java.util.Scanner;

class Exercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 17) {
            System.out.print("\n\tMuito abaixo do peso");
        }
        if (imc >= 17 && imc <= 18.49) {
            System.out.print("\n\tAbaixo do peso");
        }
        if (imc >= 18.5 && imc <= 24.99) {
            System.out.print("\n\tPeso normal");
        }
        if (imc >= 25 && imc <= 29.99) {
            System.out.print("\n\tAcima do peso");
        }
        if (imc >= 30 && imc <= 34.99) {
            System.out.print("\n\tObesidade I");
        }
        if (imc >= 35 && imc <= 39.99) {
            System.out.print("\n\tObesidade II (severa)");
        }
        if (imc > 40) {
            System.out.print("\n\tObesidade III (mórbida)");
        }
    }
}