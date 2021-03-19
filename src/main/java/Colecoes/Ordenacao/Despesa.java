package Colecoes.Ordenacao;

public class Despesa  implements Comparable<Despesa> { //Contrato de comparabilidade

    private String descricao; //atributo
    private Float valor;

     //construtor
    public Despesa(String descricao, Float valor) { // parämetros
        this.descricao = descricao;
        this.valor = valor;
    }


        public String getDescricaoDetalhada() {
            return String.format(descricao+" -> R$ " +valor);
        }

    public int compareTo (Despesa outraDespesa) {
        return this.descricao.compareToIgnoreCase(outraDespesa.descricao);
    }

    public Float getValor() {
        return valor;
    }
}


