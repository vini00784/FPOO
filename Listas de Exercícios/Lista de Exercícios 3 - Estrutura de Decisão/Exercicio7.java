import java.util.Scanner;

class Exercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um comprimento em metros: ");
        double m = sc.nextDouble();

        double km = m / 1000;
        System.out.print("\n" + m + "m: " + km + "km");
 
        double hm = m / 100;
        System.out.print("\n" + m + "m: " + hm + "hm");

        double dam = m / 10;
        System.out.print("\n" + m + "m: " + dam + "dam");

        double dm = m * 10;
        System.out.print("\n" + m + "m: " + dm + "dm");

        double cm = m * 100;
        System.out.print("\n" + m + "m: " + cm + "cm");

        double mm = m * 1000;
        System.out.print("\n" + m + "m: " + mm + "mm");
    }
}