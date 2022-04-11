import java.util.Scanner;

class Exercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String frase = "Desenvolvimento de Sistemas - Turma DS1-T";
        char ch = '\u2588';

        for (int i = 53 ; i>=1 ; i--) {
            System.out.print(ch);
        }

        System.out.print( "\n" + ch + "     Desenvolvimento de Sistemas - Turma DS1-T     " + ch + "\n");
        
        for (int i = 53 ; i>=1 ; i--) {
            System.out.print(ch);
        }
    }
}