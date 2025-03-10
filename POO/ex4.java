import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("me diga o raio do seu circulo: ");
        int num1 = teclado.nextInt();

        double pi = 3.14; 

        double perimetro = 2 * pi * num1;
        double area = (pi * (num1 * num1)); 

        System.out.println("o perimetro e: " + perimetro);
        System.out.println("a area e: " + area);

        teclado.close(); 
    }
}
