import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("me diga um numero: ");
        float num1 = teclado.nextFloat();

        System.out.println("me diga outro numero: ");
        float num2 = teclado.nextFloat();

        float soma = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;

        System.out.println("soma: " + soma);
        System.out.println("subtração: " + sub);
        System.out.println("multiplicação: " + mult);

        if (num2 != 0) {
            float div = num1 / num2;
            System.out.println("divisão: " + div);
        } else {
            System.out.println("não pode dividir por 0 :(");
        }

        teclado.close();
    }
}

