package principal;
import java.util.Scanner;
import formas.Retangulo;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a coordenada X: ");
        int x = teclado.nextInt();

        System.out.println("Digite a coordenada Y: ");
        int y = teclado.nextInt();

        System.out.println("Digite a altura: ");
        int altura = teclado.nextInt();

        System.out.println("Digite a largura: ");
        int largura = teclado.nextInt();

        Retangulo r1 = new Retangulo(x, y, altura, largura);

        r1.desenhar();

        System.out.println("Digite a coordenada X da nova posição: ");
        int novo_x = teclado.nextInt();

        System.out.println("Digite a coordenada Y da nova posição: ");
        int novo_y = teclado.nextInt();

        r1.mover(novo_x,novo_y);
        r1.desenhar();

        System.out.println("Digite o redimensionamento da largura (%):");
        float sx = teclado.nextFloat();

        System.out.println("Digite o redimensionamento da largura (%):");
        float sy = teclado.nextFloat();


        r1.redimensionar(sx, sy);
        r1.desenhar();



    }
}