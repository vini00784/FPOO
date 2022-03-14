import javax.swing.JOptionPane;

class Exercicio2V4 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        jp.showMessageDialog(null, "\nRaíz 1 = " + raiz1);
        jp.showMessageDialog(null, "\nRaíz 2 = " + raiz2);
    }
}