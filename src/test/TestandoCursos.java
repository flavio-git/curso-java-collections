package test;

import model.Aluno;
import model.Aula;
import model.Curso;
import model.LeitorArquivoAulas;

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

        Aluno hellen = new Aluno("Hellen", 5030);

        javaColecoes.matricula(hellen);

        Aluno novoAluno = new Aluno("hellen", 5030);

        boolean buscaNovoAluno = javaColecoes.estaMatriculado(novoAluno);

        System.out.printf("model.Aluno: %s, hashcode: %d | model.Aluno: %s, hashcode: %d %n",
                hellen.getNome(), hellen.hashCode(), novoAluno.getNome(), novoAluno.hashCode());

        System.out.printf("Cadastro tem? Nome: %s, Resultado consulta: %b", novoAluno.getNome(), buscaNovoAluno);



    }
}
