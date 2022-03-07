import javax.swing.JOptionPane;

class Exercicio4 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        double valor = Double.parseDouble(jp.showInputDialog(null, "Informe o valor de sua compra: "));
        double prcnt = Double.parseDouble(jp.showInputDialog(null, "Informe o percentual de desconto: "));

        double desconto = (valor/100) * prcnt;
        double compra = valor - desconto;

        jp.showMessageDialog(null, "O valor final da compra é: " + compra);
    }
}