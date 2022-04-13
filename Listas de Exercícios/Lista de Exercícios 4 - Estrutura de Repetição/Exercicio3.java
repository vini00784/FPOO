import java.util.Scanner;

class Exercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long base = 0;
        long exp = 0;


        while (true) {
            System.out.println("Insira a base: ");
            base = sc.nextLong();
            System.out.println("Insira o expoente");
            exp = sc.nextLong();
            if (base >= 0 && exp >= 0) {
                break;
            }
        }

        long cont = base;

        for (long i = exp-1 ; i >=1 ; i--) {
            cont *= base;
            if (exp==0) {
                System.out.println(base + "^" + exp + " eh igual a: 1 ");
        }
        }
        System.out.println(base + "^" + exp + " eh igual a: " + cont);
    }
}