import javax.swing.JOptionPane;

class Teste {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        int anoNascInt = Integer.parseInt(jp.showInputDialog(null, "Ano Nascimento?"));
        //Funciona como uma equação.
        int idade = 2022 - anoNascInt;
        jp.showMessageDialog(null, "Idade: " + idade + " anos");
    }
}