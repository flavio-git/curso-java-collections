import java.io.FileNotFoundException;
import java.util.List;

public class TestandoCursos {
    public static void main(String[] args) throws FileNotFoundException {

        // carrega as aulas salvas no arquivo
        List<Aula> aulas = new LeitorArquivoAulas().carregaAulas("public/aulas-cadastradas.txt");

        Curso javaColecoes = new Curso("Java - Dominando as coleções", "Paulo Silveira", aulas);

        javaColecoes.adicionaAula(new Aula(0, "aula teste", 10));

        System.out.println(javaColecoes.getAulas());

    }
}
