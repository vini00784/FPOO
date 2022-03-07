import javax.swing.JOptionPane;

class Exercicio5 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        double dol = Double.parseDouble(jp.showInputDialog(null, "Informe o valor em dólar: "));
        double taxa = Double.parseDouble(jp.showInputDialog(null, "Informe a taxa de câmbio: "));

        double real = dol * taxa;

        jp.showMessageDialog(null, "\nO valor em real é igual a: " + real);
    }
}