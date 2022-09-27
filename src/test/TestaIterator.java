package test;

import model.Aluno;
import model.Aula;
import model.LeitorArquivoAulas;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestaIterator {

    public static void main(String[] args) throws FileNotFoundException {

        // Antes do Java 8 era necessário utilizar o Iterator

        LeitorArquivoAulas file = new LeitorArquivoAulas();
        List<Aula> aulas = file.carregaAulas("public/aulas-cadastradas.txt");

        Iterator<Aula> iterator = aulas.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Outra forma também utilizada nos primeiros anos do Java era usando Vector
        // Hoje não é mais recomendado utilizar, mais se for preciso lidar com thread safe

        Vector<Aluno> vector = new Vector<>();

    }


}
