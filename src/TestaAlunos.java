import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Fernanda");
        alunos.add("Carlos");
        alunos.add("Ricardo");
        alunos.add("Gabriela");
        alunos.add("Luciana");
        alunos.add("Bruno");

        // Set não tem ordem, ou seja, a ordem que inserimos os elementos acima não é respeitada
        System.out.println(alunos + " - Quantidade de elementos: " + alunos.size());

        // Set não permite elementos repetidos
        alunos.add("Fernanda");
        System.out.println(alunos + " - Quantidade de elementos: " + alunos.size());

        // Removendo elementos do Set (não tem como passar index que queremos remover, pois Set não tem ordem)
        alunos.remove("Luciana");
        System.out.println(alunos + " - Quantidade de elementos: " + alunos.size());

        // Procurando elemento
        boolean flavio = alunos.contains("Flávio");
        System.out.println("Flávio está no conjunto? " + flavio);

    }
}
