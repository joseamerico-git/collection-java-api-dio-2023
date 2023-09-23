package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
    public void atualiarContatos(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void getContato(String nome){
        
        System.out.println(agendaContatoMap.get(nome));
    }

    public Integer pesquisarPorNome(String nome) {

        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatosMap agendaContatos = new AgendaContatosMap();
        agendaContatos.adicionarContato("JOSE AMERICO", 997668008);
        agendaContatos.adicionarContato("LUCIANO", 3333333);
        agendaContatos.adicionarContato("ZÉ ZÉ", 4444444);

        System.out.println("***********MEUS CONTATOS*************");
        agendaContatos.exibirContatos();
        agendaContatos.atualiarContatos("ZÉ ZÉ", 5555555);
        System.out.println("***********MEUS ATUALIZADOS*************");
        agendaContatos.removerContato("LUCIANO");
        agendaContatos.exibirContatos();    
    }

}
