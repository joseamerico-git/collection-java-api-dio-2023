package Set;

import java.util.HashSet;
import java.util.Set;

public class AgendaConstatos {
    private Set<Contato> contatoSet;

    public AgendaConstatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();

    }

    public AgendaConstatos() {
         this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        contatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizaContato(String nome, int novoNumero) {
        Contato contatuAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatuAtualizado = c;
                break;
            }
        }
        return contatuAtualizado;
    }

    public static void main(String[] args) {
        AgendaConstatos agendaConstatos = new AgendaConstatos();
        agendaConstatos.exibirContatos();

        agendaConstatos.adicionarContato("JOSE AMERICO", 11111111);
        agendaConstatos.adicionarContato("ALINE", 11111111);
        agendaConstatos.adicionarContato("IVONE", 11111111);
        agendaConstatos.adicionarContato("JOAQUIM", 11111111);
        agendaConstatos.exibirContatos();
        agendaConstatos.atualizaContato("IVONE", 55555555);
        System.out.println("DADOS ATUALIZADO COM SUCESSO!");
        agendaConstatos.exibirContatos();
        System.out.println(agendaConstatos.pesquisarPorNome("ALINE"));
    }

}
