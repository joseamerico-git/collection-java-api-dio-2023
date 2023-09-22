package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPessoaPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("JOSE", 40, 1.64);
        ordenacaoPessoa.adicionarPessoa("ALINE", 37, 1.63);
        ordenacaoPessoa.adicionarPessoa("JOAQUIM1", 16, 1.65);
        ordenacaoPessoa.adicionarPessoa("DAVID JOSE", 11, 1.50);
        ordenacaoPessoa.adicionarPessoa("JOAO PEDRO", 2, 0.70);

        System.out.println("**********LISTA ORDEM DEFAULT**************\n");
        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println("*****LISTA ORDENADA POR DIDADE*******\n");
        System.out.println(ordenacaoPessoa.ordenarPessoaPorIdade());
        System.out.println("*****LISTA ORDENADA POR ALTURA*******\n");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}