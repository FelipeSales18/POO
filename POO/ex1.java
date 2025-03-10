import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("me diga um numero: ");
        int num1 = teclado.nextInt();

        System.out.println("me diga outro numero: ");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;

        System.out.println("soma: " + soma);
        System.out.println("subtração: " + sub);
        System.out.println("multiplicação: " + mult);

        if (num2 != 0) { 
            double div = (double) num1 / num2;
            System.out.println("divisão: " + div);
        } else {
            System.out.println("não pode dividir por 0 :(");
        }

        teclado.close(); 
    }
}
