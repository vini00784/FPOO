import java.util.Scanner;
import java.util.InputMismatchException;

class TratamentoDeExcecao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int num1 = sc.nextInt();
            System.out.print("Digite outro número inteiro: ");
            int num2 = sc.nextInt();
            System.out.println("\nUm n° dividido pelo outro: " + num1/num2);
        }
        catch (InputMismatchException er) {
            System.out.println("\n** Ooops, isso não parece um inteiro **");
        }
        catch (ArithmeticException er) {
            System.out.println("\n** Erro de divisão por zero **");
        }
        catch (Exception er) {
            System.out.println("\n** Erro inesperado: " + er + " **");
        }
    }
}