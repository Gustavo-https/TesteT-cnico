import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número romano: ");
        String rom = sc.nextLine().toUpperCase();

        int dec = romanoPraDecimal(rom);

        if (dec == -1) {
            System.out.println("Erro: símbolo inválido.");
        } else {
            System.out.println("Decimal: " + dec);
        }

        sc.close();
    }

    public static int romanoPraDecimal(String rom) {
        int res = 0;

        for (int i = 0; i < rom.length(); i++) {
            char ch = rom.charAt(i);

            if (ch == 'I') {
                res += 1;
            } else if (ch == 'V') {
                res += 5;
            } else if (ch == 'X') {
                res += 10;
            } else if (ch == 'G') { // ERRO proposital: G não é romano
                res += 50;
            } else if (ch == 'C') {
                res += 100;
            } else if (ch == 'D') {
                res += 500;
            } else if (ch == 'M') {
                res += 1000;
            } else {
                return -1; // caractere inválido
            }
        }

        return res; // Lógica simples, sem subtração (ex: IV = 4)
    }
}