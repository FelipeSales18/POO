package formas;

public class Retangulo {
    private int x;
    private int y;
    private float altura;
    private float largura;

    public Retangulo(int x, int y, float altura, float largura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
    }

    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }


    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %.2f, %.2f)\n",
                x, y, largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }

    public void dividir(){


    }


}
