import java.util.Scanner;

class AreaGeometria {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        double raio = 0;
        double pi = 0;
        String sn = "a";

        while (true) {
            System.out.print("Escolha uma forma geométrica (quadrado, circulo, retangulo ou triangulo): ");
            String op = sc.next();
            
            if (op.equals("quadrado") || op.equals("Quadrado")) {
                double areaQuadrado = quadrado(altura,base);

                System.out.println ("Deseja continuar? [s/n]");
                sn = sc.next();

                if (!sn.equals ("s")) {
                    System.out.println ("\nObrigado pela participacao, ate logo!");
                    System.exit(0);
                }
            } 
            else if (op.equals("circulo") || op.equals("Círculo")) {
                double areaCirculo = circulo(raio, pi);
                System.out.println("Area do circulo eh igual a: " + areaCirculo);

                System.out.println ("Deseja continuar? [s/n]");
                sn = sc.next();

                if (!sn.equals ("s")) {
                    System.out.println ("\nObrigado pela participacao, ate logo!");
                    System.exit(0);
                }
            } 
            else if (op.equals("retangulo") || op.equals("Retângulo")) {
                double areaRetangulo = retangulo(altura, base);
                System.out.println("Area do retangulo eh igual a: " + areaRetangulo);

                System.out.println ("Deseja continuar? [s/n]");
                sn = sc.next();

                if (!sn.equals ("s")) {
                    System.out.println ("\nObrigado pela participacao, ate logo!");
                    System.exit(0);
                }
            } 
            else if (op.equals("triangulo") || op.equals("Triângulo")) {
                double areaTriangulo = triangulo(altura, base);
                System.out.println("Area do triangulo eh igual a: " + areaTriangulo);

                System.out.println ("Deseja continuar? [s/n]");
                sn = sc.next();

                if (!sn.equals ("s")) {
                    System.out.println ("\nObrigado pela participacao, ate logo!");
                    System.exit(0);
                }
            }
        }
    }

    public static double quadrado(double altura, double base) {
        Scanner areaQuadrado = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        base = areaQuadrado.nextDouble();

        System.out.println("Insira o valor da altura: ");
        altura = areaQuadrado.nextDouble();

        if (base != altura) {
            System.out.println("Valores inválidos para um quadrado, insira novamente");
        } else {
            System.out.println("Area do quadrado eh igual a: " + base * altura);
        }
        return(altura * base);
    }

    public static double circulo(double raio, double pi) {
        Scanner areaCirculo = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");
        raio = areaCirculo.nextDouble();

        System.out.println("Insira o valor de pi: ");
        pi = areaCirculo.nextDouble();

        return (raio * pi);
    }

    public static double retangulo(double altura, double base) {
        Scanner areaRetangulo = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        base = areaRetangulo.nextDouble();

        System.out.println("Insira o valor da altura: ");
        altura = areaRetangulo.nextDouble();

        return(altura * base);
    }

    public static double triangulo(double altura, double base) {
        Scanner areaTriangulo = new Scanner(System.in);

        System.out.println("Insira o valor da base: ");
        base = areaTriangulo.nextDouble();

        System.out.println("Insira o valor da altura: ");
        altura = areaTriangulo.nextDouble();

        return((altura * base) / 2);
    }
}