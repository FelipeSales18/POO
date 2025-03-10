import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Me diga um número: ");
        int num1 = teclado.nextInt(); 

        if (num1 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        teclado.close(); 
    }
}
