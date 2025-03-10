import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite o tempo em segundos: ");
        int t = teclado.nextInt();  

        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        System.out.println("tempo convertido: " + horas + "h " + minutos + "m " + segundos + "s");

        teclado.close();
    }
}
