// Implementar uma calculadora em JAVA que efetua as quatro operações algébricas, usando um método para cada alteração, sendo que cada um recebe e retorna números decimais.
import javax.swing.JOptionPane;

class CriacaoMetodo {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        double n1 = Double.parseDouble(jp.showInputDialog(null, "Informe um nmr qualquer: "));
        double n2 = Double.parseDouble(jp.showInputDialog(null, "Informe outro nmr "));

        double ad = somar(n1, n2);
        double sub = subtrair(n1, n2);
        double mul = multiplicar(n1, n2);
        double div = dividir(n1, n2);

        // if (n2 == 0) {
        //     jp.showMessageDialog(null, "Nao eh possivel dividir por zero!");
        // }

        jp.showMessageDialog(null, n1 + " + " + n2 + " eh igual a: " + ad);
        jp.showMessageDialog(null, n1 + " - " + n2 + " eh igual a: " + sub);
        jp.showMessageDialog(null, n1 + " * " + n2 + " eh igual a: " + mul);
        jp.showMessageDialog(null, n1 + " / " + n2 + " eh igual a: " + div);
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
        JOptionPane dividir = new JOptionPane();
        if (n2 == 0) {
            return (-1);
        }
        return(n1/n2);
    }
}