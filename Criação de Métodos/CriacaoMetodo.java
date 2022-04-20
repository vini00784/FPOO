// Implementar uma calculadora em JAVA que efetua as quatro operações algébricas, usando um método para cada alteração, sendo que cada um recebe e retorna números decimais.
import java.util.Scanner;

class CriacaoMetodo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um nmr qualquer: ");
        double n1 = sc.nextDouble();
        System.out.print("Informe outro nmr: ");
        double n2 = sc.nextDouble();

        double ad = somar(n1, n2);
        double sub = subtrair(n1, n2);
        double mul = multiplicar(n1, n2);
        double div = dividir(n1, n2);

        // if (n2 == 0) {
        //     jp.showMessageDialog(null, "Nao eh possivel dividir por zero!");
        // }

        System.out.println(n1 + " + " + n2 + " eh igual a: " + ad);
        System.out.println(n1 + " - " + n2 + " eh igual a: " + sub);
        System.out.println(n1 + " * " + n2 + " eh igual a: " + mul);
        System.out.println(n1 + " / " + n2 + " eh igual a: " + div);
    }

    // Soma:
    public static double somar(double n1, double n2) {
        return(n1+n2);
    }

    // Subtração:
    public static double subtrair(double n1, double n2) {
        return(n1-n2);
    }

    // Multiplicação:
    public static double multiplicar(double n1, double n2) {
        return(n1*n2);
    }

    // Divisão:
    public static double dividir(double n1, double n2) {
        Scanner dividir = new Scanner(System.in);
        if (n2 == 0) {
            return (-1);
        }
        return(n1/n2);
    }
}