// Implementar uma calculadora em JAVA que efetua as quatro operações algébricas, usando um método para cada alteração, sendo que cada um recebe e retorna números decimais.
import java.util.Scanner;

class Calculadora2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double n1 = entrada();
        double n2 = entrada();

        double ad = somar(n1, n2);
        double sub = subtrair(n1, n2);
        double mul = multiplicar(n1, n2);
        double div = dividir(n1, n2);

        saída(n1, '+', n2, ad);
        saída(n1, '-', n2, sub);
        saída(n1, '*', n2, mul);
        saída(n1, '/', n2, div);

        // System.out.println(n1 + " + " + n2 + " eh igual a: " + ad);
        // System.out.println(n1 + " - " + n2 + " eh igual a: " + sub);
        // System.out.println(n1 + " * " + n2 + " eh igual a: " + mul);
        if (div == -1) {
            System.out.println(n1 + " / " + n2 + " = " + "erro, nn existe divisao por zero");
        } else {
            System.out.println(n1 + " / " + n2 + " eh igual a: " + div);
        }
    }

    // Entrada de dados:
    public static double entrada() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um nmr qualquer: ");
        double num = input.nextDouble();
        return(num);
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

    // Saída de dados:
    public static void saída(double n1, char op, double n2, double res) {
        System.out.println (n1 + " " + op + " " + n2 + " = " + res);
    }
}