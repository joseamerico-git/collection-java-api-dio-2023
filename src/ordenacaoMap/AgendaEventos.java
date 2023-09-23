package ordenacaoMap;

import java.net.CookieHandler;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate dataEvento, String nomeEvento, String atracao) {

        eventoMap.put(dataEvento, new Evento(nomeEvento, atracao));

    }

    // A implementação do map para fazer ordenação TreeMap
    public void exibirEventos() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento() {
        // Retorna um set com todas as keys
        // Set<LocalDate> datasSet = eventoMap.keySet();
        // Collection<Evento> values = eventoMap.values();
        // eventos.Map.get() como não sei a chave não

        LocalDate dataAtual = LocalDate.now();
        // Navegar no map para saber se o evento é da data atual
        // sabemos que o treeMap está em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        // Retoran um set que contém objetos do Map.entry conseguimos então ter uma
        // determinada key e uma determinada value interligadas
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximoEvento = entry.getValue();
                proximaData = entry.getKey();
              
                System.out.println("O próximo evento: " + proximoEvento + " Acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
       
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.SEPTEMBER,
        23), "Patati Patata", "Ensinando Java Map na Dio.me");

         agendaEventos.adicionarEvento(LocalDate.of(2021, Month.SEPTEMBER,
        23), "Super Man", "Estudando PHP na Dio.me");

         agendaEventos.adicionarEvento(LocalDate.now(), "A Vida de um Astronauta", "Estudando Java Map na Dio.me");

        agendaEventos.exibirEventos();
        System.out.println("******PRÓXIMO EVENTO********");
        agendaEventos.obterProximoEvento();

        System.out.println("******PROXIMO EVENTO");
        agendaEventos.obterProximoEvento();
    }

}
