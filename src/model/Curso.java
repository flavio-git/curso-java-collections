package model;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> alunoMap= new HashMap<>();

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

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.alunoMap.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno); // Contains chama o método equals da classe, no caso aqui equals da classe model.Aluno
    }

    public Aluno procuraAlunoPorMatricula(int matricula){
        return this.alunoMap.get(matricula);
    }

    @Override
    public String toString() {
        return "model.Curso: " + this.nome
                + " | Instrutor: " + this.instrutor
                + " | Quantidade aulas: " + this.aulas.size()
                + " | Tempo total: " + getTempoTotalAula();
    }

}
