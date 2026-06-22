package entities;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    // bloco de construtores
    public Produto(){

    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // blocos de getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotalEmEstoque(){

        return preco * quantidade;
    }
    // void é só para atualizar a variável da class
    // this referencia a quntidade da class produte e o quantidade dos colchete é a variável do programa principal
    public void adicionarProduto(int quantidade){

        this.quantidade += quantidade;
    }
    public void vendaDeProduto(int quantidade){

        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome +", valor por unidade: "
                    + String.format("%.2f",preco)
                    + ", quantidade no estoque: "
                    + quantidade + ", valor total do estoque: "
                    + String.format("%.2f",valorTotalEmEstoque());
    }
}
