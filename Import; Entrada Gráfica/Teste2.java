import java.util.Scanner;

class Teste2 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("\n\tInforme seu ano de nascimento: ");
        int anoNasc = ler.nextInt();
        
        int idade = 2022 - anoNasc;
        System.out.println("\n\tVocê possui " + idade + " anos");
    }
}