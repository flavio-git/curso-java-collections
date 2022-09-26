public class Aula implements Comparable<Aula> {
    private int sequencia;
    private String nome;
    private int tempo;

    public Aula(int sequencia, String nome, int tempo) {
        this.sequencia = sequencia;
        this.nome = nome;
        this.tempo = tempo;
    }

    public int getSequencia() {
        return this.sequencia;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTempo() {
        return this.tempo;
    }

    @Override
    public String toString() {
        return "[" + sequencia + " - '" + nome + "', " + tempo + " min]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.nome.compareTo(outraAula.getNome());
    }
}
