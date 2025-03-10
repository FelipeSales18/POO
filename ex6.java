import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("me diga a distancia percorrida em km: ");
        double dist = teclado.nextDouble();

        System.out.println("me diga quanto foi gasto de gasolina em litros: ");
        double gas = teclado.nextDouble();

        System.out.println("me diga o tempo gasto na viajem em hrs: ");
        double hrs = teclado.nextDouble(); 

        double media = (dist/hrs);
        double cons = dist/gas; 

        System.out.println("a media foi de : " + media);
        System.out.println("a media foi de : " + cons);

        teclado.close(); 
    }
}
