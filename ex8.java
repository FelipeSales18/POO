import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("me diga o seu gasto em kW: ");
        int kw = teclado.nextInt(); 

        System.out.print("me diga o valor do kW: ");
        double vkw = teclado.nextDouble(); 

        double total = kw * vkw;

        if (kw < 150) {
            double desc = total * 0.9; 
            System.out.println("voce recebeu um desconto de 10% e o valor a pagar é de: " + desc);
        } else {
            System.out.println("a sua conta é de: " + total);
        }

        teclado.close(); 
    }
}