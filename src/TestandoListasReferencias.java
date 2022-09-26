import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestandoListasReferencias {
    public static void main(String[] args) throws FileNotFoundException {

        // lendo um arquivo com o nome e duração em minutos das aulas do curso
        Scanner aulasFile = new Scanner(new File("public/aulas-cadastradas.txt"));

        ArrayList<Aula> aulas = new ArrayList<>();

        // percorre o aquivo, le uma linha, cria uma Aula e adiciona no ArrayList
        while (aulasFile.hasNextLine()) {
            String[] aulaFile = aulasFile.nextLine().split(",");

            String nomeAula = aulaFile[1].trim();

            String tempoAulaString = aulaFile[2].trim(); // atributo tempo da classe é int... aqui está como String
            int tempoAula = Integer.parseInt(tempoAulaString); // convertendo uma String para um int

            int sequenciaAula = Integer.parseInt(aulaFile[0]);

            Aula aula = new Aula(sequenciaAula, nomeAula, tempoAula); // criando instância de Aula
            aulas.add(aula); // adicionando no ArrayList
        }

        aulasFile.close(); // fechando o arquivo

        System.out.println(aulas);

        System.out.println("Classificando a lista de acordo com o nome:");

        //Collections.sort(aulas); // irá utilizar o método compareTo implementado na classe Aula

        System.out.println(aulas);

        System.out.println("Classificando a lista de acordo com o tempo:");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // podemos também passar por parâmetro qual é o critério de classificação

        System.out.println(aulas);

        System.out.println("Classificando a lista de acordo com a sequência:");

        aulas.sort(Comparator.comparing(Aula::getSequencia));

        System.out.println(aulas);

    }
}
