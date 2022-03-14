import javax.swing.JOptionPane;

class Exercicio1 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        double dec1 = Double.parseDouble(jp.showInputDialog(null, "Informe um número"));
        double dec2 = Double.parseDouble(jp.showInputDialog(null, "Informe outro número"));

        double ad = dec1 + dec2;
        double sub = dec1 - dec2;
        double mul = dec1 * dec2;
        double div = dec1 / dec2;

        jp.showMessageDialog(null, "\n Adição = " + ad);
        jp.showMessageDialog(null, "\n Subtração = " + sub);
        jp.showMessageDialog(null, "\n Multiplicação = " + mul);
        jp.showMessageDialog(null, "\n Divisão = " + div);
    }
}