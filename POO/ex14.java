import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int count = 0; 
        double somaNotas = 0; 
        double maiorNota = -1; 
        double menorNota = 11; 

        
        while (true) {
            System.out.print("digite a nota do aluno (ou -1 para encerrar): ");
            double nota = teclado.nextDouble();

            
            if (nota == -1) {
                break;
            }

            
            somaNotas += nota;
            count++;

            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        
        if (count > 0) {
            double media = somaNotas / count;
            System.out.println("quantidade de alunos: " + count);
            System.out.printf("media da turma: %.2f\n", media);
            System.out.println("maior nota: " + maiorNota);
            System.out.println("menor nota: " + menorNota);
        } else {
            System.out.println("nenhuma nota foi digitada.");
        }

        teclado.close(); 
    }
}
