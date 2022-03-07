import javax.swing.JOptionPane;

class Exercicio2V1 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        double pot_n1 = Math.pow (n1, 5);
        double pot_n2 = Math.pow (n2,5);

        jp.showMessageDialog(null, "\n Potência 1 = " + pot_n1);
        jp.showMessageDialog(null, "\n Potência 2 = " + pot_n2);
    }
}