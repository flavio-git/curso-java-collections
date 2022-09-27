import java.io.FileNotFoundException;
import java.util.List;

public class TestandoCursos {
    public static void main(String[] args) throws FileNotFoundException {

        // carrega as aulas salvas no arquivo
        List<Aula> aulas = new LeitorArquivoAulas().carregaAulas("public/aulas-cadastradas.txt");

        Curso javaColecoes = new Curso("Java - Dominando as coleções", "Paulo Silveira", aulas);

        javaColecoes.adicionaAula(new Aula(0, "aula teste", 10));

        System.out.println(javaColecoes.getAulas());

        System.out.println(javaColecoes);

        javaColecoes.matricula(new Aluno("Fernanda", 1020));
        javaColecoes.matricula(new Aluno("Carlos", 2010));
        javaColecoes.matricula(new Aluno("Ricardo", 3310));
        javaColecoes.matricula(new Aluno("Gabriela", 5040));
        javaColecoes.matricula(new Aluno("Luciana", 5910));
        javaColecoes.matricula(new Aluno("Bruno", 5911));

        System.out.println("\nAlunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
