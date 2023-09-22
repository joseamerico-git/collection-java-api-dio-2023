package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    
    private List<Tarefa> tarefas;
    private String descriacao;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        // Método de adicionar
        this.tarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (t.getDescriacao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    @Override
    public String toString() {
        return "{" +
            " descricao='" + descriacao + "'" +
            "}";
    }

    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public void obeterDescricoesTarefas() {
        System.out.println(tarefas.toString());
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("TAREFA001");

        listaTarefa.adicionarTarefa("TAREFA001");
        listaTarefa.adicionarTarefa("PAGAR A CONTA DE LUZ");
        listaTarefa.removerTarefa("TAREFA001");

        System.out.println("O número total de tarefas é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obeterDescricoesTarefas();
    }

}
