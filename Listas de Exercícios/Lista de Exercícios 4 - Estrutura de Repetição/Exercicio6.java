class Exercicio6 {
    public static void main(String args[]) {
        String frase = "Desenvolvimento de Sistemas - Turma DS1-T";
        char ch = '\u2588';

        System.out.println();

        for (int i = 53 ; i>=1 ; i--) {
            System.out.print(ch);
        }

        System.out.print( "\n" + ch + "     " + frase + "     " + ch + "\n");
        
        for (int i = 53 ; i>=1 ; i--) {
            System.out.print(ch);
        }
    }
}