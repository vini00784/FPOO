// Elaborar um programa que exibe na tela o fatorial de um número
// 15 * 14 * 13 * 12 * 11 ... * 1 == ???

class Fatorial {
    public static void main(String args[]) {
        long n = 15;
        long fat= n;
        
        for (long i = 2 ; i <= (n-1) ; ++i) {
            fat *= i;
        }
        System.out.print("\n" + n + "! = " + fat + "\n");
    }
}