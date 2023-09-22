package list;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double alutra;

    public Pessoa(String nome, int idade, double alutra) {
        this.nome = nome;
        this.idade = idade;
        this.alutra = alutra;
    }

    @Override
    public int compareTo(Pessoa p) {
       return Integer.compare(this.idade, p.getIdade());
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", idade='" + getIdade() + "'" +
                ", alutra='" + getAlutra() + "'" +
                "}";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAlutra() {
        return this.alutra;
    }

}
