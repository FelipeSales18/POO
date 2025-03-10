import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double x = teclado.nextDouble();

        int arredondado = (x - (int) x < 0.5) ? (int) x : (int) x + 1;

        System.out.println("Número arredondado: " + arredondado);

        teclado.close();
        /*colocar o numero com "." e nao com virgula  */
    }
}
