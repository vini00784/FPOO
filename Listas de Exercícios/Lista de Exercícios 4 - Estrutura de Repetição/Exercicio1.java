import javax.swing.JOptionPane;

class Exercicio1 {
    public static void main(String args[]) {
        JOptionPane jp = new JOptionPane();

        // é par se n%2==0
        while(true) {
            while (true) {
                int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um número inteiro: "));

                if (n1 % 2 == 0) {
                    jp.showMessageDialog(null, "\n" + n1 + ": é um número par");
                    break;
                } else {
                    jp.showMessageDialog(null, "\n" + n1 + ": é um número ímpar");
                    break;
                }
            }

            String op = (jp.showInputDialog(null, "Deseja continuar? [s/n]"));

            if (!op.equals("sim") && !op.equals("Sim") && !op.equals("yes") && !op.equals("Yes")) {
                System.exit(0);
            }
        }
    }
}