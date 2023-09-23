package pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    // Multiplicar o preço e a quantidade de produtos para retornar o valor total em
    // R$ no estoque.
    public double CalculavalorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

   

     public Produto obProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }

        }
        return produtoMaisCaro;
    }




    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        System.out.println("******EXIBINDO PRODUTOS******\n");
        estoque.exibirProdutos();
        System.out.println("******CADASTRANDO PRODUTOS******\n");
        estoque.adicionarProduto(1L, "CERVEJA HEINEKEN", 10, 5.00);

        estoque.adicionarProduto(2L, "CERVEJA SKOL", 20, 3.0);

        estoque.adicionarProduto(3L, "CERVEJA CONTI", 1, 2.5);

        estoque.adicionarProduto(4L, "CHOOP CONTI 20L", 1, 100.0);

        System.out.println("******EXIBINDO PRODUTOS******\n");
        estoque.exibirProdutos();

        System.out.println("******VALOR EM R$ NO ESTOQUE******\n");

        System.out.println(estoque.CalculavalorTotalEstoque());
        
        System.out.println("******PRODUTO MAIS CARO DO ESTOQUE******\n");

        System.out.println(estoque.obProdutoMaisCaro());

    


    }
}
