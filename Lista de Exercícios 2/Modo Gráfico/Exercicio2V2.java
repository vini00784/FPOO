import javax.swing.JOptionPane;

class Exercicio2V2 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        int div = n1 / n2;

        jp.showMessageDialog(null, "\n Divisão = " + div);
    }
}