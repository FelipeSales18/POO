package principal;
import java.util.Scanner;
import formas.circulo;

public class Testcirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a coordenada x do circulo: ");
        int x = teclado.nextInt();
        System.out.println("digite a coordenada y do circulo: ");
        int y = teclado.nextInt();
        System.out.println("digite a raio: ");
        float raio = teclado.nextFloat();

        circulo c1 = new circulo(x, y, raio);
        c1.desenhar();

        System.out.println("digite a coordenada x da nova posicao: ");
        int x2 = teclado.nextInt();
        System.out.println("digite a coordenada y da nova posicao: ");
        int y2 = teclado.nextInt();

        c1.mover(x2, y2);
        c1.desenhar();

        System.out.println("digite o novo raio em (%): ");
        float sr = teclado.nextFloat();

        c1.redimensionar(sr);
        c1.Calculararea();
        c1.Calcularperimetro();

        c1.desenhar();

    }
}
