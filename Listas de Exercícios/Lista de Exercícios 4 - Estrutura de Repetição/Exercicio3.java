import java.util.Scanner;

class Exercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a base: ");
        long base = sc.nextLong();

        System.out.println("Insira o expoente");
        long exp = sc.nextLong();

        long cont = base;

        for (long i = exp-1 ; i >=1 ; i--) {
            cont *= base;
        }
        System.out.println(base + "^" + exp + " eh igual a: " + cont);

        if (exp==0) {
            System.out.println(base + "^" + exp + " eh igual a: 1 ");
        }
    }
}