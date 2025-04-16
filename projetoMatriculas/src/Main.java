public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia da Computação", 3);

        Aluno a1 = new Aluno(101, "João");
        Aluno a2 = new Aluno(102, "Maria");
        Aluno a3 = new Aluno(103, "Carlos");

        // Matricular alunos
        curso.matricular(a1);
        curso.matricular(a2);
        curso.matricular(a3);

        System.out.println("\nAntes de cancelar:");
        curso.imprimir();

        // Cancelar a matrícula de um aluno
        curso.cancelarMatricula(102);

        System.out.println("\nDepois de cancelar a matrícula da Maria:");
        curso.imprimir();
    }
}
