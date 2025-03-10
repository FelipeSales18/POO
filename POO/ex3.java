import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("me diga o seu salario: ");
        int num1 = teclado.nextInt();

        System.out.println("qual foi a porcentagem de aumento que voce teve? ");
        float num2 = teclado.nextFloat();

        float resultado = (num1 * num2) / 100;

        System.out.println(resultado + num1);


        
    }
}