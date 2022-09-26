import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

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

    // devolve uma cópia do ArrayList e não permite o acesso aos métodos do ArrayList
    // é uma boa prática devolver uma cópia... não permitindo o acesso direto ao Array
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
    }

}
