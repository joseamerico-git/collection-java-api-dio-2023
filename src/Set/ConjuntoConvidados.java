package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidadosSet(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        // Quando criamos set não podemos ter elemntos diferentes, teremos que passar o
        // id
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    @Override
    public String toString() {
        return "{" +
                " convidadoSet='" + convidadoSet + "'" +
                "}";
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " Dentro do Set.");
        //Para que a Interface set não permita que existam valores de id(s) repetidos temos que implementar um método na classe equalsHashCode.
        conjuntoConvidados.adicionarConvidadosSet("JOSE AMERICO", 1);
        conjuntoConvidados.adicionarConvidadosSet("DAVID JOSE", 2);
        conjuntoConvidados.adicionarConvidadosSet("JOAQUIM", 3);
        
        conjuntoConvidados.exibirConvidados();

        System.out.println("******Removendo*******");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);

         System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " Dentro do Set.");
      
          conjuntoConvidados.exibirConvidados();

    }

}
