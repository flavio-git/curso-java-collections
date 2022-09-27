import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor, List<Aula> aulas) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.aulas = aulas;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    // Devolve uma cópia do ArrayList e não permite o acesso aos métodos do ArrayList
    // é uma boa prática devolver uma cópia... não permitindo o acesso direto ao Array
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotalAula() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // método que veio com o Java 8
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }


    @Override
    public String toString() {
        return "Curso: " + this.nome
                + " | Instrutor: " + this.instrutor
                + " | Quantidade aulas: " + this.aulas.size()
                + " | Tempo total: " + getTempoTotalAula();
    }

}
