import java.util.Scanner;

class Exercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("\n\tIMC = %.2f" , imc);

        if (imc < 17) {
            System.out.print("\n\tMuito abaixo do peso");
        } else {
            if (imc >= 17 && imc <= 18.49) {
                System.out.print("\n\tAbaixo do peso");
            } else {
                if (imc >= 18.5 && imc <= 24.99) {
                    System.out.print("\n\tPeso normal");
                } else {
                    if (imc >= 25 && imc <= 29.99) {
                        System.out.print("\n\tAcima do peso");
                    } else {
                        if (imc >= 30 && imc <= 34.99) {
                            System.out.print("\n\tObesidade I");
                        } else {
                            if (imc >= 35 && imc <= 39.99) {
                                System.out.print("\n\tObesidade II (severa)");
                            } else {
                                System.out.print("\n\tObesidade III (mórbida)");
                            }
                        }
                    }
                }
            }
        }
    }
}