package Set;
import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contato)) {
            return false;
        }
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", numeroTelefone='" + getNumeroTelefone() + "'" +
            "}";
    }



    


}
