# collection-java-api-dio-2023

Uma collection é uma estrutura de dados que servem para agrupar muitos elementos em uma única unidade que precisarão ser objetos

Uma collection pode ter coleções homogêneas ou heterogêneas bem parecido com array, mas com suas peculiaridades.
Colocamos muitos objetos dentro de uma variável.
Dentro de collection não existe tipos primitivos e somente classes ex. 

Não utiliza-se tipos primitivos

double x
e sim
Double x

Temos quatro grandes tipos de coleções: List(lista), Set(conjunto), Queue(fila) e Map(papa), a partir dessas interfaces temos muitas subclasses concretas que implementam várias formas diferentes de trabalhar com collections.

![Alt text](image.png)

Este pacote de Collection está dentro do java.util

# Generics Type

```
    public class Box{
        private Object object;
    
    public void set(Object object){
            this.object = object;
        }
        public void get(){
            return object;
        }
    }

    public clas Box<T>{
        private T t;

    public void set(T t){
        this.t =t;
    }
    public T get(){
        return t;

    
    }
}
```
# Nomes de parâmetros mais utilizados

E - Elemento (usado extensivamente pelo Java Collections FrameWork)
K - Chave
N - Número
T - Tipo
V - Valor
S, U, V etc... - 2º, 3º, 4º Tipos

# Vantagens em utilizar Collection em Java

- Segurança do tipo de dados ( garante utilização de objeto de tipo específico)
- Código mais legivel        (especificamos o tipo de dado esperado ou retornado)
- Detecta erros mais cedo    (o compilador verifica se estamos utlizando tipos corretos)
- Reutilização de códigos    (Permite criar classes genéricas)
- Melhor desempenho          (evita necessidade de conversões de tipos desnecessários cast)  

# Interfaces Comparable e Comparator

São interfaces que servem para ordenar coleção com base em um único elemento, como id, nome ou preço etc...

# Comparable 

compareTo()

-> única sequência de ordenação  package java.lang

-> afeta a classe principal


Class minhaClasse implements Comparable<MinhaClasse>
somos então obrigado a implementar os métodos compareTo(parametros..)

ou ordenar os elementos da lista utilizando o método Collections.sort(List)

# Comparator 

comare()

--> fornece múltiplas sequências de ordenação. id, nome, preco etc...

--> Não afeta a classe principal somos obrigados a criar uma outra classe para implementar para então poder utiliza-lo

Podemos ordenar os elementos da lista comparator usando o método Collection.sort(List, comparator)

# Collections

--> fornece operações comuns sort() reverse()

# List Interface

# Operções básicas com o List

Ver arquivos no pacote list.
A Interface List implemeta a Interfaces Iterable e Collections


O List pode conter elementos duplicados.

# Utilizando Set em Java

A Interface Set implementa a Interfaces Iterable e Collections

O Set não permite conter elementos duplicados, tamém não existe getIndex

Represena conjuntos 
Ex 

Baralho de cartas, porém de diferentes cartas....

A plataforma Java possui três implementações de Set

HashSet serão inseridos em forma aleatória.

TreeSet 

Para impedir o Set de admitir valores de id(s) iguais precisamos implementar subscrever os métodos abaixo na classe do objeto. 
```

@Override()
public boolean equals(Object c){
    if(this==c) return true;
    if(!(c instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
    
}
@Override
public int hashCode(){
    return Objects.hash(getCodigoConvite());
}
```

# HashSet --> não deixa a lista de Set organizada

# TreeSet --> deixa a lista de Set organizada

# Trabalhando com MAP

O Elemento map mapeia Chave e valor
O map não pode ter chaves duplicadas

.put --> adicionar
.get --> passar a chave para obter o valor

contains(chave)
size();

Caracteristicas principais náo herda de 
Iterable e collections, 
porem faz parte do framework collections in Java

O método put serve para adicionar ou atualizar os dados de um Map, passando a chave e o valor.

# Em Resumo:

List é uma interface referente a listas de objetos, essas listas tem característica de poder ter dados duplicados independente de serem iguais e de mesma instância.

Set são coleções que agregam dados sem duplica-los, ou seja, não existem dados iguais no Set, já são removidos por padrão.

Map são mapas de chave/valor, muito utilizado para guardar dados genéricos e de fácil acesso.

ArrayList – São Arrays que implementam a interface List e todos os seus métodos, dão a facilidade de manipular o seu tamanho a qualquer momento, ou seja, aumentão e diminuem seu tamanho dinamicamente (automaticamente). Não são sincronizados, para sincroniza-los é necessário fazer um wrapp como a seguir:

List<?> list = Collections.synchronizedList(new ArrayList<?>());


# Collections:
- São objetos que agrupam multiplos elementos dentro de uma única unidade.
- Garnte segurança do tipo de dados evitando erros de tipos
- As interfaces que implementam collection diretamente são List, Set, Queue

# List 

- Permite inserir elementos duplicados e garante a ordem de inserção











