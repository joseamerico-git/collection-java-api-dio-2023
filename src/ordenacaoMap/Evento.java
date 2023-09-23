package ordenacaoMap;

import java.time.LocalDate;
import java.util.Collection;

public class Evento {
    private String nomeEvento;
    private String atracao;

    public Evento(String nomeEvento, String atracao) {
        this.nomeEvento = nomeEvento;
        this.atracao = atracao;

    }

    public String getNomeEvento() {
        return this.nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getAtracao() {
        return this.atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "{" +
                " nomeEvento='" + getNomeEvento() + "'" +
                ", atracao='" + getAtracao() + "'" +

                "}";
    }

}
