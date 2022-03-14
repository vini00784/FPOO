import javax.swing.JOptionPane;

class MaiorMenorjp {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int idade = Integer.parseInt (jp.showInputDialog(null, "Informe sua idade"));

        // Delimitar um teste lógico para o limite inferior (1) e um teste lógico para o limite superior (120)
        // Para limite inferior: >=1 // Para limite superior: <=120
        // Temos dois testes lógicos: idade >=1 && idade <=120
        if (idade > 17) {
            jp.showMessageDialog(null, "Maior de idade!");
        } else {
            jp.showMessageDialog(null, "Menor de idade!");
        }
    }
}