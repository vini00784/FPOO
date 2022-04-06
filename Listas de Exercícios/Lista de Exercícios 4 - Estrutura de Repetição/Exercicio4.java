import java.util.Scanner;

class Exercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número positivo: ");
        double n = sc.nextLong();

        double euler = Math.pow (1 + (1 / n),n);

        System.out.println("O número de euler é igual a: " + euler);
    }
}