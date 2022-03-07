import javax.swing.JOptionPane;

class Exercicio3 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int variavel1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));
        int variavel2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro número inteiro: "));

        int v1 = variavel1;
        int v2 = variavel2;
        int aux = v1;

        jp.showMessageDialog(null, "\n Variável1: " + v1);
        jp.showMessageDialog(null, "\n Variável2: " + v2);

        v1 = v2;
        v2 = aux;

        jp.showMessageDialog(null, "\n Variável1: " + v1);
        jp.showMessageDialog(null, "\n Variável2: " + v2);
    }
}