import java.util.Scanner;

class Exercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\tInforme o valor da sua compra: ");
        double valor = sc.nextDouble();

        System.out.print("\n\tInforme o percentual de desconto: ");
        double prcnt = sc.nextDouble();

        double desconto = (valor / 100) * prcnt;
        double compra = valor - desconto;

        System.out.print("\n\tO valor final da compra é: " + compra);
    }
}