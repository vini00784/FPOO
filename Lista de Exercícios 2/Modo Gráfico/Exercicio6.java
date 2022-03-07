import javax.swing.JOptionPane;

class Exercicio6 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int graus_c = Integer.parseInt(jp.showInputDialog(null, "Informe a temperatura em graus Celsius: "));

        double graus_f = (9 * graus_c + 160) / 5;

        jp.showMessageDialog(null, "\n Essa temperatura em Fahrenheit é: " + graus_f);
    }
}