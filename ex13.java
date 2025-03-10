import java.util.Scanner;

public class ex13{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("digite o numero de alunos: ");
        int n = teclado.nextInt();

        double somaNotas = 0; 

        
        for (int i = 1; i <= n; i++) {
            System.out.print("digite a nota do aluno " + i + ": ");
            double nota = teclado.nextDouble();
            somaNotas += nota; 
        }

        
        double media = somaNotas / n;

        
        System.out.printf("a media da turma é: %.2f\n", media);

        teclado.close(); 
    }
}
