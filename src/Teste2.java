import java.util.Random;
import java.util.Scanner;

    public class Teste2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rnd = new Random();

            System.out.print("Tamanho da senha: ");
            int tam = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            System.out.print("Incluir letra MAIÚSCULA? (s/n): ");
            String maius = sc.nextLine();

            System.out.print("Incluir letra minúscula? (s/n): ");
            String minus = sc.nextLine();

            System.out.print("Incluir número? (s/n): ");
            String num = sc.nextLine();

            System.out.print("Incluir símbolo? (s/n): ");
            String simb = sc.nextLine();

            String senha = gerar(tam, maius, minus, num, simb);

            System.out.println("Senha gerada: " + senha);

            System.out.print("Deseja copiar pra área de transferência? (s/n): ");
            String copiar = sc.nextLine();

            if (copiar.equals("s")) {
                // Simulação tosca de copiar
                System.out.println("(copiada!)");
            }

            sc.close();
        }

        public static String gerar(int tam, String maius, String minus, String num, String simb) {
            String sen = "";
            String letras = "";

            if (maius.equals("s")) {
                letras += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            }
            if (minus.equals("s")) {
                letras += "abcdefghijklmnopqrstuvwxyz";
            }
            if (num.equals("s")) {
                letras += "0123456789";
            }
            if (simb.equals("s")) {
                letras += "!@#$%&*";
            }

            Random r = new Random();
            for (int i = 0; i < tam; i++) {
                int pos = r.nextInt(letras.length());
                sen += letras.charAt(pos);
            }

            return sen;
        }
    }