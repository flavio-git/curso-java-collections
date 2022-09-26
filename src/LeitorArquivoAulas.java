import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorArquivoAulas {

    public List<Aula> carregaAulas(String fileName) throws FileNotFoundException {
        Scanner aulasFile = new Scanner(new File(fileName));
        List<Aula> aulas = new ArrayList<>();
        while (aulasFile.hasNextLine()) {
            String[] aulaFile = aulasFile.nextLine().split(",");

            String nomeAula = aulaFile[1].trim();

            String tempoAulaString = aulaFile[2].trim(); // atributo tempo da classe é int... aqui está como String
            int tempoAula = Integer.parseInt(tempoAulaString); // convertendo uma String para um int

            int sequenciaAula = Integer.parseInt(aulaFile[0]);

            Aula aula = new Aula(sequenciaAula, nomeAula, tempoAula); // criando instância de Aula
            aulas.add(aula); // adicionando no ArrayList
        }
        return aulas;
    }
}
