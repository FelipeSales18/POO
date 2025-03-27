package formas;

public class circulo {
    int x;
    int y;
    public static final double pi = 3.14159265359; // e static pq o pi sempre sera o msm para todos os circulos
    private float raio; // atributo pode ser mudado


    public circulo(int x, int y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public circulo(circulo c){
        this.raio = c.raio;
    }
    public float getRaio(){
        return raio;

    }
    public void setRaio(float raio){ // deve ser usado em todos os metodos
        if (raio > 0) {
            this.raio = raio;
        }
    }
    public void Calculararea(){
        System.out.println("Area do circulo e de : " + pi * raio * raio + "metros quadrados");
    }
    public void Calcularperimetro(){
        System.out.println("o perirmetro do circulo e de :" + pi*2*raio + "metros");

    }
    public void mover(int moveX, int moveY){ //serve para mudar as coodernadas preveamente postas
        x = moveX;
        y = moveY;
    }
    public void desenhar(){
        System.out.printf("circunferencia(%d,%d) = %.2f\n",x,y,raio); // o printf serve para substituir os parametros por exemplo %d sera transformado em x

    }
    public void redimensionar(float sr) {
        if (sr > raio) {
            raio = (int) (sr /100 * raio);
        }
    }



}
