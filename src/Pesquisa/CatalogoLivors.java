package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivors {
    private List<Livro> livrosList;
    

    public CatalogoLivors() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
     List<Livro> livorsPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livorsPorAutor.add(l);
                }
            }
      }
        return livorsPorAutor;
    }


    public List<Livro> pesquisaPOrIntervaloAnos(int anoInicial, int anoFinal){
        
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }   
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivors catalogoLivors = new CatalogoLivors();
        catalogoLivors.adicionarLivro("Livro 1", "Autor 1", 2020);

         catalogoLivors.adicionarLivro("Livro 1", "Autor 2", 2021);

         catalogoLivors.adicionarLivro("Livro 2", "Autor 2", 2022);

          catalogoLivors.adicionarLivro("Livro 3", "Autor 3", 2023);

           catalogoLivors.adicionarLivro("Livro 4", "Autor 4", 1994);

           //System.out.println(catalogoLivors.pesquisarPorAutor("Autor 1"));
           //System.out.println(catalogoLivors.pesquisaPOrIntervaloAnos//(2020, 2021));
           System.out.println(catalogoLivors.pesquisaPorTitulo("Livro 1"));

    }
}


