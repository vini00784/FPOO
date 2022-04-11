import java.util.Scanner;

class Exercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String usuarioCadastrado = "Jacinto";
        String senhaCadastrada = "abc123";
        int rep = 1;

        while (rep < 4) {
            for ( int i = 1; i <= 3; i++ ) {
                System.out.println("Usuário: ");
                String user = sc.next();

                System.out.println("Senha: ");
                String senha = sc.next();

                if (user.equals(usuarioCadastrado) && senha.equals(senhaCadastrada)) {
                    System.out.println("Seja bem-vindo(a)!");
                    System.exit(0);
                } else {
                    System.out.println("Usuário incorreto ou senha incorretos");
                    rep++;
                } 
            }
            System.exit(0);
        }
    }
}