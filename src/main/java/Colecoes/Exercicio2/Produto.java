package Colecoes.Exercicio2;

public class Produto {

    private String nome; //atributo
    private Float custoAquisicao;
    private Float valorVenda;

    public Produto(String nome, Float custoAquisicao, Float valorVenda) { // parämetros
        this.nome = nome;
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
    }

    public String getNomeProduto() {
        return String.format(nome+"\n -> Custo Aquisiçao R$ " +custoAquisicao+"\n -> Valor de Venda R$ "+valorVenda+"\n");

    }
}
