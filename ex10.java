import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite um número inteiro n: ");
        int n = teclado.nextInt();

        System.out.print("digite um número inteiro x1: ");
        int x1 = teclado.nextInt();

        System.out.print("digite outro número inteiro x2: ");
        int x2 = teclado.nextInt();

        
        if ((n > x1 && n < x2) || (n > x2 && n < x1)) {
            System.out.println("o numero N está entre os dois numeros.");
        } else if (n > x1 && n > x2) {
            System.out.println("o numero N está acima dos dois numeros.");
        } else if (n < x1 && n < x2) {
            System.out.println("o numero N está abaixo dos dois numeros.");
        } else {
            System.out.println("o numero N é igual a um dos numeros digitados.");
        }

        teclado.close();
    }
}
