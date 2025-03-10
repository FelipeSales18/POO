import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("escolha a operacao aritimetica (+, -, *, /): ");
        char op = teclado.next().charAt(0);

        System.out.print("digite o primeiro numero: ");
        double a = teclado.nextDouble();

        System.out.print("digite o segundo numero: ");
        double b = teclado.nextDouble();

        double resultado = 0; 

        if (op == '+') {
            resultado = a + b;
        } else if (op == '-') {
            resultado = a - b;
        } else if (op == '*') {
            resultado = a * b;
        } else if (op == '/') {
            if (b != 0) { 
                resultado = a / b;
            } else {
                System.out.println("erro: divisao por zero.");
                teclado.close();
                return;
            }
        } else {
            System.out.println("invalido.");
            teclado.close();
            return;
        }

        System.out.println(a + " " + op + " " + b + " = " + resultado);

        teclado.close();
    }
}
