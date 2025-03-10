import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int a = teclado.nextInt();

        System.out.print("digite o segundo numero: ");
        int b = teclado.nextInt();

        int inicio, fim;

        if (a < b) {
            inicio = a;
            fim = b;
        } else {
            inicio = b;
            fim = a;
        }

        int soma = 0, count = 0;

        System.out.print("numeros pares no intervalo: ");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                soma += i;
                count++;
            }
        }

        double media = 0;
        if (count > 0) {
            media = (double) soma / count;
        }

        System.out.println("\nsoma dos pares: " + soma);
        System.out.println("media dos pares: " + media);

        teclado.close();
    }
}
