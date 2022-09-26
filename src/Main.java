import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        System.out.printf("Aula na primeira posição: %s %n", aulas.get(0));

        System.out.println("\nImprimindo elementos do array com for clássico: ");
        for (int i = 0; i < aulas.size(); i++) {
            System.out.printf("Aula: %s %n", aulas.get(i));
        }

        System.out.println("\nImprimindo elementos do array com for each: ");
        for (String aula: aulas){
            System.out.printf("Aula: %s %n", aula);
        }

        System.out.println("\nImprimindo elementos do array com método for each da classe ArrayList: ");
        aulas.forEach(aula -> {
            System.out.printf("Aula: %s %n", aula);
        });


        System.out.println("\nRemovendo aulas da lista: ");
        aulas.remove(0);

        aulas.remove("Trabalhando com Cursos e Sets");

        System.out.println(aulas);

        System.out.println("\nAdicionando novamente as aulas e classificando a lista: ");

        aulas.add(0, aula3);
        aulas.add(1, aula1);

        System.out.println("Aulas antes de classificar: " + aulas);

        Collections.sort(aulas);

        System.out.println("Aulas depois de classificar: " + aulas);


    }
}