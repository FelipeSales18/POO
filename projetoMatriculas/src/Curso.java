public class Curso {
    private String nome;
    private int nrVagas;
    private Aluno[] alunos;

    public Curso(String nome, int nrVagas) {
        this.nome = nome;
        this.nrVagas = nrVagas;
        this.alunos = new Aluno[nrVagas];
    }

    public boolean matricular(Aluno a) {
        for (int i = 0; i < alunos.length; i++) { // isso aqui ira verificar todas as posicoes comecando do 0
            if (alunos[i] != null && alunos[i].getMatricula() == a.getMatricula()) { //verifica se a posicao do vetor nao esta vazia, e tbm compara a nova matricula "a.getMatricula" com a velha para verem se sao iguais
                return false; // Já existe um aluno com essa matrícula
            }
        }

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null) {
                alunos[i] = a;
                return true; // Aluno adicionado com sucesso
            }
        }

        return false; // Não há vagas disponíveis
    }

    public boolean cancelarMatricula(int matricula) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
                alunos[i] = null;
                return true; // Encontrou e removeu
            }
        }
        return false; // Matrícula não encontrada
    } // esse metodo age parecido com o anterior porem quando ele encontra uma matricula repetida ele da o valor de null


    public void imprimir() {
        System.out.println("Curso: " + nome);
        System.out.println("Vagas totais: " + nrVagas);
        System.out.println("Alunos matriculados:");

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
                System.out.println("Matrícula: " + alunos[i].getMatricula() +
                        " | Nome: " + alunos[i].getNome());
            }
        }
    }





}
