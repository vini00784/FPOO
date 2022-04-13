// Implementar uma calculadora em JAVA que efetua as quatro operações algébricas, usando um método para cada alteração, sendo que cada um recebe e retorna números decimais.

class CriacaoMetodo {
    public static void main(String args[]) {
        double n1 = 7.5;
        double n2 = 2.5;

        double ad = somar(n1, n2);
        double sub = subtrair(n1, n2);
        double mul = multiplicar(n1, n2);
        double div = dividir(n1, n2);

        System.out.println("Soma = " + ad);
        System.out.println("Subtração " + sub);
        System.out.println("Multiplicação " + mul);
        System.out.println("Divisão " + div);
    }

    public static double somar(double n1, double n2) {
        return(n1+n2);
    }

    public static double subtrair(double n1, double n2) {
        return(n1-n2);
    }

    public static double multiplicar(double n1, double n2) {
        return(n1*n2);
    }

    public static double dividir(double n1, double n2) {
        return(n1/n2);
    }
}