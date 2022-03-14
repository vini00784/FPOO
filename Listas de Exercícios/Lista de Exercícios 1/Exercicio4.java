class Exercicio4 {
    public static void main(String args[]) {
        double valor = 200;
        double prcnt = 20;
        double desconto = (valor/100) * prcnt;

        double compra = valor - desconto;
        System.out.println ("O valor final da compra é: " + compra);
    }
}