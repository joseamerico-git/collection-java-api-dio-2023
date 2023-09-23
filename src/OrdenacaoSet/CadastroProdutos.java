package OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public void exibirProdutoPorNome() {
        System.out.println(produtoSet);
    }

    public Set<Produto> exibirPrecoPorProduto(double preco) {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }

    public Set<Produto> exibiProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println("CADASTRAND PRODUTOS\n");
        cadastroProdutos.adicionarProduto(1L, "ARROZ", 19.90, 20);
        cadastroProdutos.adicionarProduto(1L, "FEIJÃO", 19.90, 20);
        cadastroProdutos.adicionarProduto(2L, "CREME DENTAL", 19.90, 20);
        cadastroProdutos.adicionarProduto(3L, "CAFÉ DA BARONEZA", 19.90, 20);
        System.out.println("\nORDENANDO POR PREÇO\n");
        System.out.println(cadastroProdutos.exibiProdutosPorPreco());
         System.out.println("\nORDENANDO POR NOME\n");
        cadastroProdutos.exibirProdutoPorNome();
    }

}
